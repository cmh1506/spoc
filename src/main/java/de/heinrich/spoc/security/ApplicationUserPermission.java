package de.heinrich.spoc.security;

public enum ApplicationUserPermission {
    STAMMDATEN("stammdaten:write"),
    KUNDE("kunde:write");


    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
