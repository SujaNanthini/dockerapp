package com.dockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerAppController {
   @GetMapping(path = "/getMsg")
   public String getOutput() {
	   return "Hello Onesoft";
   }

}
