package com.capgemini.HotelService.entity;

import org.hibernate.annotations.Collate;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "hotels")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {
	
	@Id
	private String id;
	private String hotelName;
	private String location;
	private String about;
}
