package com.bbva.wshomebanking.presentation.mapper;

import com.bbva.wshomebanking.domain.models.Account;
import com.bbva.wshomebanking.domain.models.Client;
import com.bbva.wshomebanking.domain.models.ClientAccount;
import com.bbva.wshomebanking.domain.models.enums.Currency;
import com.bbva.wshomebanking.presentation.request.client.ClientCreateRequest;
import com.bbva.wshomebanking.presentation.request.cuenta.AccountCreateRequest;
import com.bbva.wshomebanking.presentation.response.account.AccountResponse;
import com.bbva.wshomebanking.presentation.response.client.ClientResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

@Component
public class AccountPresentationMapper {

    public AccountResponse domainToResponse(Account account) {
        return AccountResponse.builder()
                .accountNumber(account.getId())
                .currency(account.getCurrency())
                .balance(BigDecimal.ZERO)
                .build();
    }

    public Account requestToDomain(AccountCreateRequest request) {
        return Account.builder()
                .currency(request.getCurrency())
                .balance(BigDecimal.ZERO)
                .build();
    }

    public Account clientAndCurrencyToDomain(Client client, String currency) {
        ArrayList<Client> clients = new ArrayList<Client>();
        clients.add(client);

        return Account.builder()
                .currency(currency)
                .balance(BigDecimal.ZERO)
                .clients(clients)
                .build();
    }

}