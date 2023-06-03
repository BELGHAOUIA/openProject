package zenMindCart.openProject.restControllers.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import zenMindCart.openProject.entities.Project;
import zenMindCart.openProject.entities.TextTreeNode;
import zenMindCart.openProject.repositories.ProjectRepository;

import java.util.List;

@CrossOrigin
@RestController
public class TestController {

    @Autowired
    ProjectRepository repository;

    @GetMapping("/children")
    public List<TextTreeNode> children() {
        return repository.getReferenceById(1).getParentNode().getChildren();
    }
    @GetMapping("/parent_node")
    public TextTreeNode parentNode() {
        return repository.getReferenceById(1).getParentNode();
    }
}
