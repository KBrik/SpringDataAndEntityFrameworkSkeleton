package org.itstep.dao;

import org.itstep.model.SpringPogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringPojoDAO extends JpaRepository<SpringPogo,Integer>{

}
