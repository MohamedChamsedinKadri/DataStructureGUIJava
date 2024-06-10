import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataStructureGUI extends JFrame implements ActionListener {
    private JButton stackButton;
    private JButton queueButton;
    private JButton linkedListButton;
    private JTextArea displayArea;

    public DataStructureGUI() {
        setTitle("Data Structure Operations");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        stackButton = new JButton("Stack");
        queueButton = new JButton("Queue");
        linkedListButton = new JButton("LinkedList");

        stackButton.addActionListener(this);
        queueButton.addActionListener(this);
        linkedListButton.addActionListener(this);

        buttonPanel.add(stackButton);
        buttonPanel.add(queueButton);
        buttonPanel.add(linkedListButton);

        displayArea = new JTextArea();
        displayArea.setEditable(false);

        add(buttonPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataStructure ds = null;
        if (e.getSource() == stackButton) {
            ds = new Stack();
        } else if (e.getSource() == queueButton) {
            ds = new Queue();
        } else if (e.getSource() == linkedListButton) {
            ds = new LinkedList();
        }

        if (ds != null) {
            displayArea.setText("");
            displayArea.append("Data Structure: " + ds.name + "\n");
            displayArea.append("Characteristics: " + ds.getCharacteristics() + "\n");
            displayArea.append("Operations: " + ds.getOperations() + "\n");
            displayArea.append("Method Example: " + ds.performOperation() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DataStructureGUI().setVisible(true);
            }
        });
    }
}
