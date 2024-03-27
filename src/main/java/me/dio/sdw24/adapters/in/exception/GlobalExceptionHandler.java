package me.dio.sdw24.adapters.in.exception;

import me.dio.sdw24.domain.exception.ChampioNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    private  final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(ChampioNotFoundException.class)
    public ResponseEntity<ApiError> handleDomainException(ChampioNotFoundException domainError){
        return ResponseEntity.unprocessableEntity().body(new ApiError(domainError.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleDomainException(Exception unexpectedError){
        String message = "Ops! Ocorreu um erro inesperado!" ;
        logger.error("", unexpectedError);
        return ResponseEntity.internalServerError().body(new ApiError(message));
    }
    public record ApiError(String menssage){}
}
