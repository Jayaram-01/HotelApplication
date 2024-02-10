package com.hotel.v2soru.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FoodItems {
	private long foodId;
	private String foodName;

	private double foodCost;

}
