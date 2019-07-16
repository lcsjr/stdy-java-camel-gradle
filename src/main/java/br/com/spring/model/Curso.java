package br.com.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter

@Entity
public class Curso {

	@Id
	private int id;
	private String nome;
	private String descricao;
}
