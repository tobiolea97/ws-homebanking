package com.bbva.wshomebanking.application.usecases.transaction;

import com.bbva.wshomebanking.presentation.request.transaction.DepositRequest;
import com.bbva.wshomebanking.utilities.TransactionResponse;
import com.bbva.wshomebanking.utilities.exceptions.TransactionException;

public interface IDepositUseCase {
    TransactionResponse deposit(DepositRequest depositRequest) throws TransactionException;
}
