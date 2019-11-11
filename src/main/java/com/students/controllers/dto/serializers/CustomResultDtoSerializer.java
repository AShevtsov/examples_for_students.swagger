package com.students.controllers.dto.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.students.controllers.dto.ResultDto;

import java.io.IOException;
import java.util.Date;

public class CustomResultDtoSerializer extends JsonSerializer<ResultDto> {

    @Override
    public void serialize(ResultDto resultDto, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("message", resultDto.getMessage() + " " + new Date());
        jsonGenerator.writeNumberField("result", resultDto.getResult());
        jsonGenerator.writeEndObject();
    }
}
