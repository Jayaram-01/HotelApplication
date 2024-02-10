package com.hotel.v2soru.entity;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter

public class Order {
	private long orderId;
	private String status;
	private List<FoodItems>foodItems;

}
