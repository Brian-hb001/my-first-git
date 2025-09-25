package calaculatorcode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Calaculatorcode {

   
    public static void main(String[] args) {
        JFrame vsn = new JFrame("Calculator");
        
        JLabel firstNumber = new JLabel("First Number");
        JLabel secondNumber = new JLabel ("Second Number");
        JLabel result = new JLabel("Result");
        
        
        
        JTextField FirstNumber = new JTextField("");
        JTextField SecondNumber = new JTextField("");
        JTextField Result = new JTextField("");
        Result.setEditable(false);   // prevent typing in result field
        
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton div = new JButton("/");
        JButton mult = new JButton ("*");
        JButton cl = new JButton("CLEAR");
        JButton sq = new JButton("x^2");
        JButton sqrt = new JButton("√x");
        JButton cube = new JButton("x^3");
        JButton cuberoot = new JButton("³√x");
        JButton tan = new JButton("tan");
        JButton cos = new JButton("cos");
        JButton sin = new JButton("sin");
        JButton log = new JButton("Log");
        
        vsn.setLayout(new GridLayout(15,2,10,10));
        
               
        
        // Add components in correct order (label → textfield)
        
        vsn.add(firstNumber);
        vsn.add(FirstNumber);
        
        
        vsn.add(secondNumber);
        vsn.add(SecondNumber);
        
        
        vsn.add(result);
        vsn.add(Result);
       
        vsn.add(add);
        vsn.add(sub);
        vsn.add(div);
        vsn.add(mult);
        vsn.add(cl);
        vsn.add(sq);
        vsn.add(sqrt);
        vsn.add(cube);
        vsn.add(cuberoot);
        vsn.add(tan);
        vsn.add(cos);
        vsn.add(sin);
        vsn.add(log);
        
        
        
        
        
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            int fn = Integer.parseInt(FirstNumber.getText());
            int sn = Integer.parseInt(SecondNumber.getText());
            int sum = fn+sn;
            Result.setText(String.valueOf(sum));
            }
        });
        
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int fn =Integer.parseInt(FirstNumber.getText());
                int sn = Integer.parseInt(SecondNumber.getText());
                int sub = fn-sn;
                Result.setText(String.valueOf(sub));
            }
        });
        
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int fn = Integer.parseInt(FirstNumber.getText());
                int sn = Integer.parseInt(SecondNumber.getText());
                if (sn !=0){
                    int quotient = fn/sn;
                    Result.setText(String.valueOf(quotient));
                }else{
                    JOptionPane.showMessageDialog(vsn,"Cannot divide by Zer!!!");
                }
                
            }
        });
        
        mult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int fn = Integer.parseInt(FirstNumber.getText());
                int sn = Integer.parseInt(SecondNumber.getText());
                int mult = fn*sn;
                Result.setText(String.valueOf(mult));
            }
        });
        
        cl.addActionListener(e ->{
           
                
                FirstNumber.setText("");
                SecondNumber.setText("");
                Result.setText("");
                
            
        });
        
        sq.addActionListener(e ->{
                if (!FirstNumber.getText().isEmpty()){
                int fn = Integer.parseInt(FirstNumber.getText());
                Result.setText(String.valueOf(fn*fn));
                
        }else if (!SecondNumber.getText().isEmpty()){
                int sn = Integer.parseInt(SecondNumber.getText());
                Result.setText(String.valueOf(sn*sn));
                
                } else { 
                
                JOptionPane.showMessageDialog(vsn,"Please Enter a Number First");
                
                
        }
});
        
        sqrt.addActionListener(e ->{
        try{
            if (!FirstNumber.getText().isEmpty()){
            double fn = Double.parseDouble(FirstNumber.getText());
            if (fn >= 0){
            Result.setText(String.valueOf(Math.sqrt(fn)));
        } else {
                JOptionPane.showMessageDialog(vsn,"Cannot take squreRoot of a negative Number");
                
                }
        
        } else if (!SecondNumber.getText().isEmpty()){
                double sn = Double.parseDouble(SecondNumber.getText());
                if (sn >=0){
                Result.setText(String.valueOf(Math.sqrt(sn)));
        } else {
                JOptionPane.showMessageDialog(vsn,"Cannot take squreRoot of a negative Number");
                
           }
                
           
               
                }else {
                JOptionPane.showMessageDialog(vsn,"Please enter a number first!");
                
                }
    } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(vsn,"Invalid Input please enter a Valid Number");
    }
});
    
        cube.addActionListener(e -> {
    try {
        if (!FirstNumber.getText().isEmpty()) {
            double fn = Double.parseDouble(FirstNumber.getText());
            Result.setText(String.valueOf(fn * fn * fn));  // cube of first number
        } else if (!SecondNumber.getText().isEmpty()) {
            double sn = Double.parseDouble(SecondNumber.getText());
            Result.setText(String.valueOf(sn * sn * sn));  // cube of second number
        } else {
            JOptionPane.showMessageDialog(vsn, "Please enter a number first!");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vsn, "Invalid Input! Please enter a valid number.");
    }
});
        
        cuberoot.addActionListener(e -> {
    try {
        if (!FirstNumber.getText().isEmpty()) {
            double fn = Double.parseDouble(FirstNumber.getText());
            Result.setText(String.valueOf(Math.cbrt(fn)));  // cube root of first number
        } else if (!SecondNumber.getText().isEmpty()) {
            double sn = Double.parseDouble(SecondNumber.getText());
            Result.setText(String.valueOf(Math.cbrt(sn)));  // cube root of second number
        } else {
            JOptionPane.showMessageDialog(vsn, "Please enter a number first!");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vsn, "Invalid Input! Please enter a valid number.");
    }
});

        tan.addActionListener(e -> {
    try {
        if (!FirstNumber.getText().isEmpty()) {
            double fn = Double.parseDouble(FirstNumber.getText());
            Result.setText(String.valueOf(Math.tan(Math.toRadians(fn)))); 
        } else if (!SecondNumber.getText().isEmpty()) {
            double sn = Double.parseDouble(SecondNumber.getText());
            Result.setText(String.valueOf(Math.tan(Math.toRadians(sn)))); 
        } else {
            JOptionPane.showMessageDialog(vsn, "Please enter a number first!");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vsn, "Invalid Input! Please enter a valid number.");
    }
});

        
        cos.addActionListener(e -> {
    try {
        if (!FirstNumber.getText().isEmpty()) {
            double fn = Double.parseDouble(FirstNumber.getText());
            Result.setText(String.valueOf(Math.cos(Math.toRadians(fn))));
        } else if (!SecondNumber.getText().isEmpty()) {
            double sn = Double.parseDouble(SecondNumber.getText());
            Result.setText(String.valueOf(Math.cos(Math.toRadians(sn))));
        } else {
            JOptionPane.showMessageDialog(vsn, "Please enter a number first!");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vsn, "Invalid Input! Please enter a valid number.");
    }
});

        sin.addActionListener(e -> {
    try {
        if (!FirstNumber.getText().isEmpty()) {
            double fn = Double.parseDouble(FirstNumber.getText());
            Result.setText(String.valueOf(Math.sin(Math.toRadians(fn))));
        } else if (!SecondNumber.getText().isEmpty()) {
            double sn = Double.parseDouble(SecondNumber.getText());
            Result.setText(String.valueOf(Math.sin(Math.toRadians(sn))));
        } else {
            JOptionPane.showMessageDialog(vsn, "Please enter a number first!");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vsn, "Invalid Input! Please enter a valid number.");
    }
});

        log.addActionListener(e -> {
    try {
        if (!FirstNumber.getText().isEmpty()) {
            double fn = Double.parseDouble(FirstNumber.getText());
            if (fn > 0) {
                Result.setText(String.valueOf(Math.log10(fn)));  // log base 10
            } else {
                JOptionPane.showMessageDialog(vsn, "Logarithm undefined for zero or negative numbers!");
            }
        } else if (!SecondNumber.getText().isEmpty()) {
            double sn = Double.parseDouble(SecondNumber.getText());
            if (sn > 0) {
                Result.setText(String.valueOf(Math.log10(sn)));  // log base 10
            } else {
                JOptionPane.showMessageDialog(vsn, "Logarithm undefined for zero or negative numbers!");
            }
        } else {
            JOptionPane.showMessageDialog(vsn, "Please enter a number first!");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(vsn, "Invalid Input! Please enter a valid number.");
    }
});

        
               
        
              
        
        vsn.setSize(700,600);
        vsn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vsn.setVisible(true);
    }
    
}
    
    
        
        
    
   
