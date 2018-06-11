package ru.boldyrev.ma.spring1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.boldyrev.ma.spring1.entity.Company;
import ru.boldyrev.ma.spring1.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    @Transactional(readOnly = true)
    public Company findCompanyById(String id) {
        return companyRepository.getOne(id);
    }
}