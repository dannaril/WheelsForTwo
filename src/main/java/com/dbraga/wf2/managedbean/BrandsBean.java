package com.dbraga.wf2.managedbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.dbraga.wf2.dao.BrandDao;
import com.dbraga.wf2.entities.Brand;

@ManagedBean
@SessionScoped
public class BrandsBean implements Serializable {
	
	private static final long serialVersionUID = 1L; 

	private List<Brand> brands;
	private List<Brand> brandsFilter;
	private BrandDao brandDao = new BrandDao();
	
	
	public BrandsBean(){
		brands = brandDao.findAll();
	}
	

	public List<Brand> getBrands() {
		return brands;
	}

	public List<Brand> getBrandsFilter() {
		return brandsFilter;
	}

	public void setBrandsFilter(List<Brand> brandsFilter) {
		this.brandsFilter = brandsFilter;
	}	
}