package com.jpa.hibernate.model;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class PoliciesDAO {


    @Autowired
    private HibernateTemplate template;

    @Autowired
    private SessionFactory sessionFactory;

    public Policies getPolicy(){
       // template.setSessionFactory(sessionFactory);
        return (Policies)template.get(Policies.class, 1);
    }
}
