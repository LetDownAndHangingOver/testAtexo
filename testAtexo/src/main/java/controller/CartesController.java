package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atexo.model.COULEUR;
import com.atexo.model.Carte;
import com.atexo.utils.CartesUtils;

@RestController
public class CartesController {
	
	@Autowired
	CartesUtils cartesUtils;
	
	@GetMapping(value="/couleurAleatoire", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<COULEUR> couleurAleatoire(){
		System.out.println("test");
		return cartesUtils.couleurAleatoire();
	}
	
	@GetMapping(value="/dixCartesAleatoires")
	public List<Carte> dixCartesAleatoires(){
		return cartesUtils.dixCartesAleatoire();
	}
	
	@GetMapping(value="/disCartesAleatoires")
	public List<Carte> valeursAleatoires(){
		return cartesUtils.valeursAleatoire();
	}

}
