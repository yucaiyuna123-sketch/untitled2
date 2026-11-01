package org.example.untitled2.game;

import com.google.gson.*;
import java.lang.reflect.Type;

class GameActionDeserializer implements JsonDeserializer<GameAction> {
    @Override
    public GameAction deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonElement actionElement = jsonObject.get("action");
        
        if (actionElement == null || !actionElement.isJsonPrimitive()) {
            throw new JsonParseException("Field 'action' is missing or invalid");
        }

        String actionType = actionElement.getAsString();

        return switch (actionType) {
            case "bgm" -> context.deserialize(json, BgmAction.class);
            case "scene" -> context.deserialize(json, SceneAction.class);
            case "text" -> context.deserialize(json, TextAction.class);
            case "choose" -> context.deserialize(json, ChooseAction.class);
            default -> throw new JsonParseException("Unknown action type: " + actionType);
        };
    }
}