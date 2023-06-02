package zenMindCart.openProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zenMindCart.openProject.entities.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
