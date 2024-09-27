package com.projectA.hibernateProject.formDAO;


import com.projectA.hibernateProject.formEntity.formEntity;

import java.util.List;

public interface formDAO {

    public formEntity save(formEntity formentity);

    public formEntity update(formEntity formentity);

    public List<formEntity> delete(int ID);

    public formEntity getAllById(int ID);

    public List<formEntity> getAll();


}
