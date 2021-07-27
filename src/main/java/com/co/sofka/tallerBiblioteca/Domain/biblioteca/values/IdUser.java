package com.co.sofka.tallerBiblioteca.Domain.biblioteca.values;

import co.com.sofka.domain.generic.Identity;

public class IdUser extends Identity {
    public IdUser(String id) {super(id);}
    public static IdUser of(String id){return new IdUser(id);}
}
