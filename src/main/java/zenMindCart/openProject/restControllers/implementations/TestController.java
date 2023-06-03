package zenMindCart.openProject.restControllers.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zenMindCart.openProject.entities.Project;
import zenMindCart.openProject.repositories.ProjectRepository;

@CrossOrigin
@RestController
public class TestController {

    @Autowired
    ProjectRepository repository;

    @GetMapping("/")
    public Project project() {
        return repository.getReferenceById(1);
    }
}
