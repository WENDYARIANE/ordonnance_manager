package co.kozao.ordonnance_manager.service;

import co.kozao.ordonnance_manager.dao.OrdonnanceDao;

public class PatientService {
	
	private OrdonnanceDao dao = new OrdonnanceDao();
	public void consulterMesOrdonnance() {
		dao.consulterOrdonnance();
	 }
	public void telechargerOrdonnance() {
		dao.telechargerOrdonnance();
		 
	 }
}
