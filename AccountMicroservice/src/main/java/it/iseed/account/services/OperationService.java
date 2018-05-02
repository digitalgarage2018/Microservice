package it.iseed.account.services;

import java.util.List;

import it.iseed.account.entities.Account;
import it.iseed.account.entities.Operation;

public interface OperationService {

    List<Operation> getAllOperationPerAccount(String accountId);
    List<Account> getAllAccountsPerUser(String userId);
    Operation saveOperation(Operation operation);

}
