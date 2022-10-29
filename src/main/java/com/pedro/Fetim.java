package com.pedro;

import java.util.HashMap;
import com.pedro.exceptions.checked.NoteInsufficient;
import com.pedro.exceptions.unchecked.ProjectNameDuplicated;
import com.pedro.exceptions.unchecked.ProjectNameNotExist;

public class Fetim {
    private final HashMap<String, Double> projetos = new HashMap<>();

    public void addProject(String nome, double nota) throws ProjectNameDuplicated {
        if (this.projetos.containsKey(nome)) {
            throw new ProjectNameDuplicated("O Projeto: '" + nome + "' ja existe no sistema");
        }

        this.projetos.put(nome, nota);

    }

    public void verifyProjectsNotePassed(String projectName) throws NoteInsufficient, ProjectNameNotExist {
        double note = projetos.getOrDefault(projectName, -1.0);

        if (note == -1.0)
            throw new ProjectNameNotExist(String.format("Projeto %s nao existe no sistema", projectName));

        if (note < 70.0)
            throw new NoteInsufficient(String.format("Projeto %s nao tem nota suficiente para passar!", projectName));

        System.out.printf("O Projeto %s passou com %.2f;%n", projectName, note);
    }

}
