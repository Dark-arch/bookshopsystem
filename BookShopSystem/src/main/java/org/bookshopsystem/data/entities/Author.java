package org.bookshopsystem.data.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.bookshopsystem.data.entities.base.BaseEntity;

import java.util.Set;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

    @Column(name="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(mappedBy = "author")
    private Set<Book> books;

    public Author(){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
