package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SpotComment {
  @Id @GeneratedValue
  @Column(name = "SPOT_COMMENT_ID")
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  private Spot spot;


}