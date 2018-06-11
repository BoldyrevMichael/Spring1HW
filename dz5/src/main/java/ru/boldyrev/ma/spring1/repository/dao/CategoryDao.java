package ru.boldyrev.ma.spring1.repository.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Category;

import java.util.List;

@Component
@Repository
@Transactional
public class CategoryDao extends AbstractDao {

    public List<Category> getListOfCategory() {
        return em.createQuery("SELECT e FROM Category e", Category.class).getResultList();
    }

    public void persist(Category category) {
        if (category != null) em.persist(category);
    }

    public void merge(Category category) {
        if (category != null) em.merge(category);
    }

    public void remove(Category category) {
        if (category != null) em.remove(category);
    }

    public Category findCategoryById(String id) {
        return em.find(Category.class, id);
    }
}