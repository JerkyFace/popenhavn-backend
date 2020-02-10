package com.golie.popenhavn.core.User;

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
  private String password;

  public User(String email, String userName, String password){
    this.id = UUID.randomUUID().toString();
    this.email = email;
    this.userName = userName;
    this.password = password;
  }

  public void update(String email, String userName, String password){
    if(!"".equals(email))
      this.email = email;

    if(!"".equals(userName))
      this.userName = userName;

    if(!"".equals(password))
      this.password = password;
  }
}