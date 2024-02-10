package com.hotel.v2soru.entity;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DeliveryBoy {
	private long deliveryBoyId;
	private String deliveryBoyName;
	private long deliveryBoyContact;
	private List<Order>orders;
	private String deliveryBoyStatus;

}
