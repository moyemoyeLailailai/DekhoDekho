import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calGUI extends JFrame{

    JTextField display;
    JButton[] numButtons;
    JButton[] funcButtons;
    JButton addButton, subButton, mulButton, divButton, eqButton, clrButton, dotButton, delButton;
    JPanel panel;

    private double num1, num2, result;
    private char operator;

    public calGUI() {
        setTitle("Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    public void initComponents(){
        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);

        numButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].setFont(new Font("Arial", Font.PLAIN, 18));
            numButtons[i].addActionListener(new numButtonListener());
        }

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");
        dotButton = new JButton(".");
        delButton = new JButton("Del");

        funcButtons = new JButton[]{addButton, subButton, mulButton, divButton, eqButton, clrButton, dotButton, delButton};
        for (JButton button : funcButtons) {
            button.setFont(new Font("Arial", Font.PLAIN, 18));
            button.addActionListener(new funcButtonListener());
        }

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(mulButton);
        panel.add(clrButton);
        panel.add(numButtons[0]);
        panel.add(eqButton);
        panel.add(divButton);

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    private class numButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            display.setText(display.getText() + source.getText());
        }
    }

    private class funcButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            switch (source.getText()) {
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(display.getText());
                    operator = source.getText().charAt(0);
                    display.setText("");
                    break;
                case "=":
                    num2 = Double.parseDouble(display.getText());
                    switch (operator) {
                        case '+':
                            result = num1 + num2;
                            break;
                        case '-':
                            result = num1 - num2;
                            break;
                        case '*':
                            result = num1 * num2;
                            break;
                        case '/':
                            if (num2 != 0) {
                                result = num1 / num2;
                            } else {
                                display.setText("Error");
                                return;
                            }
                            break;
                    }
                    display.setText(String.valueOf(result));
                    break;
                case "C":
                    display.setText("");
                    break;
                case ".":
                    if (!display.getText().contains(".")) {
                        display.setText(display.getText() + ".");
                    }
                    break;
                case "Del":
                    String currentText = display.getText();
                    if (!currentText.isEmpty()) {
                        display.setText(currentText.substring(0, currentText.length() - 1));
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            calGUI calculator = new calGUI();
            calculator.setVisible(true);
        });
    }

}