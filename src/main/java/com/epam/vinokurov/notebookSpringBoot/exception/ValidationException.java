package com.epam.vinokurov.notebookSpringBoot.exception;

public class ValidationException extends Exception{
    private String message;

    public ValidationException(String message) {}

    public String getMassage() {
        return message;
    }
}
