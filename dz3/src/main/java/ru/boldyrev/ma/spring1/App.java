package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.boldyrev.ma.spring1.component.dao.AdDao;
import ru.boldyrev.ma.spring1.component.dao.CategoryDao;
import ru.boldyrev.ma.spring1.component.dao.CompanyDao;
import ru.boldyrev.ma.spring1.entity.Ad;
import ru.boldyrev.ma.spring1.entity.Category;
import ru.boldyrev.ma.spring1.entity.Company;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        CompanyDao companyDao = context.getBean(CompanyDao.class);
        System.out.println((ArrayList<Company>)companyDao.getListOfCompany());

        CategoryDao categoryDao = context.getBean(CategoryDao.class);
        System.out.println((ArrayList<Category>)categoryDao.getListOfCategory());

        AdDao adDao = context.getBean(AdDao.class);
        System.out.println((ArrayList<Ad>)adDao.getListOfAd());
    }
}
