package com.inti.dao.impl;

import org.springframework.stereotype.Repository;
import com.inti.dao.interfaces.IDepartementDAO;
import com.inti.entities.Departement;

@Repository
public class DepartementDAO extends ManagerDAO<Departement> implements IDepartementDAO{

}
