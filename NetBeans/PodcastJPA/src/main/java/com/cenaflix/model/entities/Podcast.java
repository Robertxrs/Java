package com.cenaflix.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalTime;
import java.util.Objects;

    @Entity
    @Table(name = "podcasts")
    public class Podcast {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String produtor;
        private String episodio;
        private int numeroEpisodio;
        private LocalTime duracao;
        private String url;

        public Podcast(int id, String produtor, String episodio, int numeroEpisodio, LocalTime duracao, String url) {
            this.id = id;
            this.produtor = produtor;
            this.episodio = episodio;
            this.numeroEpisodio = numeroEpisodio;
            this.duracao = duracao;
            this.url = url;
        }

        public Podcast(String produtor, String episodio, int numeroEpisodio, LocalTime duracao, String url) {
            this.produtor = produtor;
            this.episodio = episodio;
            this.numeroEpisodio = numeroEpisodio;
            this.duracao = duracao;
            this.url = url;
        }

        public String getEpisodio() {
            return episodio;
        }

        public void setNomeEpisodio(String episodio) {
            this.episodio = episodio;
        }

        public Podcast() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getProdutor() {
            return produtor;
        }

        public void setProdutor(String produtor) {
            this.produtor = produtor;
        }

        public int getNumeroEpisodio() {
            return numeroEpisodio;
        }

        public void setNumeroEpisodio(int numeroEpisodio) {
            this.numeroEpisodio = numeroEpisodio;
        }

        public LocalTime getDuracao() {
            return duracao;
        }

        public void setDuracao(LocalTime duracao) {
            this.duracao = duracao;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 37 * hash + this.id;
            hash = 37 * hash + Objects.hashCode(this.produtor);
            hash = 37 * hash + this.numeroEpisodio;
            hash = 37 * hash + Objects.hashCode(this.url);
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
            final Podcast other = (Podcast) obj;
            if (this.id != other.id) {
                return false;
            }
            if (this.numeroEpisodio != other.numeroEpisodio) {
                return false;
            }
            if (!Objects.equals(this.produtor, other.produtor)) {
                return false;
            }
            return Objects.equals(this.url, other.url);
        }

        @Override
        public String toString() {
            return "Podcast{" + "id=" + id + ", produtor=" + produtor + ", numero_episodio=" + numeroEpisodio + ", duracao=" + duracao + ", url=" + url + '}';
        }

    }
