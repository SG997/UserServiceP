package app.com.dao;

public enum UserType {
    UNKNOWN(-1),
    SELF_EMPLOYED(1),
    // ...
    STUDENT(2);

    public final int type;

    private UserType(int label) {
        this.type = label;
    }
}
