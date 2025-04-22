package com.devfalco.docker_manager.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devfalco.docker_manager.services.DockerService;
import com.github.dockerjava.api.model.Container;

@RestController
@RequestMapping("/api/containers")
public class DockerContainersControllers {
  private final DockerService dockerService;

  public DockerContainersControllers(DockerService dockerService){
    this.dockerService = dockerService;
  }


  @GetMapping("")
  public List<Container> listContainers(@RequestParam(required = false, defaultValue = "true") boolean showall){
    return dockerService.listContainers(showall);
  }

  @PostMapping("/{id}/start")
  public void startContainer(@PathVariable String id){
    dockerService.startContainer(id);
  }
  @PostMapping("/{id}/stop")
  public void stopContainer(@PathVariable String id){
    dockerService.stopContainer(id);
  }
  @PostMapping("/{id}")
  public void deleteContainer(@PathVariable String imageName){
    dockerService.deleteContainer(imageName);
  }
  @PostMapping("")
  public void createContainer(@PathVariable String imageName){
    dockerService.createContainer(imageName);
  }
}
