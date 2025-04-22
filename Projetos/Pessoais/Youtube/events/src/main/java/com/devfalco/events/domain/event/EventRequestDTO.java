package com.devfalco.events.domain.event;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public record EventRequestDTO(String title, String description, Long date, String city, String state, String eventUrl, MultipartFile image, Boolean remote ) {
  
}
