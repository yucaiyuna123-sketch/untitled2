package org.example.untitled2.game;

import com.google.gson.*;
import javafx.scene.image.Image;
import javafx.scene.media.Media;

import java.lang.reflect.Type;

public class GameActionDeserializer implements JsonDeserializer<GameAction> {
    @Override
    public GameAction deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        JsonElement actionElement = jsonObject.get("action");
        
        if (actionElement == null || !actionElement.isJsonPrimitive()) {
            throw new JsonParseException("Field 'action' is missing or invalid");
        }

        String actionType = actionElement.getAsString();

        return switch (actionType) {
            case "text" -> context.deserialize(json, GameAction.TextAction.class);
            case "choose" -> context.deserialize(json, GameAction.ChooseAction.class);
            case "end" -> context.deserialize(json, GameAction.EndAction.class);
            case "bgm" -> {

                // 1. 通常の文字列プロパティを抽出
                String name = jsonObject.has("name") ? jsonObject.get("name").getAsString() : "";

                // 2. JSON内のパス（String）から Image オブジェクトをその場で生成
                Image image = null;
                if (jsonObject.has("scene")) {
                    String imagePath = jsonObject.get("scene").getAsString();
                    if (!imagePath.isEmpty()) {
                        image = new Image();
                    }
                }

                // 3. JSON内のパス（String）から Media オブジェクトをその場で生成
                Media media = null;
                if (jsonObject.has("bgm")) {
                    String audioPath = jsonObject.get("bgm").getAsString();
                    if (!audioPath.isEmpty()) {
                        media = new Media();
                    }
                }
            }
            case "scene" -> context.deserialize(json, GameAction.SceneAction.class);
            default -> throw new JsonParseException("Unknown action type: " + actionType);
        };
    }
}