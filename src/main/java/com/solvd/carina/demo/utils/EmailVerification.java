package com.solvd.carina.demo.utils;

import com.zebrunner.carina.utils.R;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;
import java.util.Properties;

import static com.solvd.carina.demo.emailVerification.enums.FoldersEnum.INBOX;

public class EmailVerification {
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    private Session getIMAPSession() {
        // Set up the properties for the IMAP session
        Properties properties = new Properties();
        properties.put("mail.store.protocol", "imap");
        properties.put("mail.imap.host", R.EMAIL.get("mail.imap.host"));
        properties.put("mail.imap.port", R.EMAIL.get("mail.imap.port"));
        properties.put("mail.imap.ssl.enable", "true");

        // Get the session object
        Session session = Session.getInstance(properties);
        return session;
    }

    public String readEmails(String host, String user, String password) {
        String emailID = "";
        try {
            // Connect to the IMAP store
            Store store = getIMAPSession().getStore("imap");
            store.connect(host, user, password);

            // Open the junk email folder
            Folder junkEmail = store.getFolder(INBOX.getEmailFolders());
            junkEmail.open(Folder.READ_ONLY);

            // Fetch unseen messages from the inbox
            Message[] messages = junkEmail.getMessages();

            // Process each message
            for (Message message : messages) {
                LOGGER.info("Email Subject: " + message.getSubject());
                emailID = message.getSubject().replace("SendTestEmail.com - Testing Email ID: ", "");
                LOGGER.info("From: " + InternetAddress.toString(message.getFrom()));
            }

            // Close the inbox and store
            junkEmail.close(false);
            store.close();

        } catch (MessagingException e) {
            LOGGER.error("Exception reading emails: " + e.getMessage());
        }
        return emailID;
    }
}
