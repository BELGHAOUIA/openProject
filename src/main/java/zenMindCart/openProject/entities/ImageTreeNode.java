package zenMindCart.openProject.entities;

import lombok.*;
import zenMindCart.openProject.entities.classes.Image;
import zenMindCart.openProject.entities.heritage.TreeNodeImpl;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@AttributeOverride(name = "id", column = @Column(name = "imageNodeId"))
public class ImageTreeNode extends TreeNodeImpl {
    private Image image;
}
