package ru.boldyrev.ma.spring1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Ad;
import ru.boldyrev.ma.spring1.entity.Category;
import ru.boldyrev.ma.spring1.entity.Company;
import ru.boldyrev.ma.spring1.repository.AdRepository;

import java.util.List;

@Service
public class AdServiceImpl implements AdService {

    @Autowired
    private AdRepository adRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Ad> getListOfAd() {
        return adRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Ad findAdById(String id) {
        return adRepository.findOne(id);
    }

    @Override
    @Transactional
    public void persist(Ad ad) {
        adRepository.save(ad);
    }

    @Override
    @Transactional
    public void remove(Ad ad) {
        adRepository.delete(ad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Ad> getListOfAdByCategory(Category category) {
        return adRepository.getListOfAdByCategory(category);
    }

    @Override
    @Transactional
    public void setName(String name, String id) {
        adRepository.setName(name, id);
    }

    @Override
    @Transactional
    public void setContent(String content, String id) {
        adRepository.setContent(content, id);
    }

    @Override
    @Transactional
    public void setPhone(String phone, String id) {
        adRepository.setPhone(phone, id);
    }

    @Override
    @Transactional
    public void setCategory(Category category, String id) {
        adRepository.setCategory(category, id);
    }

    @Override
    @Transactional
    public void setCompany(Company company, String id) {
        adRepository.setCompany(company, id);
    }
}