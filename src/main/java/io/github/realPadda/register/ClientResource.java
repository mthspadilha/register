package io.github.realPadda.register;

import model.City;
import model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ClientService;

import java.util.List;

@RestController
@RequestMapping("client")
public class ClientResource {
    private final ClientService clientService;

    public ClientResource(ClientService clientService){

        this.clientService = clientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Client>> getAllClient(){

        List<Client> clients = clientService.findAllClients();
        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Client> addCity(@RequestBody Client client){
        Client newClient = clientService.addClient(client);
        return new ResponseEntity<>(newClient, HttpStatus.CREATED);
    }

}
