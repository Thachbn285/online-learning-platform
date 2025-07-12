package com.study.online_learning_platform.Enum;

public enum RoleEnum {
    ADMIN("Admin"),
    TEACHER("Teacher"),
    STUDENT("Student");

    private final String roleName;

    RoleEnum(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}
