package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.demo.modelproject.Modled;
import com.example.demo.repoisitory.AppRepository;

@Service
public class Serviced {
	@Autowired
	AppRepository mr;
	public Modled postDetails(Modled ms) {
		return mr.save(ms);
	}
	public List<Modled> postnDetails(List<Modled> ms){
		return (List<Modled>)mr.saveAll(ms);
	}
	
	
	public Modled putDetails(Modled ms) {
		return mr.saveAndFlush(ms);
	}
	public String changeinfobyid(int id,Modled ms) {
		if(mr.existsById(id)) {
			mr.saveAndFlush(ms);
			return "updated";
		}
		return "invalid";
	}
	public void deleteDetails(Modled ms) {
		 mr.delete(ms);
	}
	public void deletebyId(int id) {
		mr.deleteById(id);
	}
	public List<Modled> getDetails(){
		return mr.findAll();
	}
			public List<Modled> sortinginfo(String s){
				return mr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
			}
			public List<Modled> getbypage(int pagno,int pgsize){
				Page<Modled> p=mr.findAll(PageRequest.of(pagno, pgsize));
				return p.getContent();
			}
			public List<Modled>getinfos(int s){
				return mr.getstudentinfor(s);
			}
		     public int DeleteByQuery(int bookingid){
		    	 return mr.deleteBookById(bookingid);
		     }
		     public int UpdateByQuery(int newid,int oldid) {
		    	 return mr.updateBookById(newid,oldid);
		     }		
}