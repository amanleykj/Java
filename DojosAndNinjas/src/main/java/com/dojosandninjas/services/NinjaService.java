package com.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.dojosandninjas.models.Ninja;
import com.dojosandninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepo ninjaRepo;
	
	public Ninja register(Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return null;
		}
		return ninjaRepo.save(ninja);	
	}
	
	public Ninja getOneNinja(Long id) {
		Optional<Ninja> ninja = ninjaRepo.findById(id);
		if(ninja.isPresent()) {
			return ninja.get();
		}
		else {
			return null;
		}
	}
	
	public List<Ninja> getAllNinjas() {
		return ninjaRepo.findAll();
	}

}
