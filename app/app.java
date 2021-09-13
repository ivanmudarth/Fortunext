import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class fintech extends JFrame implements ActionListener {

  //QUESTIONS
  
  String q1 = "Creditor";
  String q2 = "Money";
  String q3 = "Money Supply";
  String q4 = "Commercial Banks";
  String q5 = "Savings Bank";
  String q6 = "Insurance";
  String q7 = "Principal";
  String q8 = "Annual Percentage Stocks"; 
  String q9 = "Compound Interest";
  String q10 = "Bankruptcy";
  
  String a1 = "A person or company to whom money is owed.";
    String a2 = "Anything commonly expected as a medium of exchange, measure of value, and store of value.";
    String a3 = "The total amount of money in circulation in a country.";
    String a4 = "A financial institution that offers services to the general public and to companies.";
    String a5 = "A financial institution that receives savings accounts and pays interest to depositors";
    String a6 = "A contract in which an individual or entity receives financial protection or reimbursement against losses from an insurance company.";
    String a7 = "An amount of money that is loaned to someone and that can earn interest.";
    String a8 = "A standard calculation by lenders to show what the interest rate and fees are on a credit product (e.g. loan, credit card, etc.) which allows borrowers to compare different loan products.";
    String a9 = "Interest earned on previously accumulated interest as well as the principal.";
    String a10 = "For when a person or business cannot repay their outstanding debts";
    
  int yeet = 0;
  
  int turn = 0;
  
  CardLayout cardLayout = new CardLayout ();
  
  //to switch between screens
 JButton button1, button2, button3, button4, button5;
 JButton reveal, next, back;
 
 //j-label images
  JLabel homeback, back2, label;
 
  JPanel card1 = new JPanel();
  JPanel card2 = new JPanel();
  JPanel card3 = new JPanel();
  JPanel card4 = new JPanel();
  JPanel card5 = new JPanel();
  JPanel card6 = new JPanel();
  JPanel card7 = new JPanel();
  
  //Creates the big panel that contains all of the cards or screens. (the boss card)
  JPanel cards = new JPanel(new CardLayout());

  
  public fintech() {
    
    /////
    //CREATING AND INITIALISING COMPONENTS:
    /////
    
    //Layout must be set as null to set bounds manually
    card1.setLayout(null);
    card2.setLayout(null);
    
    //JLABEL IMAGES
    
    //homebackground jlabel
    homeback = new JLabel("");
    homeback.setIcon (new ImageIcon("homeback.jpg"));
    homeback.setBounds(0, 0, 1200, 940);
    
    //BUTTONS
    
    //from home to mixed screen
    button1 = new JButton();
    button1.setIcon (new ImageIcon("mix.jpg"));
    button1.setBounds(100, 650, 200, 200);
    
    button2 = new JButton();
    button2.setIcon (new ImageIcon("pfinance.jpg"));
    button2.setBounds(100, 350, 200, 200);
    //button1.setContentAreaFilled(false);
    
    button3 = new JButton();
    button3.setIcon (new ImageIcon("ftech.jpg"));
    button3.setBounds(100, 50, 200, 200);
    
    button4 = new JButton();
    button4.setIcon (new ImageIcon("microe.jpg"));
    button4.setBounds(400, 50, 200, 200);
    
    button5 = new JButton();
    button5.setIcon (new ImageIcon("macroe.jpg"));
    button5.setBounds(700, 50, 200, 200);
    
    reveal = new JButton();
    reveal.setIcon (new ImageIcon("reveal.jpg"));
    reveal.setBounds(100, 100, 100, 100);
    
    
    //Adds each of the cards to the big JPanel
    cards.add(card1);
    cards.add(card2);
    
    //adding everything to its corresponding screen
    
    //home
    card1.add(button1);
    card1.add(button2);
    card1.add(button3);
    card1.add(button4);
    card1.add(button5);
    card1.add(homeback);
    
    //question part
    
    
    /////
    //setting window attributes
    /////
    
    //Set the size of the JFrame
    setSize(1200, 940);
    
    //Puts title on top of JFrame
    //setTitle("Test");
    
    //makes it so that you can't full screen the app. (THIS IS IMPORTANT BECAUSE THE PROGRAM WILL LOOK WEIRD IF IT IS FULL-SCREENED
    setResizable(false);
    
    //Adds each of the cards to the big J-Panel
    //cards.add(card1);
    //cards.add(card2);
    //cards.add(card3);
    
    //Adds the big J-Panel to the J-Frame which contains each card
    getContentPane().add(cards);
    
    //Makes J-Frame visible
    setVisible(true);
    
    /////
    //ADDING ACTIONLISTENERS AND ACTIONCOMMANDS OF ALL THE BUTTONS
    /////
    
    //button 1
    button1.setActionCommand ("button1");
    button1.addActionListener(this);
    
    //button 2
    button2.setActionCommand ("button2");
    button2.addActionListener(this);
    
    //button 3
    button3.setActionCommand ("button3");
    button3.addActionListener(this);
    
    //button 4
    button4.setActionCommand ("button4");
    button4.addActionListener(this);
    
    //button 5
    button5.setActionCommand ("button5");
    button5.addActionListener(this);
    
    reveal.setActionCommand ("reveal");
    reveal.addActionListener(this);
    
    ///////////////////////////////////////////////////////////////Card 2
    
    back2 = new JLabel("");
    back2.setIcon (new ImageIcon("back2.jpg"));
    back2.setBounds(0, 0, 1200, 940);
    
    label = new JLabel (q1);
    label.setBounds(400, 300, 1000, 300);
    label.setFont(new Font("Courier", Font.PLAIN, 36));
    card2.add(reveal);
    card2.add(label);
    card2.add(back2);
  }
  
  public void actionPerformed(ActionEvent e) {
    
    //This is applicable to each button
    if (e.getActionCommand ().equals ("button1")) {
      
      //clicking noise
      //playSound(click);
      
      //Deletes all cards
      cards.removeAll();
      
      //Essentially refreshes the GUI
      cards.revalidate();
      cards.repaint();
      
      //Goes to the next screen
      cards.add(card2);
    }
    
    else if (e.getActionCommand ().equals ("button2")) {
      
      //clicking noise
      //playSound(click);
      
      //Deletes all cards
      cards.removeAll();
      
      //Essentially refreshes the GUI
      cards.revalidate();
      cards.repaint();
      
      //Goes to the next screen
      cards.add(card2);
    }
    
    else if (e.getActionCommand ().equals ("button3")) {
      
      //clicking noise
      //playSound(click);
      
      //Deletes all cards
      cards.removeAll();
      
      //Essentially refreshes the GUI
      cards.revalidate();
      cards.repaint();
      
      //Goes to the next screen
      cards.add(card2);
    }
    
    else if (e.getActionCommand ().equals ("button4")) {
      
      //clicking noise
      //playSound(click);
      
      //Deletes all cards
      cards.removeAll();
      
      //Essentially refreshes the GUI
      cards.revalidate();
      cards.repaint();
      
      //Goes to the next screen
      cards.add(card2);
    }
    
    else if (e.getActionCommand ().equals ("button5")) {
      
      //clicking noise
      //playSound(click);
      
      //Deletes all cards
      cards.removeAll();
      
      //Essentially refreshes the GUI
      cards.revalidate();
      cards.repaint();
      
      //Goes to the next screen
      cards.add(card2);
    }
    
    else if (e.getActionCommand ().equals ("reveal")) {

      turn = turn + 1;
      
      if (yeet == 1) {
        label.setText(q1);
        yeet = 0;
      }
      else if (turn == 1) {
        label.setText(a1);
      }
      else if (turn == 2) {
        label.setText(q2);
      }
      else if (turn ==3) {
        label.setText(a2);
      }
      else if (turn ==4) {
        label.setText (q3);
      }
      else if (turn ==5) {
        label.setText (a3);
      }
      else if (turn ==6) {
        label.setText (q4);
      }
      else if (turn ==7) {
        label.setText (a4);
      }
      else if (turn ==8) {
        label.setText (q5);
      }
      else if (turn ==9) {
        label.setText (a5);
      }
      else {
        //clicking noise
      //playSound(click);
      
      //Deletes all cards
      cards.removeAll();
      
      //Essentially refreshes the GUI
      cards.revalidate();
      cards.repaint();
      
      //Goes to the next screen
      cards.add(card1);
      
      turn = 0;
      yeet = 1;
      }
    }
  }
  
  /////
  //MAIN METHOD
  /////
  public static void main(String args[]) {
    
    //Constructor is called and run
    new fintech(); 
  }
}
