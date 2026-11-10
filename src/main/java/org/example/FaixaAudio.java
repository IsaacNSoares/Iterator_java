package org.example;

public class FaixaAudio {

    private String titulo;
    private boolean favorita;

    public FaixaAudio(String titulo, boolean favorita) {
        this.titulo = titulo;
        this.favorita = favorita;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }
}