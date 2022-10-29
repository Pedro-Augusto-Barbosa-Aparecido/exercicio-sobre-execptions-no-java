package com.pedro.exceptions.unchecked;

public class ProjectNameNotExist extends RuntimeException {
    public ProjectNameNotExist() {
    }

    public ProjectNameNotExist(String message) {
        super(message);
    }

    public ProjectNameNotExist(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectNameNotExist(Throwable cause) {
        super(cause);
    }

    public ProjectNameNotExist(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
