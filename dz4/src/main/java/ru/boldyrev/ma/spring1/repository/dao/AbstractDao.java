package ru.boldyrev.ma.spring1.repository.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

abstract class AbstractDao {

    @PersistenceContext(name = "persistenceUnit")
    EntityManager em;
}