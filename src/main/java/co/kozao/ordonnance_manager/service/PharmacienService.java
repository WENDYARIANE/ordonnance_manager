package co.kozao.ordonnance_manager.service;

import co.kozao.ordonnance_manager.dao.OrdonnanceDao;

public class PharmacienService {
	
	
	private OrdonnanceDao dao = new OrdonnanceDao();
	public void consulterOrdonnancePrescrite() {
		dao.consulterOrdonnance();
		 
	 }
	public void marquerCommeTraité() {
		dao.marquerCommeDelivree();
		 
	 }
	public void annulerOrdonnance() {
		 dao.annulerOrdonnance();
	 }
}
