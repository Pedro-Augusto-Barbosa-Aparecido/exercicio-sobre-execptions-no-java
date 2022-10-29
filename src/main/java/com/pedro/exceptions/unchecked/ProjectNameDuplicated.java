package com.pedro.exceptions.unchecked;

public class ProjectNameDuplicated extends RuntimeException {
    public ProjectNameDuplicated() {
        super();
    }

    public ProjectNameDuplicated(String message) {
        super(message);
    }

    public ProjectNameDuplicated(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectNameDuplicated(Throwable cause) {
        super(cause);
    }

    protected ProjectNameDuplicated(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static class ProjectNameNotExist {
    }
}
