import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private List dialogues;
    private int currentIndex;

    public GameManager() {
        dialogues = new ArrayList();
        currentIndex = 0;
        initializeDialogues();
    }

    private void initializeDialogues() {
        dialogues.add(new Dialogue("こんにちは、ひなのとのいちゃつき部屋へようこそ！", "神の声", "character1.png"));
        dialogues.add(new Dialogue("ひなーのの心を奪えるように頑張りましょう", "神の声", "character1.png"));
        dialogues.add(new Dialogue("楽しみですね！", "主人公", "character1.png"));
    }

    public Dialogue getCurrentDialogue() {
        if (currentIndex < dialogues.size()) {
            return (Dialogue) dialogues.get(currentIndex);
        }
        return null;
    }

    public void nextDialogue() {
        currentIndex++;
    }

    public boolean hasNext() {
        return currentIndex < dialogues.size();
    }
}
