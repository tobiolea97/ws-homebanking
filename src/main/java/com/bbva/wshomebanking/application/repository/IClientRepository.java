package com.bbva.wshomebanking.application.repository;

import com.bbva.wshomebanking.domain.models.Account;
import com.bbva.wshomebanking.domain.models.Client;

import java.util.List;
import java.util.UUID;

public interface IClientRepository {

    Client saveCliente(Client cliente, Account account);

    List<Client> getAll();

    Client findById(UUID id);

    boolean existsByEmail(String email);

    Client update(Client client);

}