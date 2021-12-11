package com.atexo.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atexo.model.COULEUR;
import com.atexo.model.Carte;

@Service
public class CartesUtils {

	public List<COULEUR> couleurAleatoire() {
		List<COULEUR> listeCouleur = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			listeCouleur.add(COULEUR.values()[i]);
		}
		Collections.shuffle(listeCouleur);
		return listeCouleur;
	}

	public List<Carte> valeursAleatoire() {
		List<Carte> listeValeur = new ArrayList<Carte>();
		for (int i = 1; i < 14; i++) {
			Carte c = new Carte(i);
			listeValeur.add(c);
		}
		Collections.shuffle(listeValeur);
		return listeValeur;
	}

	public List<Carte> dixCartesAleatoire() {
		List<Carte> listeValeur = valeursAleatoire();
		for (int i = 1; i <= 3; i++) {
			listeValeur.remove(i);
		}

		return listeValeur;
	}

}
