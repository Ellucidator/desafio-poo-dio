package br.com.dio.desafio.dominio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    protected Set<Conteudo> subscribedContent = new HashSet<>();
    protected Set<Conteudo> completedContent =  new HashSet<>();

    public Dev(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subscribeBootcamp(Bootcamp bootcamp){
        bootcamp.addDev(this);
        subscribedContent.addAll(bootcamp.getContents());
    }
    public void progressContent(Conteudo content){
        subscribedContent.remove(content);
        completedContent.add(content);
    }
    public double xpCalculate(){
        return this.completedContent
                .stream()
                .mapToDouble(Conteudo::xpCalculate)
                .sum();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }
}
