package back.ropa.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import back.ropa.models.Rol;
import back.ropa.services.RolService;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    RolService rolService;


    @GetMapping
    public ArrayList<Rol> getRoles(){
        return rolService.getRoles();
    }
}
