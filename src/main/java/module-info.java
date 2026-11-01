module org.example.untitled2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;
    requires com.google.gson;
    requires org.slf4j;
    requires java.desktop;
    requires javafx.media;
    // ← これを追加
       // logbackも使っているなら

    opens org.example.untitled2 to javafx.fxml;
    exports org.example.untitled2;
    exports org.example.untitled2.game;
    opens org.example.untitled2.game to javafx.fxml;
    opens org.example.untitled2.gui to javafx.fxml;
    exports org.example.untitled2.gui;
    exports org.example.untitled2.game.deserializers;
    opens org.example.untitled2.game.deserializers to javafx.fxml;
}