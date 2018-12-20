package org.itstep.service;

import org.itstep.model.SpringPogo;

public interface SpringPojoService {


        SpringPogo save(SpringPogo springPogo);

        SpringPogo update(SpringPogo springPogo);

        SpringPogo get(Integer id);

        void delete(Integer id);

    }

