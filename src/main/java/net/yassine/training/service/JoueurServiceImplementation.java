package net.yassine.training.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.yassine.training.dao.JoueurRepository;
import net.yassine.training.entities.Joueur;



@Service
public class JoueurServiceImplementation implements JoueurService {
	@Autowired
	private JoueurRepository joueurrepository;
	
	@Transactional
	@Override
	public void addjoueur() {
		// TODO Auto-generated method stub
	

	
	

	

	
	
	
	}

}
