package ru.boldyrev.ma.spring1.component.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

abstract class AbstractDao {

    @PersistenceContext(name = "persistenceUnit")
    EntityManager em;
}