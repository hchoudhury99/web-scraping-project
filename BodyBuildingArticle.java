import java.awt.EventQueue;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import java.awt.CardLayout;
import java.awt.Desktop;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.swing.JTextPane;

// Main BodyBuildingArticle class.
public class BodyBuildingArticle {

	// This makes sure there are no problems if the panels are not in order.
	private JFrame frame;
	private JPanel Mainpanel;
	private JPanel Loginpanel;
	private JPanel Registerpanel;
	private JPanel Imagepanel;
	private JPanel Article6panel;
	private JPanel Article5panel;
	private JPanel Article4panel;
	private JPanel Article3panel;
	private JPanel Article2panel;
	private JPanel Articlepanel;
	private JPanel Searchpanel;
	private JPanel Transactionpanel;
	private JTextField textField;
	private JPasswordField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	// Main method.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					BodyBuildingArticle window = new BodyBuildingArticle();
					window.frame.setVisible(true);
				} // try 
				
				catch (Exception e) {
					e.printStackTrace();
				} // catch 
			} // run
		}); // Event
	} // main
	
	// calls initialize method.
	public BodyBuildingArticle() {
		initialize();
	}
	
	// Initialize method.
	private void initialize() {
		frame = new JFrame(); // create new JFrame for GUI.
		frame.setBounds(100, 100, 600, 320); // set bounds for the frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel Mainpanel = new JPanel(); // create new JPanel for GUI.
		frame.getContentPane().add(Mainpanel, "MainPanel");
		Mainpanel.setVisible(true);
		
		final JPanel Loginpanel = new JPanel(); // create new JPanel for GUI.
		frame.getContentPane().add(Loginpanel, "LoginPanel");
		Loginpanel.setLayout(null);
		
		JLabel lblUsername = new JLabel("UserName:"); // create new JLabel for Login panel.
		lblUsername.setBounds(136, 82, 70, 14);
		Loginpanel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("PassWord:"); // create new JLabel for Login panel.
		lblPassword.setBounds(136, 129, 70, 17);
		Loginpanel.add(lblPassword);
		
		textField = new JTextField(); // create new JTextField for Login panel where user enters user name.
		textField.setBounds(240, 79, 235, 20);
		Loginpanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField(); // create new JPasswordField for Login panel where user enters password.
		textField_1.setBounds(240, 127, 235, 20);
		Loginpanel.add(textField_1);
		textField_1.setColumns(10);
		
		final JPanel Registerpanel = new JPanel(); // create new JPanel for GUI.
		frame.getContentPane().add(Registerpanel, "RegisterPanel");
		Registerpanel.setLayout(null);
		
		JLabel lblSetUsername = new JLabel("Set UserName:"); // create new JLabel for Register panel.
		lblSetUsername.setBounds(117, 82, 72, 14);
		Registerpanel.add(lblSetUsername);
		
		JLabel lblSetPassword = new JLabel("Set PassWord:"); // create new JLabel for Register panel.
		lblSetPassword.setBounds(117, 126, 72, 14);
		Registerpanel.add(lblSetPassword);
		Registerpanel.setVisible(false);
		
		textField_2 = new JTextField(); // create new JTextField for Registration panel where user set user name.
		textField_2.setBounds(240, 79, 235, 20);
		Registerpanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(); // create new JTextField for Registration panel where user sets password.
		textField_3.setBounds(240, 123, 235, 20);
		Registerpanel.add(textField_3);
		textField_3.setColumns(10);
		
		final JPanel Article6panel = new JPanel(); // create new JPanel for GUI.
		frame.getContentPane().add(Article6panel, "Article5panel");
		Article6panel.setLayout(null);
		
		JButton btnReturn = new JButton("Return >"); // create new JButton for article panel 6.
		btnReturn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Return > button.
				
				Article6panel.setVisible(false); // set visibility of Article panel 6 to false.
				Mainpanel.setVisible(true); // set visibility of Main panel to true.
			} // actionPerformed
		}); // ActionListener
		btnReturn.setBounds(495, 258, 89, 23);
		Article6panel.add(btnReturn);
		
		JTextPane txtpnEndOfArticle = new JTextPane(); // create new JTextPanel for Article panel 6.
		txtpnEndOfArticle.setText("END OF ARTICLE LIST"); 
		txtpnEndOfArticle.setBounds(253, 120, 112, 20);
		Article6panel.add(txtpnEndOfArticle);
		
		final JPanel Article5panel = new JPanel(); // create new JPanle for GUI.
		frame.getContentPane().add(Article5panel, "Article6panel"); 
		Article5panel.setLayout(null);
		
		JButton btnNext_4 = new JButton("Next >"); // create new JButton for Article panel 5.
		btnNext_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Next > button.
				
				Article5panel.setVisible(false); // set visibility of Article panel 5 to false.
				Article6panel.setVisible(true); // set visibility of Article panel 6 to true.
			} // actionPerformed
		}); // ActionListener
		btnNext_4.setBounds(505, 247, 89, 23);
		Article5panel.add(btnNext_4);
		
		JButton btnTransformationchallenge_1 = new JButton("transformation-challenge-5"); // create new JButton for Article panel 5.
		btnTransformationchallenge_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for transformation-challenge-5 button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#49HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnTransformationchallenge_1.setBounds(0, 0, 594, 23);
		Article5panel.add(btnTransformationchallenge_1);
		
		JButton btnYourGuideTo = new JButton("YOUR GUIDE TO BUILDING NEXT-LEVEL LEGS"); // create new JButton for Article panel 5.
		btnYourGuideTo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for YOUR GUIDE TO BUILDING NEXT-LEVEL LEGS button
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#50HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnYourGuideTo.setBounds(0, 21, 594, 23);
		Article5panel.add(btnYourGuideTo);
		
		JButton btnPodcastEpisode_8 = new JButton("Podcast Episode 34: Hard-won Life and Lifting Lessons from KC Mitchell"); // create new JButton for Article panel 5.
		btnPodcastEpisode_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 34: Hard-won Life and Lifting Lessons from KC Mitchell button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#51HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode_8.setBounds(0, 44, 584, 23);
		Article5panel.add(btnPodcastEpisode_8);
		
		JButton btnThetotalbodydumbbellfix = new JButton("the-total-body-dumbbell-fix"); // create new JButton for Article panel 5. 
		btnThetotalbodydumbbellfix.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for the-total-body-dumbbell-fix button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#52HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerfomed
		}); // ActionListener
		btnThetotalbodydumbbellfix.setBounds(0, 67, 594, 23);
		Article5panel.add(btnThetotalbodydumbbellfix);
		
		JButton btnBenchyourweekplan = new JButton("bench-300-your-12-week-plan"); // create new JButton for Article panel 5.
		btnBenchyourweekplan.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for bench-300-your-12-week-plan button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#53HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnBenchyourweekplan.setBounds(0, 90, 594, 23);
		Article5panel.add(btnBenchyourweekplan);
		
		JButton btnThedaysixpack = new JButton("the-7-day-six-pack"); // create new JButton for Article panel 5.
		btnThedaysixpack.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for the-7-day-six-pack button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#54HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); //ActionListener
		btnThedaysixpack.setBounds(0, 112, 594, 23);
		Article5panel.add(btnThedaysixpack);
		
		JButton btnJackedin = new JButton("jacked-in-3"); // create new JButton for Article panel 5.
		btnJackedin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for jacked-in-3 button. 
				
				try { // try to find file. 
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#55HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btnJackedin.setBounds(0, 134, 584, 23);
		Article5panel.add(btnJackedin);
		
		JButton btnPodcastEpisode_9 = new JButton("Podcast Episode 33: The Science of Physique Enhancement with Dr. Bill Campbell"); // create new JButton for Article panel 5.
		btnPodcastEpisode_9.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { //action listener for Podcast Episode 33: The Science of Physique Enhancement with Dr. Bill Campbell button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#56HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); //ActionListener
		btnPodcastEpisode_9.setBounds(0, 156, 594, 23);
		Article5panel.add(btnPodcastEpisode_9);
		
		JButton btnPodcastEpisode_10 = new JButton("Podcast Episode 32: Cassandra Martin - Physique-Building by Old-School Lifting and... Construction Work?"); // create new JButton for Article panel 5.
		btnPodcastEpisode_10.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 32: Cassandra Martin - Physique-Building by Old-School Lifting and... Construction Work? button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#57HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode_10.setBounds(0, 180, 594, 23);
		Article5panel.add(btnPodcastEpisode_10);
		
		JButton btnUnlimitedAccessTo = new JButton("Unlimited access to over 50 fitness plans for your level, your goals."); // create new JButton for Article panel 5.
		btnUnlimitedAccessTo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Unlimited access to over 50 fitness plans for your level, your goals button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#58HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btnUnlimitedAccessTo.setBounds(0, 202, 594, 23);
		Article5panel.add(btnUnlimitedAccessTo);
		
		JButton btnHolidayFitGift = new JButton("HOLIDAY FIT GIFT GUIDE"); // create new JButton for Article panel 5.
		btnHolidayFitGift.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for HOLIDAY FIT GIFT GUIDE button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#59HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} //actionPerformed
		}); // ActionLisnener
		btnHolidayFitGift.setBounds(0, 225, 594, 23);
		Article5panel.add(btnHolidayFitGift);
		
		JButton btnPodcastEpisode_11 = new JButton("Podcast Episode 31: Brandan Fokken's Wild Fitness Journey"); // create new JButton for Article panel 5.
		btnPodcastEpisode_11.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 31: Brandan Fokken's Wild Fitness Journey button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#60HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not find.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode_11.setBounds(0, 247, 505, 23);
		Article5panel.add(btnPodcastEpisode_11);
		
		final JPanel Article4panel = new JPanel(); // create new JPanel for GUI.
		frame.getContentPane().add(Article4panel, "Article4panel");
		
		JButton btnNext_3 = new JButton("Next >"); // create new JButton for Article panel 4.
		btnNext_3.setBounds(495, 247, 89, 23);
		btnNext_3.addActionListener(new ActionListener() { 
			
			public void actionPerformed(ActionEvent e) { // action listener for Next > button. 
				
				Article4panel.setVisible(false); // set visibility of Article panel 4 to false.
				Article5panel.setVisible(true); // set visibility of Article panel 5 to true. 
			}
		});
		Article4panel.setLayout(null);
		Article4panel.add(btnNext_3);
		
		JButton btnPodcastEpisode_3 = new JButton("Podcast Episode 39: Kyler Jackson - The Larger Calling of Muscle Building"); // create new JButton for Article panel 4.
		btnPodcastEpisode_3.addActionListener(new ActionListener() { 
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 39: Kyler Jackson - The Larger Calling of Muscle Building button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#37HTML.html"));
				} // try 
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
				
			} // actionPerformed
		}); //ActionListener
		btnPodcastEpisode_3.setBounds(0, 0, 584, 23);
		Article4panel.add(btnPodcastEpisode_3);
		
		JButton btnPodcastEpisode_4 = new JButton("Podcast Episode 38: Straight talk on Protein and more with Dr. Jose Antonio"); // create new JButton for Article panel 4.
		btnPodcastEpisode_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 38: Straight talk on Protein and more with Dr. Jose Antonio button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#38HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode_4.setBounds(0, 22, 595, 23);
		Article4panel.add(btnPodcastEpisode_4);
		
		JButton btndaystoyourbestarms = new JButton("30-days-to-your-best-arms");  // create new JButton for Article panel 4.
		btndaystoyourbestarms.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for 30-days-to-your-best-arms button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#39HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found. 
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btndaystoyourbestarms.setBounds(0, 44, 595, 23);
		Article4panel.add(btndaystoyourbestarms);
		
		JButton btnPodcastEpisode_5 = new JButton("Podcast Episode 37: Jason Poston on Global Fitness, Training, and Blood Sugar"); // create new JButton for Article panel 4.
		btnPodcastEpisode_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 37: Jason Poston on Global Fitness, Training, and Blood Sugar button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#40HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode_5.setBounds(0, 67, 595, 23);
		Article4panel.add(btnPodcastEpisode_5);
		
		JButton btnTotalbodyStrongCalories = new JButton("Total-Body Strong: Calories and Macro Calculator"); // create new JButton for Article panel 4.
		btnTotalbodyStrongCalories.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Total-Body Strong: Calories and Macro Calculator button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#41HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btnTotalbodyStrongCalories.setBounds(0, 89, 595, 23);
		Article4panel.add(btnTotalbodyStrongCalories);
		
		JButton btnBodiesOfWork = new JButton("BODIES OF WORK: VOLUME 6"); // create new JButton for Article panel 4.
		btnBodiesOfWork.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for BODIES OF WORK: VOLUME 6 button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#42HTML.html"));
				} // try 
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed 
		}); // ActionListener
		btnBodiesOfWork.setBounds(0, 111, 584, 23);
		Article4panel.add(btnBodiesOfWork);
		
		JButton btnTotalbodystrong = new JButton("total-body-strong"); // create new JButton for Article panel 4.
		btnTotalbodystrong.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for total-body-strong button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#43HTML.html"));
				} // try 
				
				catch (Exception exe) { //  catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerfomed
		}); //ActionListener
		btnTotalbodystrong.setBounds(0, 133, 595, 23);
		Article4panel.add(btnTotalbodystrong);
		
		JButton btnPodcastEpisode_6 = new JButton("Podcast Episode 36: Larger-than-Life Lifting and Eating with Branch Warren"); // create new JButton for Article panel 4.
		btnPodcastEpisode_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 36: Larger-than-Life Lifting and Eating with Branch Warren button
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#44HTML.html"));
				} // try 
				
				catch (Exception exe) { // // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed 
		}); // ActionListener
		btnPodcastEpisode_6.setBounds(0, 157, 584, 23);
		Article4panel.add(btnPodcastEpisode_6);
		
		JButton btnChocolateChipCookie = new JButton("Chocolate Chip Cookie Dough Protein Bars"); // create new JButton for Article panel 4.
		btnChocolateChipCookie.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Chocolate Chip Cookie Dough Protein Bars button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#45HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnChocolateChipCookie.setBounds(0, 179, 584, 23);
		Article4panel.add(btnChocolateChipCookie);
		
		JButton btnHannahEdensFyr = new JButton("Hannah Eden's FYR: Calories and Macro Calculator"); // create new JButton for Article panel 4.
		btnHannahEdensFyr.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Hannah Eden's FYR: Calories and Macro Calculator button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#46HTML.html"));
				} // try 
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed 
		}); // ActionListener
		btnHannahEdensFyr.setBounds(0, 201, 595, 23);
		Article4panel.add(btnHannahEdensFyr);
		
		JButton btnPodcastEpisode_7 = new JButton("Podcast Episode 35: Taylor Chamberlain - Born into Bodybuilding"); // create new JButton for Article panel 4.
		btnPodcastEpisode_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Podcast Episode 35: Taylor Chamberlain - Born into Bodybuilding button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#47HTML.html"));
				} // try
				
				catch (Exception exe) { 
					// catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch
			} //actionPerformed
		}); // ActionListener 
		btnPodcastEpisode_7.setBounds(0, 223, 595, 23);
		Article4panel.add(btnPodcastEpisode_7);
		
		JButton btnFyrhannahedensdayfitnessplan = new JButton("fyr-hannah-edens-30-day-fitness-plan"); // create new JButton for Article panel 4.
		btnFyrhannahedensdayfitnessplan.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for fyr-hannah-edens-30-day-fitness-plan button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#48HTML.html"));
				}
				 // try
				catch (Exception exe) { // catch exception if file isn't found.
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed 
		});// ActionEvent 
		btnFyrhannahedensdayfitnessplan.setBounds(0, 247, 495, 23);
		Article4panel.add(btnFyrhannahedensdayfitnessplan);
		
		final JPanel Article3panel = new JPanel(); // create new JPanel for GUI.
		frame.getContentPane().add(Article3panel, "Article3panel");
		Article3panel.setLayout(null);
		
		JButton btnMinimalistMusclebuildingLeg = new JButton("Minimalist Muscle-Building Leg Workout"); // create new JButton for Article panel 3.
		btnMinimalistMusclebuildingLeg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Minimalist Muscle-Building Leg Workout button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#25HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
				
				
			} // actionPerformed.
		}); // ActionListener
		btnMinimalistMusclebuildingLeg.setBounds(0, 0, 597, 23);
		Article3panel.add(btnMinimalistMusclebuildingLeg);
		
		JButton btnAskTheSupplement = new JButton("Ask The Supplement Expert: Is Creatine OK With Keto?"); // create new JButton for Article panel 3.
		btnAskTheSupplement.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener for Ask The Supplement Expert: Is Creatine OK With Keto? button.
				
				try { // try to find file.
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#26HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception if file is not found.
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btnAskTheSupplement.setBounds(0, 23, 597, 23);
		Article3panel.add(btnAskTheSupplement);
		
		JButton btnSkyrocketYourSquat = new JButton("Skyrocket Your Squat PR With Conjugate Training"); // new JButton
		btnSkyrocketYourSquat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#27HTML.html"));
				} // try 
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); // ActionListener
		btnSkyrocketYourSquat.setBounds(0, 45, 597, 23);
		Article3panel.add(btnSkyrocketYourSquat);
		
		JButton btnTheHardestGain = new JButton("The Hardest Gain: One Writer's Lifelong Fitness Journey"); // new JButton
		btnTheHardestGain.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file 
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#28HTML.html"));
				}// try
				
				catch (Exception exe) { // catch exception 
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed 
		}); // ActionListener 
		btnTheHardestGain.setBounds(0, 68, 597, 23);
		Article3panel.add(btnTheHardestGain);
		
		JButton btnPascalRwabukambaThwarted = new JButton("Pascal Rwabukamba Thwarted Type 2 Diabetes By Losing 266 Pounds"); // new JButton
		btnPascalRwabukambaThwarted.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {// action listener 
				
				try { // try to find file 
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#29HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch
			} //actionPerformed
		}); //ActionListener 
		btnPascalRwabukambaThwarted.setBounds(0, 92, 597, 23);
		Article3panel.add(btnPascalRwabukambaThwarted);
		
		JButton btnChefRobertIrvine = new JButton("Chef Robert Irvine: Sweet Summer Street Corn"); // new JButton
		btnChefRobertIrvine.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener 
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#30HTML.html"));
				}// try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch
			} // actionPerfoermed 
		}); // ActionListener
		btnChefRobertIrvine.setBounds(0, 115, 597, 23);
		Article3panel.add(btnChefRobertIrvine);
		
		JButton btnPodcastEpisode = new JButton("Podcast Episode 42: Living Lean With Alpha M"); // new JButton
		btnPodcastEpisode.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file 
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#31HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode.setBounds(0, 137, 597, 23);
		Article3panel.add(btnPodcastEpisode);
		
		JButton btnAlphamtailoredweekstolivinglean = new JButton("alpha-m-tailored-6-weeks-to-living-lean"); // new JButton
		btnAlphamtailoredweekstolivinglean.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener 
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#32HTML.html"));
				} // try
				
				catch (Exception exe) { //catch exception
					exe.printStackTrace();
					
				}//catch
			} // actionPerformed
		}); //ActionListener
		btnAlphamtailoredweekstolivinglean.setBounds(0, 160, 597, 23);
		Article3panel.add(btnAlphamtailoredweekstolivinglean);
		
		JButton btnPodcastEpisode_1 = new JButton("Podcast Episode 41: Kris Gethin - Man of Ultra"); // new JButton
		btnPodcastEpisode_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener 
				
				try { // try to find file 
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#33HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch
			} // actionPerformed
		}); // ActionListener
		btnPodcastEpisode_1.setBounds(0, 182, 597, 23);
		Article3panel.add(btnPodcastEpisode_1);
		
		JButton btnTransformationchallenge = new JButton("transformation-challenge"); // new JButton
		btnTransformationchallenge.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#34HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				}// catch
			}//actionPerformed
		});//ActionListener
		btnTransformationchallenge.setBounds(0, 205, 597, 23);
		Article3panel.add(btnTransformationchallenge);
		
		JButton btnPodcastEpisode_2 = new JButton("Podcast Episode 40: Kym Nonstop on How to Build Your Body at Home"); // new JButton
		btnPodcastEpisode_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#35HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				}//catch
			}//actionPerformed
		}); //ActionListener
		btnPodcastEpisode_2.setBounds(0, 228, 597, 23);
		Article3panel.add(btnPodcastEpisode_2);
		
		JButton btnHomebodyweekathomefitness = new JButton("home-body-8-week-at-home-fitness"); // new JButton
		btnHomebodyweekathomefitness.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#36HTML.html"));
				} //try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch 
			} // actionPerformed
		}); //ActionListener
		btnHomebodyweekathomefitness.setBounds(0, 247, 495, 23);
		Article3panel.add(btnHomebodyweekathomefitness);
		
		JButton btnNext_2 = new JButton("Next >"); // new JButton
		btnNext_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				Article3panel.setVisible(false); // set visibility for Article panel 3 to false.
				Article4panel.setVisible(true); // set Visibility for Article panel 4 to true
			} // actionPerformed
		}); // ActionListener
		btnNext_2.setBounds(495, 247, 89, 23);
		Article3panel.add(btnNext_2);
		
		final JPanel Article2panel = new JPanel(); // create new JPanel for the GUI.
		frame.getContentPane().add(Article2panel, "Article2panel");
		Article2panel.setLayout(null);
		
		JButton btnBattleRopeLeg = new JButton("Battle Rope Leg Waves: The Ultimate In Lower-Body Power And Pump"); // new JButton
		btnBattleRopeLeg.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { // action listener
				
				try { // try to find file
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#13HTML.html"));
				} // try
				
				catch (Exception exe) { // catch exception
					exe.printStackTrace();
					
				} // catch
				
			} // actionPerformed
		}); // ActionPerfomred
		btnBattleRopeLeg.setBounds(0, 0, 594, 23);
		Article2panel.add(btnBattleRopeLeg);
		
		JButton btnWorkoutsThat = new JButton("5 Workouts That Are Insanely Efficient At Torching Fat"); // new JButton
		btnWorkoutsThat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#14HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnWorkoutsThat.setBounds(0, 21, 594, 23);
		Article2panel.add(btnWorkoutsThat);
		
		JButton btnBodyspaceMemberOf = new JButton("BodySpace Member of the Month: Lifting Machine"); // new JButton
		btnBodyspaceMemberOf.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#15HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnBodyspaceMemberOf.setBounds(0, 43, 594, 23);
		Article2panel.add(btnBodyspaceMemberOf);
		
		JButton btnSweetAndSour = new JButton("Sweet and Sour Slow Cooked Chicken"); // new JButton
		btnSweetAndSour.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#16HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnSweetAndSour.setBounds(0, 65, 594, 23);
		Article2panel.add(btnSweetAndSour);
		
		JButton btnEditorsPicksOur = new JButton("Editors' Picks: Our Favorite Things For May 2018"); // new JBtton
		btnEditorsPicksOur.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#17HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnEditorsPicksOur.setBounds(0, 88, 594, 23);
		Article2panel.add(btnEditorsPicksOur);
		
		JButton btnWaysTo = new JButton("3 Ways To Spice Up The Rear-Foot-Elevated Split Squat"); // new JButton
		btnWaysTo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#18HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnWaysTo.setBounds(0, 111, 594, 23);
		Article2panel.add(btnWaysTo);
		
		JButton btnThakurAnoopSingh = new JButton("Thakur Anoop Singh Is The Arnold Schwarzenegger Of India"); // new JButton
		btnThakurAnoopSingh.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#19HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnThakurAnoopSingh.setBounds(0, 133, 594, 23);
		Article2panel.add(btnThakurAnoopSingh);
		
		JButton btnStretchesEvery = new JButton("5 Stretches Every Lifter Needs To Do"); // new JButton
		btnStretchesEvery.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#20HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		btnStretchesEvery.setBounds(0, 155, 594, 23);
		Article2panel.add(btnStretchesEvery);
		
		JButton btnGetBearwrasslinStrong = new JButton("Get Bear-Wrasslin' Strong With This Upper-Body Bodyweight Workout"); // new JButton
		btnGetBearwrasslinStrong.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#21HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
				
			}
		});
		btnGetBearwrasslinStrong.setBounds(0, 177, 594, 23);
		Article2panel.add(btnGetBearwrasslinStrong);
		
		JButton btnUpperchestTrainingMade = new JButton("Upper-Chest Training Made Simple"); // new JButton
		btnUpperchestTrainingMade.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#22HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnUpperchestTrainingMade.setBounds(0, 199, 594, 23);
		Article2panel.add(btnUpperchestTrainingMade);
		
		JButton btnReasonsYou = new JButton("8 Reasons You Should Compete This Year!"); // new JButton
		btnReasonsYou.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#23HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnReasonsYou.setBounds(0, 221, 594, 23);
		Article2panel.add(btnReasonsYou);
		
		JButton btnBeforeThereWas = new JButton("Before There Was Hannah Eden's FYR, There Was Triple Threat"); // new JButton
		btnBeforeThereWas.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#24HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnBeforeThereWas.setBounds(0, 247, 496, 23);
		Article2panel.add(btnBeforeThereWas);
		
		JButton btnNext_1 = new JButton("Next >"); // new JButton
		btnNext_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Article2panel.setVisible(false);
				Article3panel.setVisible(true);
			}
		});
		btnNext_1.setBounds(495, 247, 89, 23);
		Article2panel.add(btnNext_1);
		
		final JPanel Articlepanel = new JPanel(); // new JPanel
		frame.getContentPane().add(Articlepanel, "Articepanel");
		Articlepanel.setLayout(null);
		
		JButton btnAttackOfThe = new JButton("Attack of the Killer Lettuce: 5 Defensive Tactics"); // new JButton
		btnAttackOfThe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#1HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnAttackOfThe.setBounds(0, 0, 595, 23);
		Articlepanel.add(btnAttackOfThe);
		
		JButton btnLawrenceBallengerspound = new JButton("Lawrence Ballenger's 300-Pound Upright Row Is The Official Lift Of 2018"); // new JButton
		btnLawrenceBallengerspound.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#2HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnLawrenceBallengerspound.setBounds(0, 22, 595, 23);
		Articlepanel.add(btnLawrenceBallengerspound);
		
		JButton btnFriedAvocadoTacos = new JButton("Fried Avocado Tacos"); // new JButton
		btnFriedAvocadoTacos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#3HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnFriedAvocadoTacos.setBounds(0, 44, 595, 23);
		Articlepanel.add(btnFriedAvocadoTacos);
		
		JButton btnSaveYourBack = new JButton("Save Your Back With Dumbbell Deadlifts"); // new JButton
		btnSaveYourBack.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#4HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnSaveYourBack.setBounds(0, 66, 595, 23);
		Articlepanel.add(btnSaveYourBack);
		
		JButton btnYourOldschoolBench = new JButton("Your Old-School Bench Warm-Up Is Getting You Hurt! This Is Better."); // JButton
		btnYourOldschoolBench.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#5HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnYourOldschoolBench.setBounds(0, 88, 595, 23);
		Articlepanel.add(btnYourOldschoolBench);
		
		JButton btnAShortWorkout = new JButton("A Short Workout For The Long Head Of Your Biceps"); // new JButton
		btnAShortWorkout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#6HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
				
			}
		});
		btnAShortWorkout.setBounds(0, 110, 595, 23);
		Articlepanel.add(btnAShortWorkout);
		
		JButton btnReverseDietingEat = new JButton("Reverse Dieting: Eat More, Feel Better!"); // new JButton
		btnReverseDietingEat.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#7HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnReverseDietingEat.setBounds(0, 133, 595, 23);
		Articlepanel.add(btnReverseDietingEat);
		
		JButton btnMeetThe = new JButton("Meet the 2018 $250K Transformation Challenge Winners!"); // new JButton
		btnMeetThe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#8HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnMeetThe.setBounds(0, 155, 595, 23);
		Articlepanel.add(btnMeetThe);
		
		JButton btnReasonsWhy = new JButton("3 Reasons Why You Should Eliminate Rest Days"); // new JButton
		btnReasonsWhy.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#9HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnReasonsWhy.setBounds(0, 177, 595, 23);
		Articlepanel.add(btnReasonsWhy);
		
		JButton btnFeedTheAnimal = new JButton("Feed The Animal: How To Maximize Your Digestion"); // new JButton
		btnFeedTheAnimal.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#10HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnFeedTheAnimal.setBounds(0, 200, 595, 23);
		Articlepanel.add(btnFeedTheAnimal);
		
		JButton btnBackAndBiceps = new JButton("Back and Biceps? No, DTP Extreme Giant Set Back and Biceps!"); // new JButton
		btnBackAndBiceps.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#11HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnBackAndBiceps.setBounds(0, 222, 595, 23);
		Articlepanel.add(btnBackAndBiceps);
		
		JButton btnCaffeineYourBest = new JButton("Caffeine: Your Best Fitness Friend Or Your Secret Enemy?"); // new JButton
		btnCaffeineYourBest.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("URLLinks/BodyBuildingArticle#12HTML.html"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnCaffeineYourBest.setBounds(0, 247, 499, 23);
		Articlepanel.add(btnCaffeineYourBest);
		
		JButton btnNext = new JButton("Next >"); // new JButton
		btnNext.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Articlepanel.setVisible(false);
				Article2panel.setVisible(true);
			}
		});
		btnNext.setBounds(499, 247, 89, 23);
		Articlepanel.add(btnNext);
		
		final JPanel Imagepanel = new JPanel(); // new JPanel 
		frame.getContentPane().add(Imagepanel, "ImagePanel");
		
		JButton btnDownloadIcon = new JButton("Download Icon"); // new JButton
		btnDownloadIcon.setBounds(297, 89, 287, 143);
		btnDownloadIcon.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("IMAGELinks/BodyBuildingICON.jpg"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		Imagepanel.setLayout(null);
		Imagepanel.add(btnDownloadIcon);
		
		JButton btnArticleList = new JButton("Article List"); // new JButton
		btnArticleList.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				Imagepanel.setVisible(false);
				Articlepanel.setVisible(true);
				
			}
		});
		btnArticleList.setBounds(0, 89, 299, 143);
		Imagepanel.add(btnArticleList);
		
		JButton button_2 = new JButton("< Back"); // new JButton
		button_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Imagepanel.setVisible(false);
				Mainpanel.setVisible(true);
			}
		});
		button_2.setBounds(0, 0, 91, 43);
		Imagepanel.add(button_2);
			
		final JPanel Searchpanel = new JPanel(); // new JPanel
		frame.getContentPane().add(Searchpanel, "SearchPanel");
		Searchpanel.setLayout(null);
		
		JLabel lblAdvancedSearch = new JLabel("Advanced Search:");
		lblAdvancedSearch.setBounds(87, 131, 93, 14);
		Searchpanel.add(lblAdvancedSearch);
		
		textField_4 = new JTextField();
		textField_4.setBounds(190, 128, 198, 20);
		Searchpanel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnSearch = new JButton("Search"); // new JButton
		btnSearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				    
					String AdvancedSearch = textField_4.getText();
					Desktop.getDesktop().browse(new URL("https://search.bodybuilding.com/slp/full?context=all&query=" + AdvancedSearch ).toURI());
				} 
				
				catch (Exception e) {
					
				}
			}
		});
		btnSearch.setBounds(398, 127, 89, 23);
		Searchpanel.add(btnSearch);
		
		JButton button_3 = new JButton("< Back"); // new JButton
		button_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Searchpanel.setVisible(false);
				Mainpanel.setVisible(true);
			}
		});
		button_3.setBounds(0, 0, 99, 44);
		Searchpanel.add(button_3);
		Searchpanel.setVisible(false);
		
		final JPanel Transactionpanel = new JPanel(); // new JPanel
		frame.getContentPane().add(Transactionpanel, "Transactionpanel");
		Transactionpanel.setLayout(null);
		
		JButton btnTransactionLog_1 = new JButton("Transaction Log"); // new JButton
		btnTransactionLog_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("WrittenDocuments/Transaction Log.txt"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
			}
		});
		btnTransactionLog_1.setBounds(0, 94, 292, 92);
		Transactionpanel.add(btnTransactionLog_1);
		
		JButton button_4 = new JButton("< Back"); // new JButton
		button_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Transactionpanel.setVisible(false);
				Mainpanel.setVisible(true);
			}
		});
		button_4.setBounds(0, 0, 104, 42);
		Transactionpanel.add(button_4);
		
		JButton btnEmailLog = new JButton("Email Log"); // new JButton
		btnEmailLog.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				EmailLogClass.main(null); // call on main method from EmaiLogClass
				
			}
			
		});
		btnEmailLog.setBounds(292, 94, 292, 92);
		Transactionpanel.add(btnEmailLog);
		
		
	    JButton btnEnter = new JButton("Enter"); // new JButton
	    btnEnter.setBounds(240, 178, 124, 50);
		btnEnter.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String UserName = textField.getText();
				@SuppressWarnings("deprecation")
				String PassWord = textField_1.getText();
				
				try { // read and try to match the user name and password.
			            BufferedReader BufferedReader = new BufferedReader(new FileReader("WrittenDocuments/Registrations.txt"));
			            String Line;
			            
			            while ((Line = BufferedReader.readLine()) != null) {
			               
			              String LineArray [] = Line.split(" ");
			              
			              System.out.println(LineArray[0]);
			              System.out.println(LineArray[1]);
			              
			              if (LineArray[0].equals(UserName) && LineArray[1].equals(PassWord)) {
			                JOptionPane.showMessageDialog(null, "Matched. Welcome and Enjoy!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
			                Imagepanel.setVisible(true);
			                Loginpanel.setVisible(false);
			                BufferedReader.close();
			                
			                String string = textField_2.getText() + " CREATED ACCOUNT!";
			                String string2 = textField.getText() + " LOGGED IN!";
			                BufferedWriter writer = new BufferedWriter(new FileWriter("WrittenDocuments/Transaction Log.txt"));
			                writer.write(string);
			                writer.write(string2);
			                writer.newLine();
			                writer.close();
			                
			              }
			              else
			              {
			                JOptionPane.showMessageDialog(null, "No Line Match, Press OK", "Oops, Error!", JOptionPane.ERROR_MESSAGE);
			              }
			            }
			            
			            
			            
			        } 
				 
				 catch (FileNotFoundException exe) {
			            JOptionPane.showMessageDialog(null,"No Such File!", "Oops, Error!", JOptionPane.ERROR_MESSAGE);
			        } 
				
				catch (HeadlessException exe) {
					exe.printStackTrace();
				} 
				
				catch (IOException exe) {
					exe.printStackTrace();
				} 
				 
			}
		});
		Loginpanel.add(btnEnter);
		
		JButton button = new JButton("< Back"); // new JButton
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Mainpanel.setVisible(true);
				Loginpanel.setVisible(false);
			}
		});
		button.setBounds(0, 0, 90, 44);
		Loginpanel.add(button);
		
		JButton btnEnterAdmin = new JButton("Enter Admin"); // new JButton
		btnEnterAdmin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String UserName = textField.getText();
				@SuppressWarnings("deprecation")
				String PassWord = textField_1.getText();
				
				try {
			            BufferedReader BufferedReader = new BufferedReader(new FileReader("WrittenDocuments/Registrations.txt"));
			            String Line;
			            
			            while ((Line = BufferedReader.readLine()) != null) {
			               
			              String LineArray [] = Line.split(" ");
			              
			              System.out.println(LineArray[0]);
			              System.out.println(LineArray[1]);
			              
			              if (LineArray[0].equals(UserName) && LineArray[1].equals(PassWord)) {
			                JOptionPane.showMessageDialog(null, "Matched. Welcome and Enjoy!", "Successful!", JOptionPane.INFORMATION_MESSAGE);
			                Mainpanel.setVisible(true);
			                Loginpanel.setVisible(false);
			                BufferedReader.close();
			                
			                String string = textField_2.getText() + " CREATED ACCOUNT!";
			                String string2 = textField.getText() + " LOGGED IN!";
			                BufferedWriter writer = new BufferedWriter(new FileWriter("WrittenDocuments/Transaction Log.txt"));
			                writer.write(string);
			                writer.write(string2);
			                writer.newLine();
			                writer.close();
			              }
			              else
			              {
			                JOptionPane.showMessageDialog(null, "No Line Match, Press OK", "Oops, Error!", JOptionPane.ERROR_MESSAGE);
			              }
			            }
			            } 
				 
				 catch (FileNotFoundException exe) {
			            JOptionPane.showMessageDialog(null,"No Such File!", "Oops, Error!", JOptionPane.ERROR_MESSAGE);
			        } 
				
				catch (HeadlessException exe) {
					exe.printStackTrace();
				} 
				
				catch (IOException exe) {
					exe.printStackTrace();
				} 
			}
		});
		btnEnterAdmin.setBounds(361, 178, 114, 50);
		Loginpanel.add(btnEnterAdmin);
		Loginpanel.setVisible(false);
		
		JButton btnFinish = new JButton("Finish"); // new JButton
		btnFinish.setBounds(240, 172, 235, 54);
		btnFinish.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				Loginpanel.setVisible(true);
				Registerpanel.setVisible(false);
				
			
				try {
					 
					BufferedWriter BufferedWriter = new BufferedWriter(new FileWriter(("WrittenDocuments/Registrations.txt"), true));
			            BufferedWriter.write(textField_2.getText() + " " + textField_3.getText());
			            BufferedWriter.newLine();
			            
			            BufferedWriter.close();
			        }
			
				catch(Exception exc){
			            exc.printStackTrace();
			    }; 
			} 
		});
		Registerpanel.add(btnFinish);
		
		JButton button_1 = new JButton("< Back"); // new JButton
		button_1.setBounds(0, 0, 90, 44);
		button_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Mainpanel.setVisible(true);
				Registerpanel.setVisible(false);
			}
		});
		Registerpanel.add(button_1);
				
		JButton btnArticles = new JButton("Articles"); // new JButton
		btnArticles.setBounds(0, 0, 280, 80);
		btnArticles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imagepanel.setVisible(true);
				Mainpanel.setVisible(false);
			}		
		});
		Mainpanel.setLayout(null);
		Mainpanel.add(btnArticles);
		
		JButton btnAdvancedSearch = new JButton("Advanced Search"); // new JButton
		btnAdvancedSearch.setBounds(0, 91, 280, 80);
		btnAdvancedSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Searchpanel.setVisible(true);
				Mainpanel.setVisible(false);
			}
		});
		Mainpanel.add(btnAdvancedSearch);
		
		JButton btnTransactionLog = new JButton("Transaction Log"); // new JButton
		btnTransactionLog.setBounds(0, 182, 280, 80);
		btnTransactionLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Mainpanel.setVisible(false);
				Transactionpanel.setVisible(true);
				
			}
		});
		Mainpanel.add(btnTransactionLog);
		
		JButton btnRegister = new JButton("Register"); // new JButton
		btnRegister.setBounds(304, 0, 280, 80);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Registerpanel.setVisible(true);
				Mainpanel.setVisible(false);
			}
		});
		Mainpanel.add(btnRegister);
		
		JButton btnLogIn = new JButton("Log in"); // new JButton
		btnLogIn.setBounds(304, 91, 280, 80);
		btnLogIn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				Loginpanel.setVisible(true);
				Mainpanel.setVisible(false);
				
			}
		});
		Mainpanel.add(btnLogIn);
		
		JButton btnUserManual = new JButton("User Manual"); // new JButton
		btnUserManual.setBounds(304, 182, 280, 80);
		btnUserManual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Desktop.getDesktop().open (new java.io.File("WrittenDocuments/User Manual.pdf"));
				}
				
				catch (Exception exe) {
					exe.printStackTrace();
					
				}
				
			}
		});
		Mainpanel.add(btnUserManual);
				

	}
}
