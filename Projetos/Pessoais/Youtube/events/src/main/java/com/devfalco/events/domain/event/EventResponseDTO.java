package com.devfalco.events.domain.event;

import java.util.Date;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public record EventResponseDTO(UUID id,String title, String description, Date date, String city, String state, String eventUrl, String image, Boolean remote ) {
  
}
