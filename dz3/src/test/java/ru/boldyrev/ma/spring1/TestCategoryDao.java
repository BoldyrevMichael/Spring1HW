package ru.boldyrev.ma.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;
import ru.boldyrev.ma.spring1.component.dao.CategoryDao;
import ru.boldyrev.ma.spring1.entity.Category;

public class TestCategoryDao {
    final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    final CategoryDao categoryDao = context.getBean(CategoryDao.class);

    @Test
    private void testMerge() {
        final Category category = new Category();
        category.setName("category1");
        categoryDao.merge(category);
    }
}
