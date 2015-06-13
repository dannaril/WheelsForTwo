package com.dbraga.wf2.managedbean;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import com.dbraga.wf2.dao.BrandDao;
import com.dbraga.wf2.dao.CategoryDao;
import com.dbraga.wf2.dao.ModelDao;
import com.dbraga.wf2.entities.Brand;
import com.dbraga.wf2.entities.Category;
import com.dbraga.wf2.entities.Model;

@ManagedBean
@SessionScoped
public class ModelBean implements Serializable {
	
	private static final long serialVersionUID = 1L; 

	private Model selectedModel;
	private List<Model> models;
	private List<Model> modelsFilter;
	private List<Category> categoriesList;
	private List<Brand> brandsList;
	private List<String> yearsList;
	
	private ModelDao modelDao = new ModelDao();
	private BrandDao brandDao = new BrandDao();
	private CategoryDao categoryDao = new CategoryDao();
	
	public ModelBean(){
		models = modelDao.getAll();
		brandsList = brandDao.findAll();
		categoriesList = categoryDao.findAll();		
		yearsList = modelDao.getAllYears();
	}
	
	public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Model Selected", ((Model) event.getObject()).getId().toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

	public List<Model> getModels() {
		return models;
	}

	public List<Model> getModelsFilter() {
		return modelsFilter;
	}

	public void setModelsFilter(List<Model> modelsFilter) {
		this.modelsFilter = modelsFilter;
	}
	
	public List<Category> getCategoriesList() {
		return categoriesList;
	}
	
	public List<Brand> getBrandsList() {
		return brandsList;
	}

	public List<String> getYearsList() {
		return yearsList;
	}
	
	public Model getSelectedModel() {
		return selectedModel;
	}

	public void setSelectedModel(Model selectedModel) {
		this.selectedModel = selectedModel;
	}
}