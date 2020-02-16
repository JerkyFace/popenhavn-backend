package com.golie.popenhavn.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
public class User {
  private String id;
  private String email;
  private String userName;


  public User(String email, String userName) {
    this.id = UUID.randomUUID().toString();
    this.email = email;
    this.userName = userName;
  }

  public void update(String email, String userName) {
    if (!"".equals(email))
      this.email = email;

    if (!"".equals(userName))
      this.userName = userName;
  }
}