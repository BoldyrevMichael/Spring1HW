package ru.boldyrev.ma.spring1.repository.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Ad;

import java.util.List;

@Component
@Repository
@Transactional
public class AdDao extends AbstractDao {

    public List<Ad> getListOfAd() {
        return em.createQuery("SELECT e FROM Ad e", Ad.class).getResultList();
    }

    public void persist(Ad ad) {
        if (ad != null) em.persist(ad);
    }

    public void merge(Ad ad) {
        if (ad != null) em.merge(ad);
    }

    public void remove(Ad ad) {
        if (ad != null) em.remove(ad);
    }

    public Ad findAdById(String id) {
        return em.find(Ad.class, id);
    }
}