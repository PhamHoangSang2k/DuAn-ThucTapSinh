package DuAn.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import DuAn.entity.Orderdetail;

public interface OrderDetailDao extends JpaRepository<Orderdetail, Long>{

}
