package com.ssm.mapper;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ssm.model.Docter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by luosan on 06/04/2017.
 */
public interface DocterMapper {

        @Autowired
        public Docter selectDocterByID(int ID);
        @Autowired
        public List<Docter> selectDocters();
        @Autowired
        public void addDocter(Docter docter);
        @Autowired
        public void updateDocter(Docter docter);
        @Autowired
        public void deleteDocter(int ID);

}