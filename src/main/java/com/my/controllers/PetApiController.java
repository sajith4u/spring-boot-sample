package com.my.controllers;

import com.my.api.Pet;
import com.my.db.PetData;
import com.my.db.PetDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by isuru on 6/29/2016.
 */
@Controller
@Component
@RequestMapping(path = "/pets")
public class PetApiController {

    private final PetDataRepository petDataRepository;

    @Autowired
    public PetApiController(PetDataRepository petDataRepository) {
        this.petDataRepository = petDataRepository;
    }

    @Transactional
    @RequestMapping(method = RequestMethod.POST, path = "/")
    @ResponseBody
    public Pet savePet(@RequestBody Pet pet) {
        PetData petData = new PetData();
        petData.setName(pet.getName());
        petData.setType(pet.getType());
        petData.setBreed(pet.getBreed());
        petData.setStatus(pet.getStatus());

        petDataRepository.save(petData);

        return pet;
    }
}