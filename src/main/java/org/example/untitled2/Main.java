package org.example.untitled2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.untitled2.game.*;
import org.example.untitled2.game.GameActionDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import static javafx.application.Application.launch;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        String jsonString = "{ ... }";

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(GameAction.class, new GameActionDeserializer())
                .create();

        Type type = new TypeToken<Map<String, List<GameAction>>>() {
        }.getType();
        Map<String, List<GameAction>> scenarioMap = gson.fromJson(jsonString, type);

        // クラス型で直接 switch 分岐
        List<GameAction> gameActions = scenarioMap.get("prologue");
        for (GameAction action : gameActions) {
            switch (action) {
                case GameAction.BgmAction b -> System.out.println("Play BGM: " + b.bgm());
                case GameAction.SceneAction s -> System.out.println("Change Scene: " + s.scene());
                case GameAction.TextAction t -> System.out.println(t.human()+ ": " + t.text());
                case GameAction.ChooseAction c -> System.out.println("Choice A: " + c.first());
                case GameAction.EndAction ignored -> {}
                default -> {
                }
            }
        }

    }
}

