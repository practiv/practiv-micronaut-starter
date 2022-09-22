package io.practiv.starter.service;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.practiv.starter.model.User;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@MicronautTest
class UserServiceTest {
  @Inject
  private UserService userService;

  @Test
  void getUser() {
    User john = userService.getUser("John");

    assertAll(
        () -> assertThat(john.getName()).isEqualTo("John"),
        () -> assertThat(john.getGreeting()).isEqualTo("Hello from junit tests, John")
    );
  }
}
