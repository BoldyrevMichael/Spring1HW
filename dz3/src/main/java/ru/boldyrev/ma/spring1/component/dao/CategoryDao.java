package ru.boldyrev.ma.spring1.component.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Category;

import java.util.List;

@Component
@Transactional
public class CategoryDao extends AbstractDao {

    public List<Category> getListOfCategory() {
        return em.createQuery("SELECT e FROM Category e", Category.class).getResultList();
    }

    public void merge(Category category) {
        if (category != null) em.merge(category);
    }
}
