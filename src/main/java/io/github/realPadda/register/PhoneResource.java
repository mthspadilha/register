package io.github.realPadda.register;

import model.Phone;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PhoneService;

@RestController
@RequestMapping("/phone")
public class PhoneResource {
    private final PhoneService phoneService;

    public PhoneResource(PhoneService phoneService){

        this.phoneService = phoneService;
    }

    @PostMapping("/add")
    public ResponseEntity<Phone> addPhone(@RequestBody Phone phone){
        Phone newPhone = phoneService.addPhone(phone);
        return new ResponseEntity<>(newPhone, HttpStatus.CREATED);
    }
}
