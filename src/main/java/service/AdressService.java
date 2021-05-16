package service;

import model.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.AdressRepo;

import java.util.List;

@Service
public class AdressService {
    private AdressRepo adressRepo;

    @Autowired
    public AdressService(AdressRepo adressRepo){
        this.adressRepo = adressRepo;
    }

    public Adress addAdress(Adress adress){
        return adressRepo.save(adress);
    }

    public List<Adress> findAllAdress(Adress adress){
        return adressRepo.findAll();

    }
}
