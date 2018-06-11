package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.boldyrev.ma.spring1.config.AppConfig;
import ru.boldyrev.ma.spring1.repository.dao.CompanyDao;
import ru.boldyrev.ma.spring1.entity.Company;

public class TestCompanyDao {

    final private ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    final private CompanyDao companyDao = context.getBean(CompanyDao.class);

    private String idForTest;

    @BeforeTest
    private void testPersist() {
        final Company company = new Company();
        idForTest = company.getId();
        company.setName("company1");
        companyDao.persist(company);
    }

    @Test
    private void testFindCompanyById() {
        final Company company = companyDao.findCompanyById(idForTest);
        System.out.println(company);
    }

    @Test
    private void testMerge() {
        final Company company = companyDao.findCompanyById(idForTest);
        company.setName("company1-1");
        companyDao.merge(company);
    }

    @Test
    private void testGetListOfCompany() {
        System.out.println(companyDao.getListOfCompany());
    }

    @AfterTest
    //@Transactional
    void testRemove() {
        final Company company = companyDao.findCompanyById(idForTest);
        //companyDao.remove(company);
    }
}
