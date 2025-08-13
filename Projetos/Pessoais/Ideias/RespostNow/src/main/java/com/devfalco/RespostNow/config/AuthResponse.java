package com.devfalco.RespostNow.config;

import com.devfalco.RespostNow.model.Student;

public record AuthResponse(Student student, String token) {
}