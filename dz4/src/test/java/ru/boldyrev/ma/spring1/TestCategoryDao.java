package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.boldyrev.ma.spring1.config.AppConfig;
import ru.boldyrev.ma.spring1.repository.dao.CategoryDao;
import ru.boldyrev.ma.spring1.entity.Category;

public class TestCategoryDao {
    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    final CategoryDao categoryDao = context.getBean(CategoryDao.class);

    private String idForTest;

    @BeforeTest
    private void testPersist() {
        final Category category = new Category();
        idForTest = category.getId();
        category.setName("category1");
        categoryDao.persist(category);
    }

    @Test
    private void testFindCategoryById() {
        final Category category = categoryDao.findCategoryById(idForTest);
        System.out.println(category);
    }

    @Test
    private void testMerge() {
        final Category category = categoryDao.findCategoryById(idForTest);
        category.setName("category1-1");
        categoryDao.merge(category);
    }

    @Test
    private void testGetListOfCategory() {
        System.out.println(categoryDao.getListOfCategory());
    }

    @AfterTest
    private void testRemove() {
        final Category category = categoryDao.findCategoryById(idForTest);
        //categoryDao.remove(category);
    }
}
