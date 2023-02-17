import javax.swing.*;
import java.awt.*;
//import java.util.ArrayList;

public class ComplexLayoutExample extends JFrame {
  
    private JLabel header;
    private ImageIcon bio, chem, cs, math, phys;
    private JPanel main, north;
    
    public ComplexLayoutExample(){
        super("ComplexLayoutExample");
        
        header = new JLabel("STEM Grades");
        header.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 20));
        
        bio = new ImageIcon(getClass().getResource("biology.png"));
        chem = new ImageIcon(getClass().getResource("chemistry.png"));
        cs = new ImageIcon(getClass().getResource("computer science.png"));
        math = new ImageIcon(getClass().getResource("math.png"));
        phys = new ImageIcon(getClass().getResource("physics.png"));
      
        north = new JPanel();
        north.setLayout(new FlowLayout(FlowLayout.CENTER));
        north.add(header);

        main = new JPanel();
        JLabel bioLabel = new JLabel("<html>Biology<br/> Units: 3<br/> Grade: 2.00");
        JLabel chemLabel = new JLabel("<html>Chemistry<br/> Units: 3<br/> Grade: 1.50");
        JLabel csLabel = new JLabel("<html>Computer Science<br/> Units: 1<br/> Grade: 1.50");
        JLabel mathLabel = new JLabel("<html>Mathematics<br/> Units: 4<br/> Grade: 1.75");
        JLabel physLabel = new JLabel("<html>Physics<br/> Units: 3<br/> Grade: 1.75");
      
        main.setLayout(new GridLayout(2,3,2,2));
      
        bioLabel.setIcon(bio);
        chemLabel.setIcon(chem);
        csLabel.setIcon(cs);
        mathLabel.setIcon(math);
        physLabel.setIcon(phys);
      
        main.add(bioLabel);
        main.add(chemLabel);
        main.add(csLabel);
        main.add(mathLabel);
        main.add(physLabel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450, 450);
        this.setLayout(new BorderLayout(10, 10));
        this.add(north, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);
    }
}
