package zenMindCart.openProject.entities.heritage;

import lombok.*;
import zenMindCart.openProject.entities.interfaces.TreeNode;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TreeNodeImpl implements TreeNode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Shape shape;
    private float containerWidth;
    private float containerHeight;
    private Color backgroundColor;
    private Color borderColor;
    private int borderSize;

   // @ManyToOne(fetch = FetchType.LAZY)
   // @JoinColumn(name = "parent_id")
    private TreeNode parent;

   // @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TreeNode> children;

    @Override
    public void addChild(TreeNode child) {
        children.add(child);
    }

    @Override
    public void removeChild(TreeNode child) {
        children.remove(child);
    }

    @Override
    public List<TreeNode> getChildren() {
        return children;
    }
}
