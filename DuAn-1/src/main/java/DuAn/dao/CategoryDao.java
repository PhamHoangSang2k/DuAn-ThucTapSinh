package DuAn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import DuAn.entity.Category;

public interface CategoryDao extends JpaRepository<Category, String>{

}
