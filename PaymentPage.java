import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PaymentPage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c0,c1,c2,c3,c4;
		
		PaymentPage(){
			
			super(" BiyerDhum ");
			
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		ImageIcon img = new ImageIcon("Images/PaymentPage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(1550,850,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(-190,-220,1919,1079);
		
		c1 = new JRadioButton("");
		c1.setBounds(420,480, 30,20);  
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Arial",Font.BOLD,33));
		this.add(c1);
		c2 = new JRadioButton("");
		c2.setBounds(1100,500, 30,20); 
		c2.setFont(new Font("Arial",Font.BOLD,33));
		c2.setBackground(Color.WHITE);
		this.add(c2);
		
		bg1 = new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Arial",Font.BOLD,20));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setBounds(1000,720,120,35);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Arial",Font.BOLD,20));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setBounds(1280,720,120,35);
		b2.addActionListener(this);
		this.add(b2);
		this.add(l1);
		}
		
				
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				Form5 f = new Form5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if (ae.getSource()==b2)
			{
				Form5 f= new Form5();
				this.setVisible(false);
				f.setVisible(true);
				
			}
			else if (ae.getSource()==c1)
			{
				Form5 f= new Form5();
				this.setVisible(false);
				f.setVisible(true);
				
			}
			else if (ae.getSource()== c2)
			{
				Form5 f= new Form5();
				this.setVisible(false);
				f.setVisible(true);
				
			}
		}
		public static void main(String args [])
		{
			
			PaymentPage p = new PaymentPage();
			p.show();
			
		}
}