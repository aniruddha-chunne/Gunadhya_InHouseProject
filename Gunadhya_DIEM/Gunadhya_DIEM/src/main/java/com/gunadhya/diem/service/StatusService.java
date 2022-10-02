package com.gunadhya.diem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gunadhya.diem.Dao.StatusEnityRepository;
import com.gunadhya.diem.entities.StatusEntity;

@Service
public class StatusService 
{
		@Autowired
		private StatusEnityRepository statusEnityRepository;
		
	// get status of all users
	 public List<StatusEntity> getAllStatusEntity()
	{
		List<StatusEntity> list =(List<StatusEntity>) statusEnityRepository.findAll();
		System.out.println(list);
		return list;
	}
	

	
	//get status of single user using id
	public StatusEntity getStatusEntityById(int Id)
	{
		StatusEntity findById = null;
		
			try
			{
				findById = statusEnityRepository.findById(Id);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return  findById;
	}


	
	//adding user
	public StatusEntity addStatusEntity(StatusEntity statusEntity)
	{
		StatusEntity statusEntity2 = statusEnityRepository.save(statusEntity);
		return statusEntity2;
	}
	

	public void deleteStatusEntity(int Id)
	{
		statusEnityRepository.deleteById(Id);
	}

	public void updateStatusEntity(StatusEntity statusEntity, int Id) 
	{
		
		statusEntity.setId(Id);
		statusEnityRepository.save(statusEntity);
		
	}
	

	
}
