package service;

import model.City;
import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ClientRepo;

import java.util.List;

@Service
public class ClientService {
    private ClientRepo clientRepo;

    @Autowired
    public ClientService(ClientRepo clientRepo){

        this.clientRepo = clientRepo;
    }

    public Client addClient(Client client){

        return clientRepo.save(client);
    }

    public List<Client> findAllClients(){

        return clientRepo.findAll();
    }
}
