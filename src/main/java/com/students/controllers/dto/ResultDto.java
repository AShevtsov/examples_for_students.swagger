package com.students.controllers.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.students.controllers.dto.serializers.CustomResultDtoSerializer;

@JsonSerialize(using = CustomResultDtoSerializer.class)
public class ResultDto {
    private String message;
    private Integer result;

    public ResultDto() {
    }

    public ResultDto(String message, Integer result) {
        this.message = message;
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDto{" +
                "message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
