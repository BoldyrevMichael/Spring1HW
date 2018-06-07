package ru.boldyrev.ma.spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.boldyrev.ma.spring1.entity.Ad;
import ru.boldyrev.ma.spring1.entity.Category;
import ru.boldyrev.ma.spring1.entity.Company;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, String> {

    @Query("select a from Ad a where a.category = :category")
    List<Ad> getListOfAdByCategory(@Param("category") Category category);

    @Query("select a.company from Ad a where a = :ad")
    Company getCompanyByAd(@Param("ad") Ad ad);

    @Modifying
    @Query("update Ad a set a.name = ?1 where a.id = ?2")
    void setName(String name, String id);

    @Modifying
    @Query("update Ad a set a.content = :content where a.id = :id")
    void setContent(@Param("content") String content, @Param("id") String id);

    @Modifying
    @Query("update Ad a set a.phone = :phone where a.id = :id")
    void setPhone(@Param("phone") String phone, @Param("id") String id);

    @Modifying
    @Query("update Ad a set a.category = :category where a.id = :id")
    void setCategory(@Param("category") Category category, @Param("id") String id);

    @Modifying
    @Query("update Ad a set a.company = :company where a.id = :id")
    void setCompany(@Param("company") Company company, @Param("id") String id);
}