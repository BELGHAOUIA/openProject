package zenMindCart.openProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zenMindCart.openProject.entities.ImageNode;

@Repository
public interface ImageRepository extends JpaRepository<ImageNode, Integer> {
}
