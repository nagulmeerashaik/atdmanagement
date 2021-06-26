package com.clg.atdmanagement.repositories;

import com.clg.atdmanagement.beans.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account,Integer> {
}
