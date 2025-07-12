package com.study.online_learning_platform.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "DISTRICT")
public class DistrictEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(name = "districtName")
    private String districtName;
    @Column(name = "districtCode")
    private String districtCode;
    @OneToMany
    private String AwardId;
}
