package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Appliances;
import com.example.demo.repoisitory.AppRepoistory;

@org.springframework.stereotype.Service
public class AppliancesService {
@Autowired
AppRepoistory app;
public Appliances saveinfo(Appliances ae) {
	return app.save(ae);
}
public List<Appliances> savedetails(List<Appliances> ae) {
	return (List<Appliances>)app.saveAll(ae);
}
public List<Appliances> showinfo(){
	return app.findAll();
}
public Optional<Appliances> showbyid(int id){
	return app.findById(id);
}
public Appliances changeinfo(Appliances ae) {
	return app.saveAndFlush(ae);
}
public void deleteinfo(Appliances ae) {
	app.delete(ae);
	
}
public void deleteid(int id) {
	app.deleteById(id);
}
}