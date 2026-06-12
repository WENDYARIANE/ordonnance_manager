package co.kozao.ordonnance_manager.service;

import co.kozao.ordonnance_manager.dao.OrdonnanceDao;

public class MedecinService {
	
	private OrdonnanceDao dao = new OrdonnanceDao();
	
	 public void creerOrdonnance() {
		 dao.creerOrdonnance();
	 }
	 
	 public void modifierOrdonnance() {
		 dao.modifierOrdonnace();
	 }
}
