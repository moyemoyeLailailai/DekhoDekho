import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricityBillCalculator extends JFrame implements ActionListener {

    private JLabel labelUnits, labelBillAmount;
    private JTextField textFieldUnits;
    private JButton calculateButton;

    public ElectricityBillCalculator() {
        setTitle("Electricity Bill Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        labelUnits = new JLabel("Enter Units Consumed:");
        labelUnits.setBounds(20, 20, 150, 25);
        panel.add(labelUnits);

        textFieldUnits = new JTextField();
        textFieldUnits.setBounds(160, 20, 100, 25);
        panel.add(textFieldUnits);

        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(100, 60, 100, 25);
        calculateButton.addActionListener(this);
        panel.add(calculateButton);

        labelBillAmount = new JLabel("Bill Amount:");
        labelBillAmount.setBounds(20, 100, 200, 25);
        panel.add(labelBillAmount);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            String unitsStr = textFieldUnits.getText();
            if (!unitsStr.isEmpty()) {
                int units = Integer.parseInt(unitsStr);
                double billAmount = calculateBill(units);
                labelBillAmount.setText("Bill Amount: " + billAmount + " Rupees");
            } else {
                labelBillAmount.setText("Please enter valid units!");
            }
        }
    }

    private double calculateBill(int units) {
        double billAmount = 0;

        if (units > 400) {
            billAmount += (200 * 3) + (100 * 4) + ((units - 300) * 5);
        } else if (units > 300) {
            billAmount += (200 * 3) + ((units - 200) * 4);
        } else if (units > 200) {
            billAmount += (units - 200) * 4;
        } else {
            billAmount = units * 3;
        }

        return billAmount;
    }

    public static void main(String[] args) {
        new ElectricityBillCalculator();
    }
}
