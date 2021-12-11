package com.atexo.model;

public class Carte {

	private final COULEUR couleur;
	private int valeur;
	

	public Carte(int valeur) {
		this.couleur = null;
		this.valeur = valeur;
	}

	public Carte(COULEUR couleur, int valeur) {
		if (valeur >= 1 && valeur <= 13) {
			this.valeur = valeur;
			this.couleur = couleur;
		}else {
			throw new IllegalArgumentException("La valeur doit etre entre 1 et 13");
		}

	}

	public COULEUR getCouleur() {
		return couleur;
	}

	public int getValeur() {
		return valeur;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		switch (valeur) {
		case 1:
			stringBuilder.append("As");
			break;
		case 11:
			stringBuilder.append("Valet");
			break;
		case 12:
			stringBuilder.append("Dame");
			break;
		case 13:
			stringBuilder.append("Roi");
			break;
		default:
			stringBuilder.append(valeur);
		}
		return stringBuilder.toString();
	}

}
