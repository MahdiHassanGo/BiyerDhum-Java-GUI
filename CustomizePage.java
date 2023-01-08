import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;

public class CustomizePage extends JFrame {

    private Container c;
	private JLabel l1;
    private ImageIcon icon, logo;
    private JLabel label0, label1, imgLabel;
    private Font f1, f2, f3, f4, f5, f6;
    private JComboBox cb1, cb2, cb3, cb4, cb5, cb6, cb7;
    private JButton btn1, btn2, btn3, btn4, nBtn;
    private Cursor cursor;

    CustomizePage() {
        	super(" BiyerDhum ");
			
		this.setSize(954,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.setVisible(true);
		this.setResizable(false);
		
ImageIcon img = new ImageIcon("Images/CustomizePannel.png");
		Image i= img.getImage();
		Image new_img = i.getScaledInstance(954,600,Image.SCALE_SMOOTH);
       	img = new ImageIcon(new_img);
		l1 = new JLabel("",img,JLabel.CENTER);
		l1.setBounds(0,0,954,580);
		
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
   /*     icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(30, 65, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
*/
        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 12);
        f5 = new Font("Segoe UI", Font.PLAIN, 15);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

       
        cursor = new Cursor(Cursor.HAND_CURSOR);

       
       

       
        label1 = new JLabel();
        label1.setText("Select Function");
        label1.setBounds(32,200, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb1Str = { "Choose Your Function...", "Haldi", "Wedding","Wedding-Reciption" };
        cb1 = new JComboBox(cb1Str);
        cb1.setBounds(170,210, 200, 30);
        cb1.setSelectedIndex(0);
        cb1.setFont(f5);
        cb1.setBackground(Color.WHITE);
        c.add(cb1);

  
        label0 = new JLabel();
        label0.setText("Select People Number");
        label0.setBounds(32,250, 200, 50);
        label0.setFont(f4);
        c.add(label0);

        String[] cb2Str = { "How " };
        cb2 = new JComboBox(cb2Str);
        cb2.setBounds(170,260, 200, 30);
        cb2.setSelectedIndex(0);
        cb2.setFont(f5);
        cb2.setBackground(Color.WHITE);
        cb2.disable();
        c.add(cb2);

        // Person
        label1 = new JLabel();
        label1.setText("Select Place");
        label1.setBounds(32,300, 200, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb3Str = { "Select Place ...", "Kushiara International Convention Hall", "Celebrity Convention Hall", "InterContinental Dhaka", "Dhaka Regency Hotel & Resor", "FARS Hotel & Resorts" };
        cb3 = new JComboBox(cb3Str);
        cb3.setBounds(170,310, 200, 30);
        cb3.setSelectedIndex(0);
        cb3.setFont(f5);
        cb3.setBackground(Color.WHITE);
        c.add(cb3);

        // Days
        label1 = new JLabel();
        label1.setText("Main Course");
        label1.setBounds(32,350, 200, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb4Str = { "Select Main Course...", "Chicken Biriyani", "Kacchi", "Shada Polaw", "Fried Rice" };
        cb4 = new JComboBox(cb4Str);
        cb4.setBounds(170,360, 200, 30);
        cb4.setSelectedIndex(0);
        cb4.setFont(f5);
        cb4.setBackground(Color.WHITE);
        c.add(cb4);

        // Hotel
        label1 = new JLabel();
        label1.setText("Desert");
        label1.setBounds(32,400, 200, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] cb5Str = { "Select Function first!" };
        cb5 = new JComboBox(cb5Str);
        cb5.setBounds(170,410, 200, 30);
        cb5.setSelectedIndex(0);
        cb5.setFont(f5);
        cb5.setBackground(Color.WHITE);
        cb5.disable();
        c.add(cb5);

        // Travel By
        

        // JButtons
        btn1 = new JButton("");
        btn1.setBounds(53, 300, 0, 0);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(53, 470, 120, 30);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#C00000"));
        c.add(btn2);

        btn4 = new JButton("");
        btn4.setBounds(450, 800, 0, 0);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        c.add(btn4);

        btn3 = new JButton("Next");
        btn3.setBounds(240, 470, 120, 30);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);

        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        cb1.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent ae) {
                int s = cb1.getSelectedIndex();
                if (s == 0) {
                    label0.setText("Select People Number");
                    cb2.removeAllItems();
                    cb2.addItem("Choose people number first!");
                    cb2.disable();
                    cb5.removeAllItems();
                    
                    
                } else if (s == 1) {
                    label0.setText("Select People Number");
                    cb2.removeAllItems();
                    cb2.addItem("How...");
                    
                    cb2.addItem("700");
                    cb2.addItem("900");
                    cb2.addItem("1200");
                    cb2.enable();
                    cb5.removeAllItems();
                    cb5.addItem("Choose Desert...");
                    cb5.addItem("Firni/Jilapi/Misti");
                    cb5.addItem("Kheer/Rabri/Faluda");
                    cb5.addItem("Ice Cream/ Pastry");
                    cb5.enable();
                  
                } else if (s == 2) {
                      label0.setText("Select People Number");
                    cb2.removeAllItems();
                    cb2.addItem("How...");
                    
                    cb2.addItem("700");
                    cb2.addItem("900");
                    cb2.addItem("1200");
                    cb2.enable();
                    cb5.removeAllItems();
                    cb5.addItem("Choose Desert...");
                    cb5.addItem("Firni/Jilapi/Misti");
                    cb5.addItem("Kheer/Rabri/Faluda");
                    cb5.addItem("Ice Cream/ Pastry");
                    cb5.enable();
                }
				else if (s == 3) {
                                        label0.setText("Select People Number");
                    cb2.removeAllItems();
                    cb2.addItem("How...");
                    
                    cb2.addItem("700");
                    cb2.addItem("900");
                    cb2.addItem("1200");
                    cb2.enable();
				
					
					cb4.removeAllItems();
					 cb4.addItem("Select Main Course...");
					 cb4.addItem("Bread and Butter");
					 cb4.addItem("Soup and Fried Rice");
                     cb4.addItem("Shada Polaw");
                    
                  
                    cb4.enable();
					
                    cb5.removeAllItems();
                    cb5.addItem("Choose Desert...");
                    cb5.addItem("Wedding Cake");
                    cb5.addItem("Misti");
                    cb5.addItem("Ice Cream");
                    cb5.enable();
                }
				
            }
        });


        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                SelectReligion frame = new SelectReligion();
                frame.setVisible(true);
            }
        });

      
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                CustomizePage frame = new CustomizePage();
                frame.setVisible(true);
            }
        });

      
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if ((cb1.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Function.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb2.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select People Number.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb3.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Place.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb4.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Main Course.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else if ((cb5.getSelectedIndex()) == 0) {
                    JOptionPane.showMessageDialog(null, "You forgot to select Desert.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }  else {
                    if ((cb1.getSelectedIndex()) == 1) {
                        int cb1Cost=0;
                        int cb2Cost = 0;
						 int cb4Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 140000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 210000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 126000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 105000;
                            }
                        } else if (cb2.getSelectedIndex() == 2) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 180000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 270000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 162000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 135000;
                            }
                        } else if (cb2.getSelectedIndex() == 3) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 240000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 360000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 216000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 180000;
                            }
                        }
                        
						
                       
						int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 4000;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 6000;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 9000;
                       
						}
                        cb1Cost = cb5Cost;
                         int cb3Cost=0;
						  if (cb3.getSelectedIndex() == 1) {
                            cb3Cost = 100000;
                        } else if (cb3.getSelectedIndex() == 2) {
                            cb3Cost = 150000;
                        } else if (cb3.getSelectedIndex() == 3) {
                            cb3Cost = 0;
                       
						}
						else if (cb3.getSelectedIndex() == 4) {
                            cb3Cost = 0;
                       
						}
						else if (cb3.getSelectedIndex() == 5) {
                            cb3Cost = 0;
                       
						}
						
						
                        int totalCost = cb1Cost + cb4Cost+ cb3Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : tk" + totalCost, "BiyerDhum!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
							ConfirmPaymentPage4 frame = new ConfirmPaymentPage4();
                        frame.setVisible(true);

                    } else if ((cb1.getSelectedIndex()) == 2) {
                         int cb1Cost=0;
                        int cb2Cost = 0;
						 int cb4Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 180000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 270000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 146000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 189000;
                            }
                        } else if (cb2.getSelectedIndex() == 2) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 20000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 290000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 212000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 175000;
                            }
                        } else if (cb2.getSelectedIndex() == 3) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 290000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 400000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 878000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 290000;
                            }
                        }
                        
						
                       
						int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 4000;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 6000;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 9000;
                       
						}
                        cb1Cost = cb5Cost;
                         int cb3Cost=0;
						  if (cb3.getSelectedIndex() == 1) {
                            cb3Cost = 100000;
                        } else if (cb3.getSelectedIndex() == 2) {
                            cb3Cost = 150000;
                        } else if (cb3.getSelectedIndex() == 3) {
                            cb3Cost = 0;
                       
						}
						else if (cb3.getSelectedIndex() == 4) {
                            cb3Cost = 0;
                       
						}
						else if (cb3.getSelectedIndex() == 5) {
                            cb3Cost = 0;
                       
						}
						
						
                        int totalCost = cb1Cost + cb4Cost+ cb3Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : tk" + totalCost, "BiyerDhum!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
							ConfirmPaymentPage4 frame = new ConfirmPaymentPage4();
                        frame.setVisible(true);
						
					}
					else if ((cb1.getSelectedIndex()) == 3) {
                         int cb1Cost=0;
                        int cb2Cost = 0;
						 int cb4Cost = 0;

                        if (cb2.getSelectedIndex() == 1) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 140000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 210000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 126000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 105000;
                            }
							else if (cb4.getSelectedIndex() == 5) {
                                cb4Cost = 84000;
                            }
                        } else if (cb2.getSelectedIndex() == 2) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 180000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 270000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 162000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 135000;
                            }
							else if (cb4.getSelectedIndex() == 5) {
                                cb4Cost = 108000;
                            }
                        } else if (cb2.getSelectedIndex() == 3) {
                            if (cb4.getSelectedIndex() == 1) {
                                cb4Cost = 240000;
                            } else if (cb4.getSelectedIndex() == 2) {
                                cb4Cost = 360000;
                            } else if (cb4.getSelectedIndex() == 3) {
                                cb4Cost = 216000;
                            } else if (cb4.getSelectedIndex() == 4) {
                                cb4Cost = 180000;
                            }
							else if (cb4.getSelectedIndex() == 5) {
                                cb4Cost = 144000;
                            }
                        }
                        
						
                       
						int cb5Cost = 0;

                        if (cb5.getSelectedIndex() == 1) {
                            cb5Cost = 4000;
                        } else if (cb5.getSelectedIndex() == 2) {
                            cb5Cost = 6000;
                        } else if (cb5.getSelectedIndex() == 3) {
                            cb5Cost = 9000;
                       
						}
                        cb1Cost = cb5Cost;
                         int cb3Cost=0;
						  if (cb3.getSelectedIndex() == 1) {
                            cb3Cost = 100000;
                        } else if (cb3.getSelectedIndex() == 2) {
                            cb3Cost = 150000;
                        } else if (cb3.getSelectedIndex() == 3) {
                            cb3Cost = 200000;
                       
						}
						else if (cb3.getSelectedIndex() == 4) {
                            cb3Cost = 250000;
                       
						}
						else if (cb3.getSelectedIndex() == 5) {
                            cb3Cost = 300000;
                       
						}
						
						
                        int totalCost = cb1Cost + cb4Cost+ cb3Cost;

                        JOptionPane.showMessageDialog(null, "Total Cost : tk" + totalCost, "BiyerDhum!",
                                JOptionPane.INFORMATION_MESSAGE);

                        setVisible(false);
							ConfirmPaymentPage4 frame = new ConfirmPaymentPage4();
                        frame.setVisible(true);
                    }
                }
            }
        });
		this .add(l1);
    }

    public static void main(String[] args) {

        CustomizePage frame = new CustomizePage();
        frame.setVisible(true);
    }
}
