import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;



public class BankChartFrame extends JFrame  {

    private BankChartPanel graphPanel;

    public BankChartFrame()  {

        graphPanel = new BankChartPanel();
        getContentPane().add(graphPanel, BorderLayout.CENTER);
        ControlPanel();
        pack();
    }


    public void ControlPanel()  {

        JButton calcButton = new JButton ("Calculate ->");
        final JTextField initialBalance = new JTextField("0");
        final JTextField annualRate = new JTextField("0");
        final JTextField years = new JTextField("0");
        final JTextField balanceField = new JTextField("0");


        class ButtonListener implements ActionListener  {

            public void actionPerformed(ActionEvent e)  {

                double balance = Double.parseDouble (initialBalance.getText());
                double rate = Double.parseDouble (annualRate.getText());
                int aYears = Integer.parseInt (years.getText());

                graphPanel.setCount(aYears + 1);
                graphPanel.addValue(balance);

                for (int i = 1; i <= aYears; i++)  {

                    double interestRate = balance*rate/100;
                    balance = balance + interestRate;


                    graphPanel.addValue(balance);
                }


                balanceField.setText("" + balance);
            }
        }


        ActionListener listener = new ButtonListener();
        calcButton.addActionListener(listener);

        JPanel north_Panel = new JPanel();
        north_Panel.setLayout(new GridLayout(4,1));
        north_Panel.add(new JLabel("Initial Balance:"));
        north_Panel.add(initialBalance);
        north_Panel.add(new JLabel("Annual Rate:"));
        north_Panel.add(annualRate);
        north_Panel.add(new JLabel("Number of Years:"));
        north_Panel.add(years);
        north_Panel.add(calcButton);
        north_Panel.add(balanceField);

        getContentPane().add(north_Panel, BorderLayout.NORTH);
    }

}
