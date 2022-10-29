package com.pedro.exceptions.checked;

public class NoteInsufficient extends Exception {
    public NoteInsufficient() {
        super();
    }

    public NoteInsufficient(String message) {
        super(message);
    }

    public NoteInsufficient(String message, Throwable cause) {
        super(message, cause);
    }

    public NoteInsufficient(Throwable cause) {
        super(cause);
    }

    protected NoteInsufficient(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
