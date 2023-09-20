package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter @Setter
public class Plan {
  @Id @GeneratedValue
  @Column(name = "PLAN_ID")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Schedule schedule;

  private Date date;
  private int dayNumber;
  private String description;
}
