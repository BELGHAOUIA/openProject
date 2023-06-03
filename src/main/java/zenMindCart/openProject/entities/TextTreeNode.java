package zenMindCart.openProject.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import zenMindCart.openProject.entities.classes.Text;
import zenMindCart.openProject.entities.heritage.TreeNodeImpl;
import zenMindCart.openProject.entities.interfaces.TreeNode;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@AttributeOverride(name = "id", column = @Column(name = "textNodeId"))
public class TextTreeNode extends TreeNodeImpl {
    private Text text;

    @OneToOne(mappedBy = "parentNode")
    @JsonBackReference
    private Project project;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private TreeNode parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TreeNode> children;*/

//    @ManyToMany
//    @JoinTable(
//            name = "parent_child_text_node",
//            joinColumns = @JoinColumn(name = "parent_node_id", referencedColumnName = "textNodeId"),
//            inverseJoinColumns = @JoinColumn(name = "child_node_id", referencedColumnName = "textNodeId"))
//    private List<TreeNode> children;



//    @Override
//    public void addChild(TreeNode child) {
//        children.add(child);
//    }
//
//    @Override
//    public void removeChild(TreeNode child) {
//        children.remove(child);
//    }
//
//    @Override
//    public List<TreeNode> getChildren() {
//        return children;
//    }
}
