package DuAn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.dao.AccountDao;
import DuAn.dao.AuthorityDao;
import DuAn.entity.Account;
import DuAn.entity.Authority;
import DuAn.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService{

	@Autowired AuthorityDao audao;
	@Autowired AccountDao adao;

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = adao.getAdministrators();
		return audao.authoritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		return audao.findAll();
	}

	@Override
	public Authority create(Authority auth) {
		return audao.save(auth);
	}

	@Override
	public void delete(Integer id) {
		audao.deleteById(id);
	}
}
