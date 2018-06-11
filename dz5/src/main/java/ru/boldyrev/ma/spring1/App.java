package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.boldyrev.ma.spring1.config.AppConfig;
import ru.boldyrev.ma.spring1.repository.dao.AdDao;
import ru.boldyrev.ma.spring1.repository.dao.CategoryDao;
import ru.boldyrev.ma.spring1.repository.dao.CompanyDao;
import ru.boldyrev.ma.spring1.service.AdService;

public class App {
    public static void main(String[] args) {

        String idForTest;

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CompanyDao companyDao = context.getBean(CompanyDao.class);
        System.out.println(companyDao.getListOfCompany());

        CategoryDao categoryDao = context.getBean(CategoryDao.class);
        System.out.println(categoryDao.getListOfCategory());

        AdDao adDao = context.getBean(AdDao.class);
        System.out.println(adDao.getListOfAd());
        idForTest = adDao.getListOfAd().get(0).getId();

        AdService adService = context.getBean(AdService.class);
        adService.setContent("Новый контент1", idForTest);
    }
}
