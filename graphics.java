import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class graphics extends JFrame implements ActionListener {
        JFrame window = new JFrame();
    private JTextField floorTF;
    private JTextField roofTF;
    private JButton Generate;
    private JLabel generatedNumber = new JLabel("Random generated number: null");
    private JLabel errorMsg = new JLabel("No input in one or both textfields.");
    backend backendAccess = null;

    public graphics(backend backendAccess) {
        this.backendAccess = backendAccess;
        window.getContentPane().setLayout(new BorderLayout());
        window.setSize(250, 300);
        window.setResizable(false);
        window.setTitle("Random number generator");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        this.floorTF = new JTextField("", 10);
        this.roofTF = new JTextField("", 10);

        JLabel floorText = new JLabel("Floor:");
        JLabel roofText = new JLabel("Roof:");

        JPanel numberPanel = new JPanel(new FlowLayout());
        JPanel buttonPanel = new JPanel(new FlowLayout());
        JPanel floorPanel = new JPanel(new FlowLayout());
        JPanel roofPanel = new JPanel(new FlowLayout());

        this.Generate = new JButton("Generate");
        this.Generate.addActionListener(this);

        JPanel holdTextfields = new JPanel(new BorderLayout());
        
        buttonPanel.setBackground(Color.BLACK);
        numberPanel.setBackground(Color.BLACK);
        floorPanel.setBackground(Color.BLACK);
        roofPanel.setBackground(Color.BLACK);
        floorText.setForeground(Color.WHITE);
        roofText.setForeground(Color.WHITE);
        this.generatedNumber.setForeground(Color.WHITE);

        buttonPanel.add(Generate);
        numberPanel.add(generatedNumber);        
        roofPanel.add(roofText);
        roofPanel.add(roofTF);
        floorPanel.add(floorText);
        floorPanel.add(floorTF);
        holdTextfields.add(roofPanel, BorderLayout.PAGE_START);
        holdTextfields.add(floorPanel, BorderLayout.PAGE_END);

        window.add(holdTextfields, BorderLayout.PAGE_START);
        window.add(numberPanel, BorderLayout.CENTER);
        window.add(buttonPanel, BorderLayout.PAGE_END);

        window.setVisible(true);
        window.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String f = this.floorTF.getText();
        String r = this.roofTF.getText();
        if (e.getSource() == Generate && r.length() > 0 && f.length() > 0) {
            this.setBoundaries(Integer.parseInt(f), Integer.parseInt(r));
            this.generatedNumber.setText("Random generated number: " + this.generateRandomNumber());
        } else {
            this.generatedNumber.setText("No input in one or both textfield");
        }
    }

    public int generateRandomNumber() {
        return this.backendAccess.genNumber();
    }

    public void setBoundaries(int floor, int roof) {
        this.backendAccess.setBoundaries(floor, roof);
    }
}

