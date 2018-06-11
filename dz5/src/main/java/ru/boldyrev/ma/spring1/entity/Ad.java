package ru.boldyrev.ma.spring1.entity;

import javax.persistence.*;

@Entity
@Table(name = "Ad")
public class Ad extends AbstractEntity {

    public Ad() {
    }

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name = "content")
    private String content;

    @Column(name = "phone")
    private String phone;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return '\n' + "Ad{" + '\n' +
                "id='" + getId() + '\n' +
                "name='" + getName() + '\n' +
                "category=" + category + '\n' +
                "company=" + company + '\n' +
                "content='" + content + '\n' +
                "phone='" + phone + '\n' +
                '}' + '\n';
    }
}
