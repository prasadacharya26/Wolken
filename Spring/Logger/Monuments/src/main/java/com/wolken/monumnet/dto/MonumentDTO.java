package com.wolken.monumnet.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MonumentDTO {
	private String name;
	private short year;
	private short height;
	private String location;
	private float entryFee; 
}
