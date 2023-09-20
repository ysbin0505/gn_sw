package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class ScheduleReview {
  @Id @GeneratedValue
  @Column(name = "SCHEDULE_REVIEW_ID")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Schedule schedule;

  private String contents;
  private Date regDate;
}