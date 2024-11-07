package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
    protected String title;
    protected String description;
    protected LocalDate data;

    public Mentoria(String title, LocalDate data, String description) {
        this.title = title;
        this.data = data;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", data=" + data +
                '}';
    }
}
