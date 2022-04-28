package com.va.baseproject.dto;


import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Data
public class ResponseData<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String time;

    private int code;

    private String message;

    private T data;

    public ResponseData() {
        this.code = 0;
        this.time =
                LocalDateTime.now()
                        .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        this.message = "Successful!";
    }

    public ResponseData<T> success(T data) {
        this.data = data;
        return this;
    }

    public ResponseData<T> success(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
        return this;
    }

    ResponseData<T> error(int code, String message) {
        this.code = code;
        this.message = message;
        return this;
    }

    public ResponseData<T> error(int code, String message, T data) {
        this.data = data;
        this.code = code;
        this.message = message;
        return this;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseData(HttpStatus httpStatus) {
        this.code = httpStatus.value();
        this.time =
                LocalDateTime.now()
                        .format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        this.message = httpStatus.getReasonPhrase();
    }
}
