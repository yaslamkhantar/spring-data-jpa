package net.yassine.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.yassine.training.entities.Joueur;
@RepositoryRestResource
public interface JoueurRepository extends JpaRepository<Joueur,String> {

}
