package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.boldyrev.ma.spring1.config.AppConfig;
import ru.boldyrev.ma.spring1.repository.dao.AdDao;
import ru.boldyrev.ma.spring1.repository.dao.CategoryDao;
import ru.boldyrev.ma.spring1.repository.dao.CompanyDao;
import ru.boldyrev.ma.spring1.entity.Ad;
import ru.boldyrev.ma.spring1.entity.Category;
import ru.boldyrev.ma.spring1.entity.Company;

public class TestAdDao {
    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    final CategoryDao categoryDao = context.getBean(CategoryDao.class);

    final CompanyDao companyDao = context.getBean(CompanyDao.class);

    final AdDao adDao = context.getBean(AdDao.class);

    private String idForTest;

    @BeforeTest
    private void testPersist() {
        final Category category = new Category();
        category.setName("category2");
        categoryDao.persist(category);
        final Company company = new Company();
        company.setName("company2");
        companyDao.persist(company);
        final Ad ad = new Ad();
        ad.setName("ad1");
        ad.setCategory(category);
        ad.setCompany(company);
        idForTest = ad.getId();
        adDao.persist(ad);
    }

    @Test
    private void testFindAdById() {
        final Ad ad = adDao.findAdById(idForTest);
        System.out.println(ad);
    }

    @Test
    private void testMerge() {
        final Ad ad = adDao.findAdById(idForTest);
        ad.setName("ad1-1");
        adDao.merge(ad);
    }

    @Test
    private void testGetListOfAd() {
        System.out.println(adDao.getListOfAd());
    }

    @AfterTest
    private void testRemove() {
        Ad ad = adDao.findAdById(idForTest);
        //adDao.remove(ad);
    }
}