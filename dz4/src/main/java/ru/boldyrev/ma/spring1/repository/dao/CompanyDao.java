package ru.boldyrev.ma.spring1.repository.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Company;

import java.util.List;

@Component
@Repository
@Transactional
public class CompanyDao extends AbstractDao {

    public List<Company> getListOfCompany() {
        return em.createQuery("SELECT e FROM Company e", Company.class).getResultList();
    }

    public void persist(Company company) {
        if (company != null) em.persist(company);
    }

    public void merge(Company company) {
        if (company != null) em.merge(company);
    }

    public void remove(Company company) {
        if (company != null) em.remove(company);
    }

    public Company findCompanyById(String id) {
        return em.find(Company.class, id);
    }
}