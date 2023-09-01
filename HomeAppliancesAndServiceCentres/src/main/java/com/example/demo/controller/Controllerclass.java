package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.modelproject.Modled;
import com.example.demo.service.Serviced;

@RestController
public class Controllerclass {
	@Autowired
	Serviced me;
	
	
	@PostMapping("post")
	public Modled post(@RequestBody Modled ms) {
		return me.postDetails(ms);
	}
	@PostMapping("post1")
	public List<Modled> postn(@RequestBody List<Modled> ms){
		return me.postnDetails(ms);
	}
	
	@PutMapping("put")
	 public Modled put(@RequestBody Modled ms) {
		return me.putDetails(ms);
	}
	@PutMapping("put1/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Modled ms) {
		return me.changeinfobyid(id ,ms);
	}
	@DeleteMapping("delete")
	public String delete(@RequestBody Modled ms) {
		me.deleteDetails(ms);
		return "Deletion Succees";
	}
	@DeleteMapping("delete1/{id}")
	public void deletid(@PathVariable int id)
{
		 me.deletebyId(id);
	}
		@GetMapping("sort/{str}")
		public List<Modled>getsortinfo(@PathVariable String str){
			return me.sortinginfo(str);
		}
		@GetMapping("paging/{pageno}/{pagesize}")
		public List<Modled> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize){
			return me.getbypage(pageno, pagesize);
			
		}
		@GetMapping("selectjpql/{bookingid}")
		List<Modled >jpql(@PathVariable int bookingid){
			return me.getinfos(bookingid);
		}
		
	 	@DeleteMapping("deletejpql/{bookingid}")

	 	public String DeleteDetailsByQuery(@PathVariable int bookingid) {
	 		return me.DeleteByQuery(bookingid)+"Deleted Successfully";
	 	}
	 	
	 
	 	@PutMapping("updatejpql/{newid}/{oldid}")

	 	public String UpdateDetailsByQuery(@PathVariable int newid, @PathVariable int oldid) {
	 		return me.UpdateByQuery(newid,oldid)+"Updated Successfully";
	 	}
	@GetMapping("get")
	public List<Modled> get(){
		return me.getDetails();
	}
	

}