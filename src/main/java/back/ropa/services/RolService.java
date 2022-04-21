package back.ropa.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import back.ropa.models.Rol;
import back.ropa.repositories.RolRepository;

@Service
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public ArrayList<Rol> getRoles() {
        return (ArrayList<Rol>) rolRepository.findAll();
    }
}
