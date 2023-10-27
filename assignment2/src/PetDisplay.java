import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetDisplay extends JFrame implements ActionListener {
    private JLabel frame;
    private JRadioButton birdButton, catButton, dogButton, rabbitButton, pigButton;

    public PetDisplay() {
        setTitle("Pet Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new FlowLayout());

        frame = new JLabel();
        birdButton = new JRadioButton("Bird");
        catButton = new JRadioButton("Cat");
        dogButton = new JRadioButton("Dog");
        rabbitButton = new JRadioButton("Rabbit");
        pigButton = new JRadioButton("Pig");

        
        ButtonGroup group = new ButtonGroup();
        group.add(birdButton);
        group.add(catButton);
        group.add(dogButton);
        group.add(rabbitButton);
        group.add(pigButton);

         birdButton.addActionListener(this);
        catButton.addActionListener(this);
        dogButton.addActionListener(this);
        rabbitButton.addActionListener(this);
        pigButton.addActionListener(this);


        add(birdButton);
        add(catButton);
        add(dogButton);
        add(rabbitButton);
        add(pigButton);
        add(frame);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == birdButton) {
            frame.setIcon(new ImageIcon("bird.jpg"));
        } else if (e.getSource() == catButton) {
            frame.setIcon(new ImageIcon("cat.png"));
        } else if (e.getSource() == dogButton) {
            frame.setIcon(new ImageIcon("dog.jpg"));
        } else if (e.getSource() == rabbitButton) {
            frame.setIcon(new ImageIcon("rabbit.jpg"));
        } else if (e.getSource() == pigButton) {
            frame.setIcon(new ImageIcon("pig.jpg"));
        }
    }

    public static void main(String[] args) {
        PetDisplay display = new PetDisplay();
    }
}

