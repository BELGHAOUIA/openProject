package zenMindCart.openProject.entities;

import lombok.*;
import zenMindCart.openProject.entities.classes.Text;
import zenMindCart.openProject.entities.heritage.TreeNodeImpl;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

@AttributeOverride(name = "id", column = @Column(name = "textNodeId"))
public class TextTreeNode extends TreeNodeImpl {
    private Text text;
/*
    @OneToOne(mappedBy = "parentNode")
    @JsonBackReference
    @JsonSerialize
    private Project project;

    @ManyToMany
    @JoinTable(
            name = "parent_child_node",
            joinColumns = @JoinColumn(name = "parent_node_id", referencedColumnName = "textNodeId"),
            inverseJoinColumns = @JoinColumn(name = "child_node_id", referencedColumnName = "textNodeId"))
    private List<TextTreeNodeImpl> nodes;*/
}
