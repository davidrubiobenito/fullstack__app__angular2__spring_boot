package com.linkedin.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.linkedin.learning.entity.RoomEntity;
import com.linkedin.learning.repository.RoomRepository;

@Component
public class H2Bootstrap implements CommandLineRunner {

	@Autowired
	RoomRepository roomRespository;
	
		
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Boostraping data: ");
		
		roomRespository.save(new RoomEntity(405, "200"));
		roomRespository.save(new RoomEntity(406, "220"));
		roomRespository.save(new RoomEntity(407, "250"));
		
		Iterable<RoomEntity> itr = roomRespository.findAll();
		
		System.out.println("Printing out data: ");
		for(RoomEntity room : itr){
			System.out.println(room.getRoomNumber());
		}
	}

}
