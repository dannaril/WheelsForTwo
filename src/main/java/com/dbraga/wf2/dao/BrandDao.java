package com.dbraga.wf2.dao;

import com.dbraga.wf2.entities.Brand;

public class BrandDao extends GenericDAO<Long, Brand>{
	
	public BrandDao() {
	}
	
	public void saveTransactional(Brand brand){
        try{
            manager.getTransaction().begin();
            this.save(brand);
            manager.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
            manager.getTransaction().rollback();
        }
    }
}
