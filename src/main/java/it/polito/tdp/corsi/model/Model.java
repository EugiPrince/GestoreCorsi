package it.polito.tdp.corsi.model;

import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO dao;
	
	public Model() {
		this.dao = new CorsoDAO();
	}

	public List<Corso> getCorsiByPeriodo(int pd) {
		//CorsoDAO dao = new CorsoDAO();
		return dao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso, Integer> getIscrittiByPeriodo(int pd) {
		//CorsoDAO dao = new CorsoDAO();
		return dao.getIscrittiByPeriodo(pd);
	}
}
