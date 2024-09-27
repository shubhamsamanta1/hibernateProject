package com.projectA.hibernateProject.formService;

import com.projectA.hibernateProject.formDAO.formDAO;
import com.projectA.hibernateProject.formEntity.formEntity;
import org.hibernate.annotations.CurrentTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class formServiceImpl implements formService {

    @Autowired
    formDAO formDao;

    @Transactional
    @Override
    public formEntity saveForm(formEntity formentity) {
        formentity.setTimestamp(LocalDateTime.now());
        return formDao.save(formentity);
    }

    @Transactional
    @Override
    public formEntity updateForm(formEntity formentity) {
        formentity.setTimestamp(LocalDateTime.now());
        return formDao.update(formentity);
    }

    @Transactional
    @Override
    public List<formEntity> deleteForm(int ID) {
        return formDao.delete(ID);
    }

    @Transactional
    @Override
    public formEntity getFormById(int ID) {
        return formDao.getAllById(ID);
    }

    @Transactional
    @Override
    public List<formEntity> getAllForms() {
        return formDao.getAll();
    }
}
