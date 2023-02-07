package com.bootcamp.bootCampDay2.persona;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class PersonaLombok {
	
	private String name;
	private int age;
}
