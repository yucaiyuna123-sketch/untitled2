package org.example.untitled2.game;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.untitled2.gui.Controller;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GameManager {
    public static void init() {
        String jsonString = "{ ... }"; // 対象のJSON文字列

        // カスタムデシリアライザをGsonBuilderに登録
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(GameAction.class, new GameActionDeserializer())
                .create();

        Map<String, List<GameAction>> scenarioMap = gson.fromJson(jsonString, new TypeToken<Map<String, List<GameAction>>>() {}.getType());

//        Controller.getInstance().setScene(test);
//        Controller.getInstance().renderTextNarrotor("文化祭まで、あと一週間。");
//        Controller.getInstance().renderTextNarrotor("高校二年の俺にとっては、今年で二回目の文化祭だ。");
//        Controller.getInstance().renderTextNarrotor("去年は友達と適当に出店を回って、それで終わった。");
//        Controller.getInstance().renderTextNarrotor("今年も、たぶんそんな感じになる。");
//        Controller.getInstance().renderText("……そう思っていた。", Human.Narrator);
//        Controller.getInstance().renderText("ねえねえ", Human.Girl);
//        Controller.getInstance().renderTextBoy("ん？");
//        Controller.getInstance().renderTextGirl("文化祭、何やるか決めた？");
//        Controller.getInstance().renderTextBoy("クラスの出し物？");
//        Controller.getInstance().renderTextGirl("そうそう");
//        Controller.getInstance().renderTextBoy("まだ。ていうか、俺に聞かれても困る");
//        Controller.getInstance().renderTextGirl("実行委員なのに？");
//        Controller.getInstance().renderTextBoy("……そうだった");
//        Controller.getInstance().renderTextGirl("忘れてたんかい");
//        Controller.getInstance().renderTextBoy("で、ひなのは？");
//        Controller.getInstance().renderTextGirl("私？");
//        Controller.getInstance().renderTextGirl("ステージ出る")
//        Controller.getInstance().renderTextBoy("へえ。何やるの？")
//        Controller.getInstance().renderTextGirl("アイドル")
//        Controller.getInstance().renderTextBoy("……アイドル？")
//        Controller.getInstance().renderTextGirl("うん。歌って、踊る")
//        Controller.getInstance().renderTextBoy("急にスケールでかくない？")
//        Controller.getInstance().renderTextGirl("文化祭だし、これくらいよくない？")
//        Controller.getInstance().renderTextBoy("いや、まあ……いいけど")
//        Controller.getInstance().renderTextGirl("でしょ？")
//        Controller.getInstance().renderTextNarrotor("ひなのは笑った。")
//        Controller.getInstance().renderTextNarrotor("でも、その笑顔はいつものものとは少し違っていた。")

    }


}
