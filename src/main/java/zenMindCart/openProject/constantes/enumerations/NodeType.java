package zenMindCart.openProject.constantes.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NodeType {
    TEXT_NODE("Text TreeNodeImpl"),
    IMAGE_NODE("Image TreeNodeImpl");

    private final String name;
}
