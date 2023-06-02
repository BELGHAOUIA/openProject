package zenMindCart.openProject.constantes.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NodeType {
    TEXT_NODE("Text Node"),
    IMAGE_NODE("Image Node");

    private String name;
}
