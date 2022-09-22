package io.practiv.starter.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.practiv.starter.model.User;
import io.practiv.starter.service.UserService;

import javax.inject.Inject;

@Controller("/users")
public class UserController {
  @Inject
  private UserService userService;

  @Get("/{name}")
  public User getUser(@PathVariable String name) {
    return userService.getUser(name);
  }
}
