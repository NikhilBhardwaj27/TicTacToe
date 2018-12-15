import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TicTacToe  implements ActionListener
{
    Font f;
    static Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    static Frame f1;
    int count = 1;
    static int rep=0;

    public TicTacToe()
    {
        // Allocating memory to buttons
        f1 = new Frame();

        b1 = new Button("1");
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.DARK_GRAY);
        b1.addActionListener(this);

        b2 = new Button("2");
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.DARK_GRAY);
        b2.addActionListener(this);

        b3 = new Button("3");    
        b3.setBackground(Color.DARK_GRAY);
        b3.setForeground(Color.DARK_GRAY);
        b3.addActionListener(this);

        b4 = new Button("4");
        b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.DARK_GRAY);
        b4.addActionListener(this);

        b5 = new Button("5");
        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.DARK_GRAY);
        b5.addActionListener(this);

        b6 = new Button("6");  
        b6.setBackground(Color.DARK_GRAY);
        b6.setForeground(Color.DARK_GRAY);
        b6.addActionListener(this); 

        b7 = new Button("7");      
        b7.setBackground(Color.DARK_GRAY);
        b7.setForeground(Color.DARK_GRAY);
        b7.addActionListener(this);

        b8 = new Button("8");
        b8.setBackground(Color.DARK_GRAY);
        b8.setForeground(Color.DARK_GRAY);
        b8.addActionListener(this);

        b9 = new Button("9");   
        b9.setBackground(Color.DARK_GRAY);
        b9.setForeground(Color.DARK_GRAY);
        b9.addActionListener(this);

        //Setting Font
        f = new Font("Serif",Font.BOLD,80);
        f1.setFont(f);

        // Adding Buttons to frame
        f1.add(b1);
        f1.add(b2);
        f1.add(b3); 
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b8);
        f1.add(b9);

        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLocationRelativeTo(null);

        // Setting Layouts
        f1.setLayout(new GridLayout(3,3));

        // Adding window Listener
        f1.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    static void checking(String msg)
    {
        if (((b1.getLabel()=="0") & (b2.getLabel()=="0") & (b3.getLabel()=="0")) || ((b1.getLabel()=="X") & (b2.getLabel()=="X") & (b3.getLabel()=="X")))
        {
            b1.setBackground(Color.white);
            b2.setBackground(Color.white);
            b3.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);

        }
        else if (((b7.getLabel()=="0") & (b8.getLabel()=="0") & (b9.getLabel()=="0")) || ((b7.getLabel()=="X") & (b8.getLabel()=="X") & (b9.getLabel()=="X")))
        {
            b7.setBackground(Color.white);
            b8.setBackground(Color.white);
            b9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if((b1.getLabel()=="0" && b4.getLabel()=="0" && b7.getLabel()=="0") || (b1.getLabel()=="X" && b4.getLabel()=="X" && b7.getLabel()=="X"))
        {
            b1.setBackground(Color.white);
            b4.setBackground(Color.white);
            b7.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if((b3.getLabel()=="0" && b6.getLabel()=="0" && b9.getLabel()=="0") || (b3.getLabel()=="X" && b6.getLabel()=="X" && b9.getLabel()=="X"))
        {
            b3.setBackground(Color.white);
            b6.setBackground(Color.white);
            b9.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if((b4.getLabel()=="0" && b5.getLabel()=="0" && b6.getLabel()=="0") || (b4.getLabel()=="X" && b5.getLabel()=="X" && b6.getLabel()=="X"))
        {
            b4.setBackground(Color.white);
            b5.setBackground(Color.white);
            b6.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if((b1.getLabel()=="0" && b5.getLabel()=="0" && b9.getLabel()=="0") || (b1.getLabel()=="X" && b5.getLabel()=="X" && b9.getLabel()=="X"))
        {
            b1.setBackground(Color.white);
            b9.setBackground(Color.white);
            b5.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if((b3.getLabel()=="0" && b5.getLabel()=="0" && b7.getLabel()=="0") || (b3.getLabel()=="X" && b5.getLabel()=="X" && b7.getLabel()=="X"))
        {
            b3.setBackground(Color.white);
            b5.setBackground(Color.white);
            b7.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if((b2.getLabel()=="0" && b5.getLabel()=="0" && b8.getLabel()=="0") || (b2.getLabel()=="X" && b5.getLabel()=="X" && b8.getLabel()=="X"))
        {
            b2.setBackground(Color.white);
            b5.setBackground(Color.white);
            b8.setBackground(Color.white);
            JOptionPane.showMessageDialog(null,msg+" wins","Winner",3);
            f1.setVisible(false);
        }
        else if(rep==9)
        {
            JOptionPane.showMessageDialog(null,"Tie","No result",3);
            f1.setVisible(false);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        String value = e.getActionCommand();
        rep++;
        if (count==1)
        {
            switch(value)
            {
                case "1":
                    b1.setLabel("X");
                    b1.setForeground(Color.GREEN);
                    checking("X");
                    break;
        
                case "2":
                    b2.setLabel("X");
                    b2.setForeground(Color.GREEN);
                    checking("X");
                    break;
                
                case "3":
                    b3.setLabel("X");
                    b3.setForeground(Color.GREEN);
                    checking("X");
                    break;
                
                case "4":
                    b4.setLabel("X");
                    b4.setForeground(Color.GREEN);
                    checking("X");
                    break;
            
                case "5":
                    b5.setLabel("X");
                    b5.setForeground(Color.GREEN);
                    checking("X");
                    break;
            
                case "6":
                    b6.setLabel("X");
                    b6.setForeground(Color.GREEN);
                    checking("X");
                    break;
                
                case "7":
                    b7.setLabel("X");
                    b7.setForeground(Color.GREEN);
                    checking("X");
                    break;
            
                case "8":
                    b8.setLabel("X");
                    b8.setForeground(Color.GREEN);
                    checking("X");
                    break;
            
                case "9":
                    b9.setLabel("X");
                    b9.setForeground(Color.GREEN);
                    checking("X");
                    break;
            }
            count=0;
        }

        else
        {
            switch(value)
            {
                case "1":
                    b1.setLabel("0");
                    b1.setForeground(Color.GREEN);
                    checking("0");
                    break;
        
                case "2":
                    b2.setLabel("0");
                    b2.setForeground(Color.GREEN);
                    checking("0");
                    break;
                
                case "3":
                    b3.setLabel("0");
                    b3.setForeground(Color.GREEN);
                    checking("0");
                    break;
                
                case "4":
                    b4.setLabel("0");
                    b4.setForeground(Color.GREEN);
                    checking("0");
                    break;
            
                case "5":
                    b5.setLabel("0");
                    b5.setForeground(Color.GREEN);
                    checking("0");
                    break;
            
                case "6":
                    b6.setLabel("0");
                    b6.setForeground(Color.GREEN);
                    checking("0");
                    break;
                
                case "7":
                    b7.setLabel("0");
                    b7.setForeground(Color.GREEN);
                    checking("0");
                    break;
            
                case "8":
                    b8.setLabel("0");
                    b8.setForeground(Color.GREEN);
                    checking("0");
                    break;
            
                case "9":
                    b9.setLabel("0");
                    b9.setForeground(Color.GREEN);
                    checking("0");
                    break;
            }
            count=1;
        }
    }
}

class Player implements ActionListener
{
    Label l1,l2;
    TextField t1,t2;
    Button submit;
    Frame f;

    public Player()
    {

        // Allocating memory
        f = new Frame("Player");
        l1 = new Label("Player A(Entre 0 or x):");
        t1 = new TextField(10);
        l2 = new Label("Player B(Entre 0 or x):");
        t2 = new TextField(10);
        submit = new Button("Submit");

        submit.addActionListener(this);

        // Adding to frames
        f.setLayout(new FlowLayout());
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(submit);

        f.setVisible(true);
        f.setSize(300,300);

      // Adding window listener
      f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);                    
        }
    });

    }

    public void actionPerformed(ActionEvent e)
    {
        String s1,s2;

        s1 = t1.getText();
        s2 = t2.getText();

        if(s1.equals("X") | s1.equals("x"))
        {
            if(s2.equals("0"))
            {
                f.setVisible(false);
                new TicTacToe();
            }
            
            else
            {
                JOptionPane.showMessageDialog(null,"Enter valid combination","Alert",2);
            }

        }
        else if(s1.equals("0"))
        {
            if(s2.equals("X") | s2.equals("x"))
            {
                f.setVisible(false);
                new TicTacToe();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Enter valid combination","Alert",2);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Enter valid combination","Alert",2);
        }
    }

  public static void main(String args[])
    {
         new Player();
    }
}    


