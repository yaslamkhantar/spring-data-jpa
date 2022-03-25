package net.yassine.training.ctrl;

import org.springframework.stereotype.Controller;

import net.yassine.training.service.JoueurService;

@Controller
public class JoueurWeb {

	private JoueurService joueurservice;
	public JoueurWeb(JoueurService joueurservice) {
		this.joueurservice=joueurservice;
		
	}
	public void addlistjoueur() {
		joueurservice.addjoueur();
	}
}
