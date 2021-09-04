package DuAn.service;

import java.util.List;

import DuAn.entity.Account;

public interface AccountService {

	Account findById(String username);

	List<Account> findAll();

	List<Account> getAdministrators();

	Account update(Account account);

	void delete(String username);

	Account create(Account account);
}
