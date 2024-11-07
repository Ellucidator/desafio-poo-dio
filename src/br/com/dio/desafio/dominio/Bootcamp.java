package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate endDate = startDate.plusDays(45);
    private Set<Conteudo> contents = new HashSet<>();
    private Set<Dev> devs = new HashSet<>();

    public Bootcamp(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public void addConteudo(Conteudo conteudo){
        contents.add(conteudo);
    }

    public Set<Conteudo> getContents() {
        return contents;
    }

    public void addDev(Dev dev){
        devs.add(dev);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startDate, bootcamp.startDate) && Objects.equals(endDate, bootcamp.endDate) && Objects.equals(contents, bootcamp.contents) && Objects.equals(devs, bootcamp.devs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startDate, endDate, contents, devs);
    }
}
