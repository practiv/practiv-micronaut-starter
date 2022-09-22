package io.practiv.starter.controller;

import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static io.restassured.RestAssured.given;

@MicronautTest
class UserControllerTest {
  @Inject
  private EmbeddedServer server;

  @BeforeEach
  public void setUp() {
    RestAssured.port = server.getPort();
    RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
  }

  @Test
  void getUser() {
    given()
        .when()
        .get("/users/John")
        .then()
        .statusCode(200)
        .body("name", Matchers.equalTo("John"))
        .body("greeting", Matchers.equalTo("Hello from junit tests, John"));
  }
}
