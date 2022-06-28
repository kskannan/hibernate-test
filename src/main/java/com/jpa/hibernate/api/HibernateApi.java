package com.jpa.hibernate.api;

import com.jpa.hibernate.model.PoliciesDAO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Fetch Policy Details", tags = "Policies")
@RestController("/policy")
public class HibernateApi {

    @Autowired
    private PoliciesDAO policiesDAO;

    @GetMapping("/{policyNo}/details")
    @ApiOperation(value = "Fetch policy details using policy number", produces = "application/json", response = String.class)
    public String getPolicyDetails(@PathVariable(value = "policyNo") Integer policyNo) {
        System.out.println(policiesDAO.getPolicy().toString());
        return  "yes";
    }
}
