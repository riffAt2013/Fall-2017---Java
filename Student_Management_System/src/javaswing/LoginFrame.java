package javaswing;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


import java.awt.Color;

public class LoginFrame extends JFrame {
	private JLabel userLabel, passLabel;
	private JTextField tf;
	private JPasswordField pf;
	private JButton loginButton, clearButton;
	private Container C;
	private Font f3;
	
	
	LoginFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,50,420,350);
		this.setTitle("Login Panel");
		C= this.getContentPane ();
		C.setLayout(null);
		C.setBackground(Color.GRAY);
		
		
		f3= new Font ("Arial",Font.BOLD,20);
		userLabel = new JLabel("Username : ");
	    userLabel.setBounds(50,50,150,50);
	    userLabel.setFont(f3);
	    C.add(userLabel);
	    
	    tf= new JTextField();
	    tf.setFont(f3);
	    tf.setBounds(170,50,200,50);
	    C.add(tf);
	    
	    passLabel = new JLabel("Password : ");
	    passLabel.setBounds(50,120,150,50);
	    passLabel.setFont(f3);
	    C.add(passLabel);
	    
	    pf= new JPasswordField();
	    pf.setEchoChar('*');
	    pf.setFont(f3);
	    pf.setBounds(170,120,200,50);
	    C.add(pf);
	    
	    loginButton= new JButton ("Login");
		loginButton.setBounds(170,190,90,50);
		loginButton.setFont(f3);
		C.add(loginButton);
		
		clearButton= new JButton ("Clear");
		clearButton.setBounds(280,190,90,50);
		clearButton.setFont(f3);
		C.add(clearButton);
		
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent ae) {
				tf.setText("");
				pf.setText("");
				
			}
			
		});
		
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed (ActionEvent ae) {
				String userName= tf.getText();
				String password= pf.getText();
				if (userName.equals("Tonmoy") && password.equals("0123")) {
					
					JOptionPane.showMessageDialog(null, "Successfully Logged In");
					dispose();
					StudentTable table=new StudentTable();
					 table.setVisible(true);
					
					
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
					
				}
				
			}
			
		});

		
	}
	


public static void main(String [] args)
{
	LoginFrame frame = new LoginFrame();
	frame.setVisible(true);

}
}