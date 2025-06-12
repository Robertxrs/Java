
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
public class Podcast{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nomeEpisodio;
    private int numero_episodio;
    private LocalTime duracao;
    private String url;

    public Podcast(int id, String produtor, String nomeEpisodio, int numero_episodio, LocalTime duracao, String url) {
        this.id = id;
        this.produtor = produtor;
        this.nomeEpisodio = nomeEpisodio;
        this.numero_episodio = numero_episodio;
        this.duracao = duracao;
        this.url = url;
    }

    public Podcast(String produtor, String nomeEpisodio, int numero_episodio, LocalTime duracao, String url) {
        this.produtor = produtor;
        this.nomeEpisodio = nomeEpisodio;
        this.numero_episodio = numero_episodio;
        this.duracao = duracao;
        this.url = url;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
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

    public int getNumero_episodio() {
        return numero_episodio;
    }

    public void setNumero_episodio(int numero_episodio) {
        this.numero_episodio = numero_episodio;
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
        hash = 37 * hash + this.numero_episodio;
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
        if (this.numero_episodio != other.numero_episodio) {
            return false;
        }
        if (!Objects.equals(this.produtor, other.produtor)) {
            return false;
        }
        return Objects.equals(this.url, other.url);
    }

    @Override
    public String toString() {
        return "Podcast{" + "id=" + id + ", produtor=" + produtor + ", numero_episodio=" + numero_episodio + ", duracao=" + duracao + ", url=" + url + '}';
    }
    
    
}
