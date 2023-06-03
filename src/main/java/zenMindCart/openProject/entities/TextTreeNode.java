package zenMindCart.openProject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TextTreeNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String text;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "parentNode")
    @JsonBackReference
    private Project project;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference("parent_child_nodes")
    private TextTreeNode parent;

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "parent_id")
    @JsonManagedReference("parent_child_nodes")
    @Fetch(FetchMode.SELECT)
    private List<TextTreeNode> children;

//    @ManyToMany
//    @JoinTable(
//            name = "parent_child_text_node",
//            joinColumns = @JoinColumn(name = "parent_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "child_id", referencedColumnName = "id"))
//    @Fetch(FetchMode.SELECT)
//    private List<TextTreeNode> children = new LinkedList<>();
//
//

    public void addChild(TextTreeNode child) {
        children.add(child);
    }

    public void removeChild(TextTreeNode child) {
        children.remove(child);
    }

    public List<TextTreeNode> getChildren() {
        return children;
    }
}
