package zenMindCart.openProject.entities;

import lombok.*;
import zenMindCart.openProject.entities.heritage.Node;

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
public class ImageNode extends Node {

    private String imageUrl;
}
