import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;


public class Login extends JFrame implements ActionListener{
	
	JFrame Login ;
	JPanel mainPane  ;
	JLabel lblUser, lblPass,lblPhoto, lblLogo;
	JTextField ut , pt;
	JButton btnLogin , btnSignup , btnBack,btnAdmin;
	JPasswordField pf;
	public static String Un;
	
	public Login(){
	
	
	super(" BiyerDhum ");
this.setSize(854,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		
		
		ImageIcon img = new ImageIcon("Images/LoginPage.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(854,480,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		lblLogo = new JLabel("",img,JLabel.CENTER);
		lblLogo.setBounds(-190,150,854,480);
		
		this.add(lblLogo);
		

       

	
	
	
	
	
	lblUser = new JLabel();
	lblUser.setText("User name:");  //set text of label
	lblUser.setFont(new Font("Cambria Math",Font.PLAIN,20));
	lblUser.setOpaque(false);
	lblUser.setForeground(Color.white);
	lblUser.setBounds(460,200,300,25);
	this.add(lblUser);
	
	
	lblPass = new JLabel();
	lblPass.setText("Password:");  //set text of label
	lblPass.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
	lblPass.setForeground(Color.WHITE);
	lblPass.setBounds(460,250,300,25);
	this.add(lblPass);
	
	
	ut = new JTextField();
	ut.setBounds(590,200,120,20);
	this.add(ut);
	
	
	pf = new JPasswordField();
	pf.setBounds(590,250,120,20);		
	this.add(pf);

	
	btnLogin = new JButton("Login");
	btnLogin.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnLogin.setForeground(Color.black);
	btnLogin.setBackground(Color.WHITE);
	btnLogin.setBounds(620,420,80,25);
	btnLogin.addActionListener(this);
	
	
	
	this.add(btnLogin);
	
	
	btnSignup = new JButton("Sign Up");
	btnSignup.setFont(new Font("Comic Sans MS",Font.BOLD,15));
	btnSignup.setForeground(Color.black);
	btnSignup.setBackground(Color.WHITE);
	
	btnSignup.setBounds(720,420,100,25);
	btnSignup.addActionListener(this);
	
	
        
	this.add(btnSignup);
	

	
	
	
	this.add(lblLogo);
	
	
	
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource()==btnLogin){
				
		        String userName = ut.getText();
			    String userPassword = pf.getText();
			    CreateUserAccount cua1 = new CreateUserAccount();
			
				
				if(cua1.getAccount(userName, userPassword)){
					JOptionPane.showMessageDialog(this,"Login Successful");
					SelectReligion h1 = new SelectReligion();
					//s1.addService(userName);
					this.setVisible(false);
					h1.setVisible(true);
					
				}
				else{JOptionPane.showMessageDialog(this, "Invalid UserName/Password", "INVALID", JOptionPane.WARNING_MESSAGE);}
			}
			
			else if
			(ae.getSource()==btnSignup){
				this.setVisible(false);
				Signup s = new Signup();
				s.setVisible(true);
				
			}
		
			
			
			
		}
		
		public static void main (String args[])
		{
			Login l= new Login();
			l.show();
			
		}
}
