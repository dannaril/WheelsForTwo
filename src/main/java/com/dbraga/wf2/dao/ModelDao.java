package com.dbraga.wf2.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import com.dbraga.wf2.entities.Model;

public class ModelDao extends GenericDAO<Long, Model>{
	
	public ModelDao() {
	}
	
	public List<Model> getAll(){
		List<Model> modelsList = new ArrayList<Model>();
		StringBuilder bd = new StringBuilder();
		bd.append("FROM Model m ");
		bd.append("INNER JOIN FETCH m.brand ");
		bd.append("LEFT JOIN FETCH m.category ");
		bd.append("ORDER BY m.model ");
		
		
		TypedQuery<Model> query = manager.createQuery(bd.toString(), Model.class);		
		modelsList = query.getResultList();
		
		return modelsList;
	}
	
	public List<String> getAllYears(){
		List<String> yearsList = new ArrayList<String>();
		String queryStr = "SELECT DISTINCT(year) FROM Model where year is not null ORDER BY year DESC";
		
		TypedQuery<String> query = manager.createQuery(queryStr, String.class);		
		yearsList = query.getResultList();
		return yearsList;
	}
	
}
