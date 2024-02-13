package model;

import java.util.ArrayList;
import java.util.List;

public class Llibre {
    private String titol;

    private String autor;

    private String isbn;

    private String resum;

    private Part[] parts = new Part[0];

    public Llibre() {
    }

    public Llibre(String titol, String autor, String isbn, String resum, Part[] parts) {
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
        this.resum = resum;
        this.parts = parts;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getResum() {
        return resum;
    }

    public void setResum(String resum) {
        this.resum = resum;
    }

    public Part[] getParts() {
        return parts;
    }

    public void setParts(Part[] parts) {
        this.parts = parts;
    }

    
}
