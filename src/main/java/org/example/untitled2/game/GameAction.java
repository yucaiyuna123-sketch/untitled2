package org.example.untitled2.game;

import com.google.gson.annotations.SerializedName;

public sealed interface GameAction permits BgmAction, SceneAction, TextAction, ChooseAction {}

record BgmAction(String bgm) implements GameAction {}
record SceneAction(String scene) implements GameAction {}
record TextAction(String text, String human) implements GameAction {}
record ChooseAction(String text, Choice first, Choice second) implements GameAction {}

record Choice(String text, @SerializedName("case") String targetCase) {}
