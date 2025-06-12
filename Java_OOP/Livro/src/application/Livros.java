
package application;

import java.util.Date;
import java.util.Objects;

public class Livros {
    private String titulo, autor, editora;
    private Date data;

    public Livros(String titulo, String autor, String editora, Date data) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.titulo);
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
        final Livros other = (Livros) obj;
        return Objects.equals(this.titulo, other.titulo);
    }
    
    
    
    
}
