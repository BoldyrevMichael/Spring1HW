package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import ru.boldyrev.ma.spring1.component.dao.CompanyDao;
import ru.boldyrev.ma.spring1.entity.Company;

public class TestCompanyDao {

    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    final CompanyDao companyDao = context.getBean(CompanyDao.class);

    @Test
    private void testMerge() {
        final Company company = new Company();
        company.setName("company1");
        companyDao.merge(company);
    }
}
