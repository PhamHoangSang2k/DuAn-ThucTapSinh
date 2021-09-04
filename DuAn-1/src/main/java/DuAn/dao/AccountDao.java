package DuAn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import DuAn.entity.Account;
import DuAn.entity.Authority;

public interface AccountDao extends JpaRepository<Account, String>{

	@Query("SELECT DISTINCT ar.account FROM Authority ar WHERE ar.role.id IN ('DIRE', 'STAF')")
	List<Account> getAdministrators();
	
}
