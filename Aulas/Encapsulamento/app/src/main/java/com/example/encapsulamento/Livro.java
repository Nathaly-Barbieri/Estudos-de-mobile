package com.example.encapsulamento;

public class Livro {

    private String titulo;

    private String autor;

    private String editora;

    private int paginas;


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
