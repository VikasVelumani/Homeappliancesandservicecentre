package com.example.demo.repoisitory;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Appliances;

public interface AppRepoistory extends JpaRepository<Appliances, Integer>
{

	
}
