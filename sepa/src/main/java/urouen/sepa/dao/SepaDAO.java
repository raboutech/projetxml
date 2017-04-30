package urouen.sepa.dao;

import java.util.Collection;

import urouen.sepa.model.*;

public interface SepaDAO {

	public  void add(SEPA sepa);
	public  Collection<SEPA> getAll();
	public  SEPA getSepa(int id);
	public int getCount();
	
}
