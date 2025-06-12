package com.cenaflix.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

    @Entity
    @Table(name = "usuarios")
    public class Usuarios {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "login")
        private String login;
        private String senha;
        private String cargo;

        public Usuarios(int id, String login, String senha, String cargo) {
            this.id = id;
            this.login = login;
            this.senha = senha;
            this.cargo = cargo;
        }

        public Usuarios(String login, String senha, String cargo) {
            this.login = login;
            this.senha = senha;
            this.cargo = cargo;
        }

        public Usuarios() {
        }

        public Usuarios(int id) {
            this.id = id;
        }

        public Usuarios(String cargo) {
            this.cargo = cargo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 89 * hash + this.id;
            hash = 89 * hash + Objects.hashCode(this.login);
            hash = 89 * hash + Objects.hashCode(this.cargo);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Usuarios other = (Usuarios) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.login, other.login)) {
                return false;
            }
            return this.cargo == other.cargo;
        }

        @Override
        public String toString() {
            return "Usuarios{" + "id=" + id + ", username=" + login + ", senha=" + senha + ", cargo=" + cargo + '}';
        }

    }
