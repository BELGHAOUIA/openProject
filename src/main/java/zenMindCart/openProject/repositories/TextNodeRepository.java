package zenMindCart.openProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zenMindCart.openProject.entities.TextTreeNode;

@Repository
public interface TextNodeRepository extends JpaRepository<TextTreeNode,Integer> {
}
