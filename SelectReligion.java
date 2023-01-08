import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SelectReligion extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c1,c2,c3,c4;
		
		SelectReligion(){
			
			super(" BiyerDhum ");
			
		this.setSize(854,480);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		
		
		ImageIcon img = new ImageIcon("Images/ReligionPannel.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(854,480,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(100,100,854,480);
        
		l2 = new JLabel("Select your package");
		l2.setFont(new Font("Brush Script MT",Font.PLAIN,35));
		l2.setForeground(Color.BLACK);
		l2.setBounds(40,20,400,65);
		this.add(l2);
		
		b1 = new JButton("Back");
		b1.setFont(new Font("Abadi",Font.BOLD,25));
		b1.setBackground(Color.decode("#a5c249"));
		b1.setForeground(Color.black);
		b1.setBounds(680,50,100,30);
		b1.addActionListener(this);
		
		 b2 = new JButton("Muslim");
		b2.setFont(new Font("Arial",Font.BOLD,25));
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(60,90,190,40);
		b2.addActionListener(this);
	     this.add(b2);
		 
		 b3 = new JButton("Hindu");
		b3.setFont(new Font("Arial",Font.BOLD,25));
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(60,160,190,40);
		b3.addActionListener(this);
	     this.add(b3);

		b4 = new JButton("Christian");
		b4.setFont(new Font("Arial",Font.BOLD,25));
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(60,230,190,40);
		b4.addActionListener(this);
	     this.add(b4);
		 
		b5 = new JButton("Customize");
		b5.setFont(new Font("Arial",Font.BOLD,25));
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.setBounds(60,300,190,40);
		b5.addActionListener(this);
	     this.add(b5);
		 
	     this.add(b1);
		this.add(l1);
		
		}
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==b1)
			{
				Login f = new Login();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				MuslimPackage f = new MuslimPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				HinduPackage f = new HinduPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b4)
			{
				ChristianPackage f = new ChristianPackage();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if(ae.getSource()==b5)
			{
				
				CustomizePage f = new CustomizePage();
				this.setVisible(false);
				f.setVisible(true);
			}
			}
		public static void main(String args [])
		{
			SelectReligion s= new SelectReligion();
			s.show();
			
			
		}		
		
}