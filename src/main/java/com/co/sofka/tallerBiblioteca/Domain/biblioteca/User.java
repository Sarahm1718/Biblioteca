package com.co.sofka.tallerBiblioteca.Domain.biblioteca;

import co.com.sofka.domain.generic.AggregateRoot;
import com.co.sofka.tallerBiblioteca.Domain.biblioteca.values.IdUser;
import com.co.sofka.tallerBiblioteca.Domain.biblioteca.values.Name;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Usuario")
public class User extends AggregateRoot<IdUser> {
    @Id
    protected String userId;
    protected Name name;

    public User(IdUser entityId, String userId, Name name) {
        super(entityId);
        this.userId =entityId.value();
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Name getName() {
        return name;
    }
}
