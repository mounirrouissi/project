package com.example.demo.service;

import com.example.demo.models.Client;
import com.example.demo.repo.ClientRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepo clientRepo;

    public ClientService(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }


    public void addClient(Client client){
        this.clientRepo.save(client);
}
public void editClient(Client client){
/*    Client clientToEdit = this.clientRepo.getById(client.getNumero());
        return client.builder().date(client.getDate())
                       .prixUnitaire(client.getPrixUnitaire())
                       .date(client.getDate())
                        .build();*/

}
public List<Client> getAllClients(){
        return this.clientRepo.findAll();
}
}
