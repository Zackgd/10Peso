package com.peso.elBuenSabor.controllers;

import com.peso.elBuenSabor.entities.RubroArticulo;
import com.peso.elBuenSabor.services.RubroArticuloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "elbuensabor/v1/rubroarticulos")
public abstract class RubroArticuloController extends BaseControllerImpl<RubroArticulo, RubroArticuloServiceImpl> {

}
