public class Choice {
    private String text;
    private int nextIndex;

    public Choice(String text, int nextIndex) {
        this.text = text;
        this.nextIndex = nextIndex;
    }

    public String getText() {
        return text;
    }

    public int getNextIndex() {
        return nextIndex;
    }
}