package it.polito.tdp.corsi.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.corsi.db.CorsoDAO;

public class Model {
	
	private CorsoDAO dao;
	
	public Model() {
		this.dao = new CorsoDAO();
	}

	public boolean esisteCorso(String codins) {
		return dao.esisteCorso(codins);
	}
	
	public List<Corso> getCorsiByPeriodo(int pd) {
		//CorsoDAO dao = new CorsoDAO();
		return dao.getCorsiByPeriodo(pd);
	}
	
	public Map<Corso, Integer> getIscrittiByPeriodo(int pd) {
		//CorsoDAO dao = new CorsoDAO();
		return dao.getIscrittiByPeriodo(pd);
	}
	
	public List<Studente> getStudentiByCorso(Corso corso) {
		return dao.getStudentiByCorso(corso);
	}
	
	
	public Map<String, Integer> divisioneCDS(Corso corso) {
		//METODO SENZA PASSARE DAL DAO, NON HO UNA QUERY SQL SUL DB
		
		//Uso i metodi che ho gia' creato e che possono essere utili
		/*List<Studente> studenti = dao.getStudentiByCorso(corso);
		
		Map<String, Integer> statistiche = new HashMap<>();
		//Le chiavi sono i corsi di studi, ogni volta che incontro il cds incremento di uno il valore, cosi'
		//avro' il numero totale alla fine
		//Ho usato la HashMap perche' so che le chiavi saranno univoche e quindi controllo facilmente se l'ho
		//gia' incontrata oppure no
		
		for(Studente s : studenti) {
			if(s.getCds()!=null && !s.getCds().equals("")) {
				if(statistiche.containsKey(s.getCds())) {
					statistiche.put(s.getCds(), statistiche.get(s.getCds())+1);
				}
				else {
					statistiche.put(s.getCds(), 1);
				}
			}
		}
		return statistiche;*/
		
		//METODO PASSANDO DAL DB, E' PIU' PERFORMANTE FARE COSI'
		
		return dao.divisioneCDS(corso);
	}
}
