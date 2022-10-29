import com.pedro.Fetim;
import com.pedro.exceptions.checked.NoteInsufficient;
import com.pedro.exceptions.unchecked.ProjectNameDuplicated;
import com.pedro.exceptions.unchecked.ProjectNameNotExist;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fetim fetim = new Fetim();
        List<String> projectsNames = new ArrayList<>(){
            {
                add("Projeto 1");
                add("Projeto 1");
                add("Projeto 7");
                add("Projeto 6");
                add("Projeto 5");
                add("Projeto 4");
                add("Projeto 3");
                add("Projeto 2");
            }
        };

        projectsNames.forEach((projectName) -> {
            try {
                fetim.addProject(projectName, (Math.random() * 100));
            } catch (ProjectNameDuplicated e) {
                System.out.println(e.getMessage());
            }
        });

        projectsNames.forEach((projectName) -> {
            try {
                fetim.verifyProjectsNotePassed(projectName);
            } catch (NoteInsufficient | ProjectNameNotExist e) {
                System.out.println(e.getMessage());
            }
        });


    }
}
