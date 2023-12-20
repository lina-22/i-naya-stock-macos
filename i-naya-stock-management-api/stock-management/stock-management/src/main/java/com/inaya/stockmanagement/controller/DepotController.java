package com.inaya.stockmanagement.controller;

import com.inaya.stockmanagement.manager.DepotManager;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/api/depot")
@CrossOrigin(origins="http://localhost:3000")
public class DepotController {

    private final DepotManager depotManager;

    public DepotController(DepotManager depotManager){
        this.depotManager=depotManager;
    }


}
