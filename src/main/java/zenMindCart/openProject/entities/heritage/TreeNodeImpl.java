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
public abstract class TreeNodeImpl implements TreeNode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Shape shape;
    private float containerWidth;
    private float containerHeight;
    private Color backgroundColor;
    private Color borderColor;
    private int borderSize;

    @Override
    public abstract void addChild(TreeNode child);

    @Override
    public abstract void removeChild(TreeNode child);

    @Override
    public abstract List<TreeNode> getChildren();
}
