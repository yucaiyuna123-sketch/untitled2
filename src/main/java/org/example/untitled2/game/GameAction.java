package org.example.untitled2.game;

import com.google.gson.annotations.SerializedName;
import javafx.scene.image.Image;
import javafx.scene.media.Media;

public interface GameAction {
    record ChooseAction(String text, Choice first, Choice second) implements GameAction {}
    record Choice(String text, @SerializedName("case") String targetCase) {}
    record SceneAction(Image scene) implements GameAction {}
    record BgmAction(Media bgm) implements GameAction {}
    record TextAction(String text, Human human) implements GameAction {}
    record EndAction() implements GameAction {}
}


