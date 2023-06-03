package zenMindCart.openProject.entities.heritage;

import lombok.*;
import zenMindCart.openProject.entities.Project;

import javax.persistence.*;
import java.awt.*;
import java.util.List;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private float containerWidth;
    private float containerHeight;
    private Color backgroundColor;
    private Color borderColor;
    private int borderSize;
}
