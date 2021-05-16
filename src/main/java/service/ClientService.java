package service;

import model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.ClientRepo;

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
}
