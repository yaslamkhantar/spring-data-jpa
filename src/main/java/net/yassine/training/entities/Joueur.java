package net.yassine.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Joueur {
	
	@Id
	private String matricule;
	private String firstname;
	private String lastname;
	private int age;
	private String nationalite;

}
