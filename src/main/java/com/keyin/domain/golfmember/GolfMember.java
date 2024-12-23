package com.keyin.domain.golfmember;

import com.keyin.domain.golftournament.Tournament;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;
    private LocalDate startDate;
    private Integer membershipDuration;


    public Member(String name, String address, String email, String phone,
                      LocalDate startDate, Integer membershipDuration) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.startDate = startDate;
        this.membershipDuration = membershipDuration;
    }

    public Member(String name, String address, String email, String phone,
                      LocalDate startDate, Integer membershipDuration,
                      Set<Tournament> tournament) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.startDate = startDate;
        this.membershipDuration = membershipDuration;
        this.tournament = tournament;
    }


    public Long getId() {
        return id;}
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;}
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;}
    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;}
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;}
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getStartDate() {
        return startDate;}
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Integer getMembershipDuration() {
        return membershipDuration;}
    public void setMembershipDuration(Integer membershipDuration) {
        this.membershipDuration = membershipDuration;
    }

    @ManyToMany(mappedBy = "participatingMembers")
    private Set<Tournament> tournament = new HashSet<>();


