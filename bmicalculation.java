package BMI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class bmicalculation extends javax.swing.JFrame {
    bmicalculation(){

        JFrame f= new JFrame();
        
        JLabel l1=new JLabel("Height in cm:");
        l1.setBounds(20, 20, 100, 40);
        f.add(l1);

        JLabel l3=new JLabel("height in feet and inches: ");
        l3.setBounds(20, 20, 100,40);
        f.add(l3);
        
        JLabel l2=new JLabel("weight:");
        l2.setBounds(20, 60, 100,40);
        f.add(l2);
        JLabel lresult=new JLabel("BMI CALCULATOR");
        lresult.setBounds(20, 90, 300, 40);
        f.add(lresult);

        JTextField txtheight=new JTextField("");
        txtheight.setBounds(120,20,200,40);
        f.add(txtheight);

        JTextField txtweight=new JTextField("");
        txtweight.setBounds(120, 60, 200, 40);
        f.add(txtweight);

        JButton b= new JButton("CALCULATE");
        b.setBounds(20,130,300,40);

        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

                double weight= Double.parseDouble(txtweight.getText());

                double Height= Double.parseDouble(txtheight.getText())/(100);;

                double bmi = (weight)/(Math.pow(Height,2));

                if(bmi<18.5){

                    lresult.setText("Underweight-BMI-->"+bmi);
                }
                else if (bmi<25){

                    lresult.setText("Normal - BMI-->"+bmi);
                }
                else if (bmi<30){

                    lresult.setText("Overweight- BMI-->"+bmi);
                }
                else {

                    lresult.setText("OBESE - BMI-->"+bmi);
                }
            }

        });
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);

    }
    
}
