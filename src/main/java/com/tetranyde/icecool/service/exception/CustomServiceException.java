package com.tetranyde.icecool.service.exception;

public class CustomServiceException extends RuntimeException {

    private int status;
    private String message;

    public CustomServiceException(int status, String message){
        super(message);
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
