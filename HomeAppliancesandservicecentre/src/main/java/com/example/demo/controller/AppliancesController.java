package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Appliances;
import com.example.demo.service.AppliancesService;

@RestController
public class AppliancesController {
	@Autowired
	AppliancesService awe;
@PostMapping("disp")
public Appliances create(@RequestBody Appliances a) {
	return awe.saveinfo(a);
}

@PostMapping("addappliances")
public List<Appliances> addndetails(@RequestBody List<Appliances> a){
	return awe.savedetails(a);
}

@GetMapping("show")
public List<Appliances> getApplainces(){
return awe.showinfo();
}
@GetMapping("showbyid/{id}")
	public Optional<Appliances> showid(@PathVariable int id){
		return awe.showbyid(id);
	}

@PutMapping("update")
public Appliances modify(@RequestBody Appliances a) {
	return awe.changeinfo(a);
}

@DeleteMapping("deletedet")
public String del(@RequestBody Appliances a) {
	awe.deleteinfo(a);
	return "deleted";
}

@DeleteMapping("deletebyid/{id}")
public String deted(@PathVariable int id){
	awe.deleteid(id);
	return "deleted";
}
}
