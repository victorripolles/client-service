package com.victorripolles.microservice_client.web;

import com.victorripolles.microservice_client.api.ClientsApi;
import com.victorripolles.microservice_client.api.dto.ClientCreateRequestDTO;
import com.victorripolles.microservice_client.api.dto.ClientResponseDTO;
import com.victorripolles.microservice_client.api.dto.ClientUpdateRequestDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController implements ClientsApi {

//    @Autowired
//    ClientService clientService;

//    ClientMapper clientMapper = Mappers.getMapper(clientMapper.class);


    static final Logger log = LoggerFactory.getLogger(ClientController.class);

    @Override
    public ResponseEntity<ClientResponseDTO> createClient(ClientCreateRequestDTO clientCreateRequestDTO) {
        log.info("ClientController.createClient.INIT");

        log.info("ClientController.createClient.END");
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteClient(Integer clientId) {
        log.info("ClientController.deleteClient.INIT");

        log.info("ClientController.deleteClient.END");
        return null;
    }

    @Override
    public ResponseEntity<ClientResponseDTO> getClientById(Integer clientId) {
        log.info("ClientController.getClientById.INIT");

        log.info("ClientController.getClientById.END");
        return null;
    }

    @Override
    public ResponseEntity<List<ClientResponseDTO>> getClients() {
        log.info("ClientController.getClients.INIT");

        log.info("ClientController.getClients.END");
        return null;
    }

    @Override
    public ResponseEntity<ClientResponseDTO> updateClient(Integer clientId, ClientUpdateRequestDTO clientUpdateRequestDTO) {
        log.info("ClientController.updateClient.INIT");

        log.info("ClientController.updateClient.END");
        return null;
    }
}
