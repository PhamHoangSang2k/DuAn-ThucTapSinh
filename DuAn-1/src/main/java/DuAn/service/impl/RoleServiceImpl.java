package DuAn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.dao.RoleDao;
import DuAn.entity.Role;
import DuAn.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{

	@Autowired RoleDao rdao;
	
	@Override
	public List<Role> findAll() {
		return rdao.findAll();
	}

}
