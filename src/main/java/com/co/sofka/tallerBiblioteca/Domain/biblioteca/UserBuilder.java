package com.co.sofka.tallerBiblioteca.Domain.biblioteca;

import com.co.sofka.tallerBiblioteca.Domain.biblioteca.values.Name;

public final class UserBuilder {
    protected String userId;
    protected Name name;

    private UserBuilder() {
    }

    public static UserBuilder anUser() {
        return new UserBuilder();
    }

    public UserBuilder withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder withName(Name name) {
        this.name = name;
        return this;
    }

    public User build() {
        return new User(null, userId, name);
    }
}
