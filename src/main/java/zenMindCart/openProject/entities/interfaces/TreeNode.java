package zenMindCart.openProject.entities.interfaces;

import java.util.List;

public interface TreeNode {
    void addChild(TreeNode child);
    void removeChild(TreeNode child);
    List<TreeNode> getChildren();
}
