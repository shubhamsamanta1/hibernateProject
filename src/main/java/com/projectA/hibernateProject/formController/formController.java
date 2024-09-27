package com.projectA.hibernateProject.formController;

import com.projectA.hibernateProject.formEntity.formEntity;

import java.util.List;

public interface formController {

    public formEntity saveForm(formEntity formentity);

    public formEntity updateForm(formEntity formentity);

    public List<formEntity> deleteForm(int ID);

    public formEntity getFormById(int ID);

    public List<formEntity> getAllForms();
}
