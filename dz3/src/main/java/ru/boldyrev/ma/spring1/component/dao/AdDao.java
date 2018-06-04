package ru.boldyrev.ma.spring1.component.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Ad;

import java.util.List;

@Component
@Transactional
public class AdDao extends AbstractDao {

    public List<Ad> getListOfAd() {
        return em.createQuery("SELECT e FROM Ad e", Ad.class).getResultList();
    }

    public void merge(Ad ad) {
        if (ad != null) em.merge(ad);
    }
}