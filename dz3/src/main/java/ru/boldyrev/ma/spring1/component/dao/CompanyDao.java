package ru.boldyrev.ma.spring1.component.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Company;

import java.util.List;

@Component
@Transactional
public class CompanyDao extends AbstractDao {

    public List<Company> getListOfCompany() {
        return em.createQuery("SELECT e FROM Company e", Company.class).getResultList();
    }

    public void merge(Company company) {
        if (company != null) em.merge(company);
    }
}