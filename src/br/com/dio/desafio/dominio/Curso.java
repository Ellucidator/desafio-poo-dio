package br.com.dio.desafio.dominio;

public class Curso {
    protected String title;
    protected String description;
    protected int workLoad;

    public Curso(String title, int workLoad, String description) {
        this.title = title;
        this.workLoad = workLoad;
        this.description = description;
    }

    public void xpCalculate(){

    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workLoad=" + workLoad +
                '}';
    }
}
