package service;

import model.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.PhoneRepo;

@Service
public class PhoneService {
    private PhoneRepo phoneRepo;

    @Autowired
    public PhoneService(PhoneRepo phoneRepo){
        this.phoneRepo = phoneRepo;
    }

    public Phone addPhone(Phone phone){
        return phoneRepo.save(phone);
    }
}
