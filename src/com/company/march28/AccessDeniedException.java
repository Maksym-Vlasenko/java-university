package com.company.march28;

import com.company.february27.Person;

public class AccessDeniedException extends RuntimeException {
    private Person subject;

    public AccessDeniedException(String message, Person subject) {
        super(message);
        this.subject = subject;
    }

    public AccessDeniedException(String message, Throwable cause, Person subject) {
        super(message, cause);
        this.subject = subject;
    }

    public Person getSubject() {
        return subject;
    }
}
