package zenMindCart.openProject.constantes.enumerations;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Status {
    NOT_FINISHED("Pending"),
    FINISHED("Completed");

    private final String name;
}
