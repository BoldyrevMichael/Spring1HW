package ru.boldyrev.ma.spring1.entity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "Category")
public class Category extends AbstractEntity {

    public Category() {
    }

    @OneToMany(mappedBy = "category")
    private List<Ad> listOfAd;

    @Override
    public String toString() {
        return '\n' + "Category{" + '\n' +
                "id='" + getId() + '\n' +
                "name='" + getName() + '\n' +
                '}' + '\n';
    }

    public List<Ad> getListOfAd() {
        return listOfAd;
    }

    public void setListOfAd(List<Ad> listOfAd) {
        this.listOfAd = listOfAd;
    }
}