package ru.boldyrev.ma.spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.boldyrev.ma.spring1.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String> {

}