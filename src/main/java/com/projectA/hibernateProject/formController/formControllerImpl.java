package com.projectA.hibernateProject.formController;

import com.projectA.hibernateProject.formEntity.formEntity;
import com.projectA.hibernateProject.formService.formService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class formControllerImpl implements formController{

    @Autowired
    formService formservice;

    @PostMapping("/saveForm")
    @Override
    public formEntity saveForm(@RequestBody formEntity formentity) {
        return formservice.saveForm(formentity);
    }

    @PostMapping("/updateForm")
    @Override
    public formEntity updateForm(@RequestBody formEntity formentity) {
        return formservice.updateForm(formentity);
    }

    @PostMapping("/deleteForm/{ID}")
    @Override
    public List<formEntity> deleteForm(@PathVariable int ID) {
        return formservice.deleteForm(ID);
    }

    @GetMapping("/getForm/{ID}")
    @Override
    public formEntity getFormById(@PathVariable int ID) {
        return formservice.getFormById(ID);
    }

    @GetMapping("/getAllForms")
    @Override
    public List<formEntity> getAllForms() {
        return formservice.getAllForms();
    }
}
