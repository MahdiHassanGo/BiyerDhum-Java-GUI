import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PaymentPage1 extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c0,c1,c2,c3,c4;
		
		PaymentPage1(){
			
			super(" BiyerDhum ");
			
		this.setSize(854,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		ImageIcon img = new ImageIcon("Images/PaymentPage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(854,480,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(-190,-220,854,480);
		
		c1 = new JRadioButton("");
		c1.setBounds(200,250, 30,20);  
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Arial",Font.BOLD,33));
		this.add(c1);
		c2 = new JRadioButton("");
		c2.setBounds(600,280, 30,20); 
		c2.setFont(new Font("Arial",Font.BOLD,33));
		c2.setBackground(Color.WHITE);
		this.add(c2);
		
		bg1 = new ButtonGroup();
		bg1.add(c1);
		bg1.add(c2);
		
			b1 = new JButton("Back");
		b1.setFont(new Font("Abadi",Font.BOLD,15));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setBounds(720,390,80,25);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Abadi",Font.BOLD,15));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setBounds(620,390,80,25);
		b2.addActionListener(this);
		this.add(b2);
		this.add(l1);
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				MuslimPackage f = new MuslimPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if (ae.getSource()==b2)
			{  
		      if (c2.isSelected())
		{
				BkashPayment1 f= new BkashPayment1();
				this.setVisible(false);
				f.setVisible(true);
		}
		else if (c1.isSelected())
		{
			NagadPayment1 n = new NagadPayment1();
			this.setVisible(false);
			n.setVisible(true);
		}
		else {
			 JOptionPane.showMessageDialog(null, "You forgot to select your payment method.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
		}
				
			}
			
		}
		public static void main(String args [])
		{
			
			PaymentPage1 p = new PaymentPage1();
			p.show();
			
		}
}