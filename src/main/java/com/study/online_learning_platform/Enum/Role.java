package com.study.online_learning_platform.Enum;

public enum Role {
    ADMIN("Admin"),
    TEACHER("Teacher"),
    STUDENT("Student");

    private final String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
