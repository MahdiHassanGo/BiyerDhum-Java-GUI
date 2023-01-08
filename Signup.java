import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Signup extends JFrame implements ActionListener{
	
	JFrame Signup ;
	JPanel mainPane ;
	JLabel lblUser,  lblPhone , lblEmail , lblFullName , lblGender, lblNid, lblPass , lblConfirm, lblLogo,l1;
	JTextField tUserName , tPhone, tEmail, tFullName, tDateOfBirth, tNid, tPass, tConfirm;
	JButton signupBtn , backBtn , b3;
	JRadioButton rsignupBtn, rbackBtn, rb3;
	
	public Signup(){
	super(" BiyerDhum ");
	
this.setSize(750,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);

	
	mainPane = new JPanel();
	mainPane.setSize(new Dimension(450,280));
	mainPane.setBackground(Color.black);
	mainPane.setLayout(null);
    this.add(mainPane);
	
	l1 = new JLabel("Create Profile");
		l1.setFont(new Font("Arial",Font.PLAIN,30));
		l1.setForeground(Color.white);
		l1.setBounds(260,20,400,30);
		mainPane.add(l1);

	
	lblFullName = new JLabel("Full Name :");
    lblFullName.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblFullName.setForeground(Color.white);
	lblFullName.setBounds(100,110,150,50);
	mainPane.add(lblFullName);
	
	lblUser = new JLabel();
	lblUser.setText("User name :");  //set text of label
	lblUser.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblUser.setForeground(Color.white);
	lblUser.setBounds(100,160,150,50);
	mainPane.add(lblUser);
	
	
	lblPhone = new JLabel();
	lblPhone.setText("Phone:");  //set text of label
	lblPhone.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblPhone.setForeground(Color.white);
	lblPhone.setBounds(100,190,150,50);
	mainPane.add(lblPhone);
	
	
	lblEmail = new JLabel("Email :");
    lblEmail.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblEmail.setForeground(Color.white);
	lblEmail.setBounds(100,230,150,40);
	mainPane.add(lblEmail);
	
	lblGender = new JLabel("Gender :");
    lblGender.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblGender.setForeground(Color.white);
	lblGender.setBounds(100,260,150,40);
	mainPane.add(lblGender);
	
	lblNid = new JLabel("Nid No :");
    lblNid.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblNid.setForeground(Color.white);
	lblNid.setBounds(100,290,150,40);
	mainPane.add(lblNid);
	
	lblPass = new JLabel("New Password :");
    lblPass.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblPass.setForeground(Color.white);
	lblPass.setBounds(100,330,150,40);
	mainPane.add(lblPass);
	
	lblConfirm = new JLabel("Confirm Password :");
    lblConfirm.setFont(new Font("Cooper Black MS",Font.PLAIN,20));
	lblConfirm.setForeground(Color.white);
	lblConfirm.setBounds(100,390,190,40);
	mainPane.add(lblConfirm);
	
	
	
	tFullName = new JTextField();
	tFullName.setBounds(270,125,220,25);
	mainPane.add(tFullName);
	
	tUserName = new JTextField();
	tUserName.setBounds(270,170,220,25);
	mainPane.add(tUserName);

	tPhone = new JTextField();
	tPhone.setBounds(270,200,220,25);
	mainPane.add(tPhone); 
	
	tEmail = new JTextField();
	tEmail.setBounds(270,240,220,25);
	mainPane.add(tEmail);
	
	
	rsignupBtn=new JRadioButton("Male");    
    rsignupBtn.setBounds(270,270,60,20);
    mainPane.add(rsignupBtn);	
	
    rbackBtn=new JRadioButton("Female");    
    rbackBtn.setBounds(340,270,70,20);
	mainPane.add(rbackBtn);
	
	rb3=new JRadioButton("Other");    
    rb3.setBounds(420,270,70,20);
	mainPane.add(rb3);
	
	ButtonGroup g1 = new ButtonGroup();
	g1.add(rsignupBtn);
	g1.add(rbackBtn);
	g1.add(rb3);
	
	/* tDateOfBirth = new JTextField();
	tDateOfBirth.setBounds(240,150,150,20);
	mainPane.add(tDateOfBirth); */
	
	tNid = new JTextField();
	tNid.setBounds(270,300,220,25);
	mainPane.add(tNid);
	
	tPass = new JTextField();
	tPass.setBounds(270,340,220,30);
	mainPane.add(tPass);
	
	tConfirm = new JTextField();
	tConfirm.setBounds(290,390,200,30);
	mainPane.add(tConfirm);


	
	signupBtn = new JButton(" Sign Up ");
	signupBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	signupBtn.setForeground(Color.black);
	signupBtn.setBackground(Color.WHITE);
	signupBtn.setBounds(550,500,125,25);
	signupBtn.setFocusable(false);
	signupBtn.setBorder(null);
	signupBtn.addActionListener(this);
	signupBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    signupBtn.setBackground(Color.GRAY);  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			signupBtn.setBackground(Color.WHITE); 
			
		}
    });
	mainPane.add(signupBtn);
	
	
    backBtn = new JButton("Back");
	backBtn.setFont(new Font("Comic Sans MS",Font.BOLD,16));
	backBtn.setForeground(Color.black);
	backBtn.setBackground(Color.WHITE);
	backBtn.setBounds(90,500,125,25);
	backBtn.setFocusable(false);
	backBtn.setBorder(null);
	backBtn.addActionListener(this);
	backBtn.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent evt){
			
		    backBtn.setBackground(Color.GRAY);  
			  
		}	
        @Override
        public void mouseExited(MouseEvent evt){
			
			backBtn.setBackground(Color.WHITE); 
			
		}
    });
	mainPane.add(backBtn);
	
	
	}
	
/* 	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==signupBtn)
			{
				String fullName = fn.getText();
                String Nid = Nid.getText();
                String userEmail = em.getText();
                String userName = un.getText();
                String userPassword = pw.getText();
                String userPasswordConfirm = cp.getText();
				
			}
			else if(ae.getSource()==backBtn){
				
				this.setVisible(false);
				Login l3 = new Login();
				l3.setVisible(true);
			}
			
			
			
		} */
	
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==signupBtn)
        {
            String fullName = tFullName.getText();
            String Nid = tNid.getText();
            String userEmail = tEmail.getText();
            String userName = tUserName.getText();
            String userPassword = tPass.getText();
            String userPasswordConfirm = tConfirm.getText();

            if(fullName.isEmpty() ||  Nid.isEmpty() || userEmail.isEmpty() || userName.isEmpty() || userPassword.isEmpty() || userPasswordConfirm.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
            }
            else if(userPassword.equals(userPasswordConfirm))
            {
                CreateUserAccount cua1 = new CreateUserAccount(fullName, Nid, userEmail, userName, userPassword);
                cua1.addAccount();
                JOptionPane.showMessageDialog(this, "Account Added");
                tUserName.setText("");
                tNid.setText("");
                tEmail.setText("");
                tUserName.setText("");
                tPass.setText("");
                tConfirm.setText("");
				
				this.setVisible(false);
				Login l1 = new Login();
				l1.setVisible(true);
				
            }
            else{JOptionPane.showMessageDialog(this, "Check Password");}

            
        }
        else if(ae.getSource()==backBtn)
        {
            this.setVisible(false);
			Login l1 = new Login();
			l1.setVisible(true);
        }
    }
	
	public static void main (String args[])
	{
		Signup s= new Signup();
		s.show();
	}
	
}
