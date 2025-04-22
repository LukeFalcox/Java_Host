package com.devfalco.docker_manager.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.docker_manager.services.DockerService;
import com.github.dockerjava.api.model.Image;

@RestController
@RequestMapping("/api/images")
public class DockerImagesControllers {
  private final DockerService dockerService;

  public DockerImagesControllers(DockerService dockerService){
    this.dockerService = dockerService;
  }

  @GetMapping("")
  public List<Image> listImages(){
    return dockerService.listImages();
  }
  @GetMapping("/filters")
  public List<Image> listImages(@RequestParam(required = false, defaultValue = "image-") String filtername){
    return dockerService.filterImages(filtername);
  }
}
