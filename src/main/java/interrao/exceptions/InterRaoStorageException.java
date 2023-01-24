package interrao.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class InterRaoStorageException extends RuntimeException {
    private final String description;
    private final Integer httpCode;
}
