package zenMindCart.openProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zenMindCart.openProject.entities.Node;

@Repository
public interface NodeRepository extends JpaRepository<Node,Integer> {
}
