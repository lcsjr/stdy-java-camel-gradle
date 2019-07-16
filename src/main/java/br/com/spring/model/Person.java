package br.com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Person {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PERSON_ID")
	private long id;
	
	@Column(name="FIRST_NAME")
	private String firtName;

	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="AGE")
	private Integer age;
}
