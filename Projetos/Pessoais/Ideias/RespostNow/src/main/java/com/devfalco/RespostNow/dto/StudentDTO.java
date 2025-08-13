package com.devfalco.RespostNow.dto;

import com.devfalco.RespostNow.model.STATUS;

public record StudentDTO(String email, String username,String password, String confirmPassword) {
}