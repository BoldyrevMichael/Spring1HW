package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import ru.boldyrev.ma.spring1.component.dao.AdDao;
import ru.boldyrev.ma.spring1.component.dao.CategoryDao;
import ru.boldyrev.ma.spring1.component.dao.CompanyDao;
import ru.boldyrev.ma.spring1.entity.Ad;
import ru.boldyrev.ma.spring1.entity.Category;
import ru.boldyrev.ma.spring1.entity.Company;

public class TestAdDao {
    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    final CategoryDao categoryDao = context.getBean(CategoryDao.class);

    final CompanyDao companyDao = context.getBean(CompanyDao.class);

    final AdDao adDao = context.getBean(AdDao.class);

    @Test
    private void testMerge() {
        final Category category = new Category();
        category.setName("category2");
        categoryDao.merge(category);
        final Company company = new Company();
        company.setName("company2");
        companyDao.merge(company);
        final Ad ad = new Ad();
        ad.setName("ad1");
        ad.setCategory(category);
        ad.setCompany(company);
        adDao.merge(ad);
    }
}
