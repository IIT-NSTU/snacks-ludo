
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class about extends JFrame {
    
    Container c;
    Font f1, f2;
    JLabel label, names;
    
    about(){
        
        c = this.getContentPane();
        c.setLayout(null);
        
        f1 = new Font("Arial Rounded MT Bold", Font.BOLD | Font.ITALIC, 32);
        f2 = new Font("Arial Rounded MT Bold", Font.BOLD, 28);
        
        label = new JLabel("Created By");
        label.setFont(f1);
        label.setBounds(100, 50, 300, 70);
        c.add(label);
        
        names = new JLabel("Sourav, Nadim, Pathan");
        names.setFont(f2);
        names.setBounds(130, 150, 400, 70);
        c.add(names);
        

        
        
        //setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Player Options");
        setBounds(400, 200, 800, 700);
    }
    
    public static void main(String[] args) {
        about frame = new about();
        
    }
    
}
