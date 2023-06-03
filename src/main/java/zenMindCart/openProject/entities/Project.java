package zenMindCart.openProject.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import zenMindCart.openProject.constantes.enumerations.Status;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;

    private String title;

    private Status status;

    @OneToOne
    @JoinColumn(name = "parent_node_id")
    @JsonManagedReference
    @JsonSerialize
    private TextTreeNode parentNode;
}
