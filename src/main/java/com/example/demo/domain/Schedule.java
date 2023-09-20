package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Schedule {

  @Id @GeneratedValue
  @Column(name = "SCHEDULE_ID")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Member member;

  @OneToMany(mappedBy = "schedule")
  private List<ScheduleReview> scheduleReviews = new ArrayList<>();

  @OneToMany(mappedBy = "schedule")
  private List<Plan> plans = new ArrayList<>();

  private String scheduleTitle;
  private Date fSchedule;
  private Date lSchedule;

  private String Description;
  private int recommended;


  //==비즈니스 로직==//

}
