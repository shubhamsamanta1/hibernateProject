package com.projectA.hibernateProject.formEntity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;
import org.yaml.snakeyaml.events.Event;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_form")
public class formEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int ID;

    public String fullName;

    public String address;

    public String city;

    public String state;

    public String country;

    public Long pincode;

    public Long contact;

    public Date DOB;

    @Column(unique = true)
    public String govID;

    @UpdateTimestamp
    public LocalDateTime timestamp;



}
