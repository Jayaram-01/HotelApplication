package com.hotel.v2soru.entity;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Admin {
	private long adminId;
	private String adminName;
	private String adminEmail;
	private String adminPassword;
	private long adminContact;
	
	private List<User>managedUsers;
	private List<Order>orders;

}
