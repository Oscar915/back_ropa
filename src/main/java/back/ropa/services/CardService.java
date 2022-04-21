package back.ropa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import back.ropa.repositories.CartRepository;

@Service
public class CardService {
    @Autowired
    CartRepository cartRepository; 
}
