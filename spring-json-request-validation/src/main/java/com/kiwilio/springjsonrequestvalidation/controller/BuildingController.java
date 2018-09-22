package com.kiwilio.springjsonrequestvalidation.controller;

import com.kiwilio.springjsonrequestvalidation.model.Building;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BuildingController {

    @PostMapping("/building")
    public Building addBuilding(@Valid @RequestBody Building building) {
        return building;
    }
}
