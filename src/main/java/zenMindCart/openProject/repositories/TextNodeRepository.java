package zenMindCart.openProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zenMindCart.openProject.entities.TextNode;


@Repository
public interface TextNodeRepository extends JpaRepository<TextNode,Integer> {
}
