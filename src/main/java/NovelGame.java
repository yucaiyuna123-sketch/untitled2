import javax.swing.*;
import java.awt.*;

public class NovelGame extends JFrame {
    private JLabel dialogueLabel;
    private JButton nextButton;

    public NovelGame() {
        setTitle("ひなののイチャイチャ部屋");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // テキスト表示エリア
        dialogueLabel = new JLabel("こんにちは、ひなののいちゃつき部屋へようこそ！");
        dialogueLabel.setFont(new Font("MS PGothic", Font.PLAIN, 24));
        add(dialogueLabel, BorderLayout.CENTER);

        // 次へボタン
        nextButton = new JButton("次へ");
        nextButton.addActionListener(e -> {
            dialogueLabel.setText("ひなーのの心を奪えるように頑張りましょう");
        });
        add(nextButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NovelGame());
    }
}