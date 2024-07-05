package com.solvd.carina.demo.emailVerification.enums;

public enum FoldersEnum {
    ARCHIVE("ARCHIVE"), DELETED("DELETED"), DRAFTS("DRAFTS"), INBOX("INBOX"), JUNK("JUNK"), NOTES("NOTES"), SENT("SENT");

    private final String emailFolders;

    FoldersEnum(String folderName) {
        this.emailFolders = folderName;
    }

    public String getEmailFolders() {
        return emailFolders;
    }
}
