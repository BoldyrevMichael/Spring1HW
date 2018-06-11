package ru.boldyrev.ma.spring1.service;

import ru.boldyrev.ma.spring1.entity.Ad;
import ru.boldyrev.ma.spring1.entity.Category;
import ru.boldyrev.ma.spring1.entity.Company;

import java.util.List;

public interface AdService {

    List<Ad> getListOfAd();

    Ad findAdById(String id);

    void persist(Ad ad);

    void remove(Ad ad);

    List<Ad> getListOfAdByCategory(Category category);

    void setName(String name, String id);

    void setContent(String content, String id);

    void setPhone(String phone, String id);

    void setCategory(Category category, String id);

    void setCompany(Company company, String id);
}