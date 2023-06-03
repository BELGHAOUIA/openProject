package zenMindCart.openProject.restControllers.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import zenMindCart.openProject.entities.Project;
import zenMindCart.openProject.entities.TextTreeNode;
import zenMindCart.openProject.repositories.ProjectRepository;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    ProjectRepository repository;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "<h1>home</h1>";
    }

    @GetMapping("/project")
    public String myProjects(Model model) {
       List<Project> projects = repository.findAll();
        model.addAttribute("projects", projects);
        return "pages/myProjects";
    }

    @GetMapping("/project/{id}")
    public String getItem(@PathVariable("id") Integer id, Model model) {
        TextTreeNode textTreeNode = repository.getReferenceById(id).getParentNode();
        model.addAttribute("mindMap", textTreeNode);
        return "pages/mindMap";
    }
}
