package com.example.domain.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class LandDeserializer extends JsonDeserializer<Land> {

    @Override
    public Land deserialize(JsonParser parser, DeserializationContext context) throws IOException {
        JsonNode node = parser.getCodec().readTree(parser);

        LandNumber landNumber = new LandNumber(node.get("base_id").asInt());
        LandName landName = new LandName(node.get("base_name").asText());

        return new Land(landNumber, landName);
    }
}