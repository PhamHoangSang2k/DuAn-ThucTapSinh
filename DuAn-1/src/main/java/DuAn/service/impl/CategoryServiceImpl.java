package DuAn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DuAn.dao.CategoryDao;
import DuAn.entity.Category;
import DuAn.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired CategoryDao cdao;
	
	@Override
	public List<Category> findAll() {
		return cdao.findAll();
	}

}
