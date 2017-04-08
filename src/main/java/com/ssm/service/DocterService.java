package com.ssm.service;

import com.ssm.mapper.DocterMapper;
import com.ssm.model.Docter;
import com.ssm.model.ResponseData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.InputStream;
import java.util.List;

/**
 * Created by luosan on 06/04/2017.
 */
@Controller
@RequestMapping("/doctor")
public class DocterService {

        private static ApplicationContext ctx;
        private static DocterMapper docterMapper;

        static {

                // spring-mybatis
                try {
                        ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml");
                        docterMapper = (DocterMapper) ctx.getBean("docterMapper");                }catch(Exception e){
                        e.printStackTrace();
                }
        }

        @RequestMapping(value = "{ID}", method = RequestMethod.GET)
        public @ResponseBody
        Docter getDocter(@PathVariable int ID) {

                Docter docter = docterMapper.selectDocterByID(ID);
                return docter;
        }

        @RequestMapping(method = RequestMethod.GET)
        public @ResponseBody List<Docter> getAllDocter() {

                List<Docter> docters = docterMapper.selectDocters();
                return docters;
        }

        @RequestMapping(method = RequestMethod.POST)
        public @ResponseBody ResponseData addDocter(@RequestBody Docter docter) {

                ResponseData responseData = new ResponseData();
                docterMapper.addDocter(docter);
                responseData.setSuccess(true);
                return responseData;
        }

        @RequestMapping(value = "{ID}", method = RequestMethod.PUT)
        public @ResponseBody ResponseData updateDocter(@RequestBody Docter docter, @PathVariable int ID) {

                ResponseData responseData = new ResponseData();
                Docter docterForUpdate = docterMapper.selectDocterByID(ID);
                docterForUpdate.setDocname(docter.getDocname());
                docterForUpdate.setProfessor(docter.getProfessor());
                docterForUpdate.setDeadline(docter.getDeadline());
                docterForUpdate.setAptitude(docter.getAptitude());
                docterForUpdate.setGraduate(docter.getGraduate());
                docterForUpdate.setSkill(docter.getSkill());
                docterForUpdate.setWorkplace(docter.getWorkplace());
                // to finish all setter...
                docterMapper.updateDocter(docterForUpdate);

                responseData.setSuccess(true);
                return responseData;
        }

        @RequestMapping(value = "{ID}", method = RequestMethod.DELETE)
        public @ResponseBody ResponseData deleteDocter(@PathVariable int ID) {

                ResponseData responseData = new ResponseData();
                docterMapper.deleteDocter(ID);

                responseData.setSuccess(true);
                return responseData;
        }

}
