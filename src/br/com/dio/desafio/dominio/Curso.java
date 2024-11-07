package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    protected int workLoad;

    public Curso(String title, String description, int workLoad) {
        super(title, description);
        this.workLoad = workLoad;
    }

    @Override
    public double xpCalculate() {
        return XP_PADRAO * workLoad;
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
