package org.cb.advice.handler;

import lombok.RequiredArgsConstructor;
import org.cb.Messages;
import org.cb.base.rs.ErrorRs;
import org.cb.bookings.constants.ErrorCodes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Optional;

@RestControllerAdvice
@RequiredArgsConstructor
public class BookingRqExceptionHandler {

    private final Messages messages;

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ProblemDetail> methodArgumentNotValidException(
                    MethodArgumentNotValidException ex) {
        List<ErrorRs> errors = ex.getBindingResult().getAllErrors().stream()
                        .map(err -> new ErrorRs(HttpStatus.BAD_REQUEST.getReasonPhrase(),
                                        err.getDefaultMessage())).toList();
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        problemDetail.setTitle(ErrorCodes.EC_INVALID_INPUT);
        problemDetail.setDetail(messages.getErrorProperties(ErrorCodes.EC_INVALID_INPUT));
        Optional.of(errors).ifPresent(err -> {
            problemDetail.setProperty("errors", err);
        });
        return ResponseEntity.badRequest().body(problemDetail);
    }

}
