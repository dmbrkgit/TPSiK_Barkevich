import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Лабораторная работа №3 Баркевич");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();
        frame.add(tabbedPane, BorderLayout.CENTER);
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        tabbedPane.addTab("Завдання 1", panel1);
        JPanel panel1_1 = new JPanel();
        panel1_1.setLayout(new FlowLayout());
        panel1.add(panel1_1, BorderLayout.NORTH);
        JLabel label1 = new JLabel("Введіть к-сть секунд:");
        panel1_1.add(label1);
        JTextField textField1 = new JTextField(10);
        panel1_1.add(textField1);
        JButton button1 = new JButton("Конвертувати");
        panel1_1.add(button1);
        JPanel panel1_2 = new JPanel();
        panel1_2.setLayout(new FlowLayout());
        panel1.add(panel1_2, BorderLayout.CENTER);
        JLabel label2 = new JLabel("Хвилин:");
        panel1_2.add(label2);
        JTextField textField2 = new JTextField(10);
        panel1_2.add(textField2);
        button1.addActionListener(e -> {
            try {
                int seconds = Integer.parseInt(textField1.getText());
                int minutes = seconds / 60;
                textField2.setText(String.valueOf(minutes));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Введіть число!");
            }
        });
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        tabbedPane.addTab("Завдання 2", panel2);
        frame.setVisible(true);
        JPanel panel2_1 = new JPanel();
        panel2_1.setLayout(new FlowLayout());
        panel2.add(panel2_1, BorderLayout.NORTH);
        JLabel label3 = new JLabel("Введіть номер строки:");
        panel2_1.add(label3);
        JTextField textField3 = new JTextField(10);
        panel2_1.add(textField3);
        JButton button2 = new JButton("Показати");
        panel2_1.add(button2);
        JPanel panel2_2 = new JPanel();
        panel2_2.setLayout(new FlowLayout());
        panel2.add(panel2_2, BorderLayout.CENTER);
        JLabel label4 = new JLabel("Вивід:");
        panel2_2.add(label4);
        JTextField textField4 = new JTextField(10);
        panel2_2.add(textField4);
        button2.addActionListener(e -> {
            try {
                group group = new group();
                String actual = group.group(Integer.parseInt(textField3.getText()));
                textField4.setText(actual);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Введіть число від 1 до 10");
            }
        });
    }
}
