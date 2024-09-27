package com.projectA.hibernateProject.formService;

import com.projectA.hibernateProject.formEntity.formEntity;

import java.util.List;

public interface formService {

    public formEntity saveForm(formEntity formentity);

    public formEntity updateForm(formEntity formentity);

    public List<formEntity> deleteForm(int ID);

    public formEntity getFormById(int ID);

    public List<formEntity> getAllForms();
}
