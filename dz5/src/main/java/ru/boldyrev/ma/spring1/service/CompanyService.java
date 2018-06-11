package ru.boldyrev.ma.spring1.service;

import ru.boldyrev.ma.spring1.entity.Company;

public interface CompanyService {

    Company findCompanyById(String id);
}
