package zenMindCart.openProject.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import zenMindCart.openProject.constantes.enumerations.Status;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;

    private String title;

    private Status status;

    @OneToOne
    @JoinColumn(name = "parent_node_id")
    private Node parentNode;
}
