package javaswing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame implements ActionListener   {
	private JTable table;
	private DefaultTableModel model;
	private JScrollPane scroll;
	private Container c;
	private JLabel titleLabel, fnLabel, lnLabel,idLabel, phoneLabel, gpaLabel, DepLabel;
	private JTextField fnTf, lnTf,idTf, phoneTf, gpaTf, DTf;
	private JButton addButton, updateButton, deleteButton, clearButton;
	
	
	private String[] columns= {"First name", "Last name", "ID", "Phone number", "Cgpa", "Department"};
	private String[] rows = new String [6];
	
	
	StudentTable (){
		
		initComponents();
		
	}
	
	
	public void initComponents() {
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this. setSize (780,690);
		this.setLocationRelativeTo(null);
		this.setTitle("Student Management System");
		
		
		c= this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.orange);
		 
		Font font= new Font ("Arial", Font.BOLD, 17);
		Font font2= new Font ("Arial", Font.BOLD, 25);
		titleLabel = new JLabel ("Student Registration");
		titleLabel.setFont (font2);
		titleLabel.setBounds(250, 20, 250,50);
		c.add(titleLabel);
		
		fnLabel = new JLabel ("First Name   ");
		fnLabel.setBounds(10, 80,140,30);
		fnLabel.setFont(font);
		c.add(fnLabel);
		
		fnTf= new JTextField ();
		fnTf.setBounds(110,80,200,30);
		fnTf.setFont(font);
		c.add(fnTf);
		
		addButton= new JButton ("Add");
		addButton.setBounds(10,370,100,20);
		addButton.setFont(font);
		c.add(addButton);
		
		lnLabel = new JLabel("Last Name   ");
		lnLabel.setBounds(10,130,150,30);
		lnLabel.setFont(font);
		c.add(lnLabel);
		
		lnTf= new JTextField ();
		lnTf.setBounds(110,130,200,30);
		lnTf.setFont(font);
		c.add(lnTf);
		
		updateButton = new JButton("Update");
		updateButton.setBounds(160,370,100,20);
		updateButton.setFont(font);
		c.add(updateButton);
		
		
		idLabel = new JLabel("ID   ");
		idLabel.setBounds(10,180,150,30);
		idLabel.setFont(font);
		c.add(idLabel);
		
		idTf = new JTextField();
		idTf.setBounds (110,180,200,30);
		idTf.setFont(font);
		c.add(idTf);
		
		phoneLabel = new JLabel("Phone   ");
		phoneLabel.setBounds(10,230,150,30);
		phoneLabel.setFont(font);
		c.add(phoneLabel);
		
		phoneTf = new JTextField();
		phoneTf.setBounds (110,230,200,30);
		phoneTf.setFont(font);
		c.add(phoneTf);
		
		
		deleteButton = new JButton("Delete");
		deleteButton.setBounds(310,370,100,20);
		deleteButton.setFont(font);
		c.add(deleteButton);
		
		gpaLabel  = new JLabel("CGPA   ");
		gpaLabel.setBounds(10,280,150,30);
		gpaLabel.setFont(font);
		c.add(gpaLabel);
		
		gpaTf  = new JTextField();
		gpaTf .setBounds(110,280,200,30);
		gpaTf .setFont(font);
		c.add(gpaTf);
		

		DepLabel = new JLabel("Department Name   ");
		DepLabel.setBounds(10,330,150,30);
		DepLabel.setFont(font);
		c.add(DepLabel);
		
		DTf= new JTextField ();
		DTf.setBounds(110,330,200,30);
		DTf.setFont(font);
		c.add(DTf);
		
		clearButton = new JButton("Clear   ");
		clearButton.setBounds(460,370,100,20);
		clearButton.setFont(font);
		c.add(clearButton);
		
		table = new JTable ();
		
		model= new DefaultTableModel ();
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setFont(font);
		table.setSelectionBackground(Color.green);
		table.setBackground(Color.white);
		table.setRowHeight (20);
		
		scroll = new JScrollPane(table);
		scroll.setBounds(10,400,740,265);
		c.add(scroll);
		
		addButton.addActionListener(this);
		clearButton.addActionListener(this);
		deleteButton.addActionListener(this);
		updateButton.addActionListener(this);
		table.addMouseListener (new MouseAdapter() {
			public void mouseClicked (MouseEvent me)
			{
				int numberOfRow= table.getSelectedRow();
				
				String f_name = model.getValueAt(numberOfRow,0).toString();
				String l_name = model.getValueAt(numberOfRow,1).toString();
				String id = model.getValueAt(numberOfRow,2).toString();
				String phone = model.getValueAt(numberOfRow,3).toString();
				String cgpa = model.getValueAt(numberOfRow,4).toString();
				String D = model.getValueAt(numberOfRow,5).toString();
				fnTf.setText(f_name);
				lnTf.setText(l_name);
				idTf.setText(id);
				phoneTf.setText(phone);
				gpaTf.setText(cgpa);
				DTf.setText(D);
			}
			
		});
		
	}
	@Override
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()== addButton) 
		{
			rows[0]= fnTf.getText ();
			rows[1]= lnTf.getText ();
			rows[2]= idTf.getText ();
			rows[3]= phoneTf.getText ();
			rows[4]= gpaTf.getText ();
			rows[5]= DTf.getText ();
			model.addRow(rows);
		}
		else if (e.getSource()== clearButton)
		{
			fnTf.setText("");
			lnTf.setText("");
			idTf.setText("");
			phoneTf.setText("");
			gpaTf.setText("");
			DTf.setText("");
			
		}
		else if (e.getSource()== deleteButton)
		{
			int numberOfRow=table.getSelectedRow();
			if (numberOfRow>=0)
			{
				model.removeRow(numberOfRow);
			}
			
			else {
				JOptionPane.showMessageDialog(null,"You haven't selected any row!");
			}
		}
		
		else if (e.getSource()== updateButton) {
			int numberOfRow = table.getSelectedRow();

			String f_name=fnTf.getText();
			String l_name=lnTf.getText();
			String id=idTf.getText();
			String phone=phoneTf.getText();
			String gpa=gpaTf.getText();
			String D=DTf.getText();
			
			model.setValueAt(f_name, numberOfRow,0);
			model.setValueAt(l_name, numberOfRow,1);
			model.setValueAt(id, numberOfRow,2);
			model.setValueAt(phone, numberOfRow,3);
			model.setValueAt(gpa, numberOfRow,4);
			model.setValueAt(D, numberOfRow,5);
			
		}
		
	}
	
	public static void main (String[] args) {
		
		StudentTable frame = new StudentTable();
		frame.setVisible(true);
		
	}

		
		
		
		
		
		
	}


