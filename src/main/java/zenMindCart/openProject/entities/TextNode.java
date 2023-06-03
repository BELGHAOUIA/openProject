package zenMindCart.openProject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;
import zenMindCart.openProject.entities.heritage.Node;

import javax.persistence.*;
import java.awt.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

@AttributeOverride(name = "id", column = @Column(name = "textNodeId"))
public class TextNode extends Node {
    private Color textColor;
    private Font fontFamily;
    private float textSize;

    @OneToOne(mappedBy = "parentNode")
    @JsonBackReference
    @JsonSerialize
    private Project project;

    @ManyToMany
    @JoinTable(
            name = "parent_child_node",
            joinColumns = @JoinColumn(name = "parent_node_id", referencedColumnName = "textNodeId"),
            inverseJoinColumns = @JoinColumn(name = "child_node_id", referencedColumnName = "textNodeId"))
    private List<TextNode> nodes;
}
