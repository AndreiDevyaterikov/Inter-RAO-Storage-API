package interrao.exceptions;

import interrao.models.ResponseModel;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class InterRaoStorageHandlerException {

    @ExceptionHandler(InterRaoStorageException.class)
    public ResponseModel myExceptionHandler(InterRaoStorageException exception, HttpServletResponse response) {
        response.setStatus(exception.getHttpCode());
        return new ResponseModel(exception.getHttpCode(),
                exception.getDescription());
    }
}
