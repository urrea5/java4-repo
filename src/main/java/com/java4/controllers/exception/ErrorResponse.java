package com.java4.controllers.exception;

public record ErrorResponse(Integer status, String error, String message) {
}
