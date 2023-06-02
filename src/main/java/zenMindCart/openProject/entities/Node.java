package zenMindCart.openProject.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Node {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "node_id")
    private int id;

    private float containerWidth;
    private float containerHeight;
    private Color backgroundColor;
    private Color borderColor;
    private int borderSize;

    @OneToOne(mappedBy = "parentNode")
    private Project project;

}
