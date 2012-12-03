package com.mclinic.api.dao;

import java.util.List;

import com.google.inject.ImplementedBy;
import com.mclinic.api.dao.impl.FormDaoImpl;
import com.mclinic.api.model.Form;

@ImplementedBy(FormDaoImpl.class)
public interface FormDao {

    public Form saveForm(Form form);

    public Form updateForm(Form form);

    public Form getFormById(Integer id);

    public List<Form> getAllForms();

    public void deleteForm(Form form);

    public void deleteAllForms();
}
