package com.example.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Counsel {
  @Id @GeneratedValue
  @Column(name = "COUNSEL_ID")
  private Long id;

  private String email;
  private String context;
}
