package com.vtech.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{
public UserNotFoundException(Long id){
    super("Could not find the user with user id "+id);
}
}
