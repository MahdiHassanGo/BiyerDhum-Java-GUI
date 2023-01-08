import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HinduPackage extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
		JTextField t1,t3,t4,t5,t6;
		JButton b1,b2,b3,b5; 
		JPanel p1,p2;
		JPasswordField t2;
		ButtonGroup bg1;
		JRadioButton c1,c2,c3,c4;
		
		HinduPackage(){
			
		this.setSize(854,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		
		ImageIcon img = new ImageIcon("Images/HinduPackage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(854,480,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(-300,-700,854,480);
			
			
		
		        b1 = new JButton("Back");
		b1.setFont(new Font("Abadi",Font.BOLD,15));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.white);
		b1.setBounds(720,420,80,25);
		b1.addActionListener(this);
		this.add(b1);
		
		b2 = new JButton("Next");
		b2.setFont(new Font("Abadi",Font.BOLD,15));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.white);
		b2.setBounds(620,420,80,25);
		b2.addActionListener(this);
		this.add(b2);
			
		
		this.add(l1);
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
				SelectReligion f = new SelectReligion();
				this.setVisible(false);
				f.setVisible(true);
		}
		else if(ae.getSource()==b2)
			{
				JOptionPane.showMessageDialog(null, "Total Cost : 400000tk" , "BiyerDhum!",
                                JOptionPane.INFORMATION_MESSAGE);
				ConfirmPaymentPage2 f = new ConfirmPaymentPage2();
				this.setVisible(false);
				f.setVisible(true);
		}
		
		}
		public static void main(String args[])
		{
			HinduPackage p = new HinduPackage();
			p.show();
			
			
		}
}