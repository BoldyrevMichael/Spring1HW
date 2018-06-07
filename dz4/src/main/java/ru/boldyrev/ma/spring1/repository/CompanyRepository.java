package ru.boldyrev.ma.spring1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.boldyrev.ma.spring1.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, String> {

    Company findCompanyById(String id);
}
