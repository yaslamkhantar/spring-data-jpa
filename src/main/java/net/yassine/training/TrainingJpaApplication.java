package net.yassine.training;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.yassine.training.ctrl.JoueurWeb;
import net.yassine.training.dao.JoueurRepository;
import net.yassine.training.entities.Joueur;

@SpringBootApplication
public class TrainingJpaApplication  {
	private JoueurRepository joueurrepository;
	private JoueurWeb jw;
	public TrainingJpaApplication(JoueurRepository joueurrepository) {
		this.joueurrepository=joueurrepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(TrainingJpaApplication.class, args);
	}

	@Bean
	CommandLineRunner start() {
		return args ->{
			joueurrepository.save(new Joueur("M899","Daniel","Alves",44,"brazil"));
			joueurrepository.save(new Joueur("K99","messi","lionel",38,"Argentine"));
			joueurrepository.save(new Joueur("PP897","cristiano","ronaldo",40,"portugal"));
			joueurrepository.save(new Joueur("Kpo8","karim","benzama",44,"france"));
			joueurrepository.save(new Joueur("mpo55","ali","jaber",26,"united-kingdom"));
			joueurrepository.save(new Joueur("QLP88","yassine","Alves",24,"Maroc"));
		};
	}

}
