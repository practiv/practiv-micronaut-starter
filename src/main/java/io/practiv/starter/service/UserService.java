package io.practiv.starter.service;

import io.micronaut.context.annotation.Value;
import io.practiv.starter.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;
import java.util.Objects;

@Singleton
public class UserService {
  private static final Logger logger = LoggerFactory.getLogger(UserService.class);

  @Value("${app.greeting}")
  private String greeting;

  @Value("${app.secret-key}")
  private String secretKey;

  public User getUser(String name) {
    // Don't log secrets in prod or any other environment. Example only.
    logger.info("Secret key: {}", secretKey);

    return new User()
        .name(name)
        .greeting(greeting + name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greeting);
  }
}
