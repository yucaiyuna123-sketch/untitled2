public class Dialogue {
    private String text;
    private String character;
    private String imagePath;

    public Dialogue(String text, String character, String imagePath) {
        this.text = text;
        this.character = character;
        this.imagePath = imagePath;
    }

    public String getText() {
        return text;
    }

    public String getCharacter() {
        return character;
    }

    public String getImagePath() {
        return imagePath;
    }
}

