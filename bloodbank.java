import java.awt.*;  
import java.awt.event.*;  
import java.io.*;
import javax.swing.*;
public class bloodbank extends Frame { 
        
        public bloodbank() {
        setSize(400,400);  
        setLayout(null);
        setBackground(Color.PINK);  
        setVisible(true);
        main_screen();        
    }
    public void main_screen() {
        setTitle("Blood Donation Program"); 
        Button b1=new Button("Get Donor information"); 
        b1.setBounds(100,130,200,40);
        Button b2=new Button("Enter Donor information");  
        b2.setBounds(100,230,200,40);         
        add(b1); 
        add(b2); 
        b1.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b1);
                    remove(b2);
                    get_donor();                                  
                }
            }
        ); 
        b2.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b1);
                    remove(b2);
                    enter_donor();                                  
                }
            }
        );
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        }); 
    }

    public void get_donor() {
        setTitle("Select Blood Group");
        Button b4 = new Button("A");
        b4.setBounds(50,30,100,40);
        Button b5 = new Button("B");
        b5.setBounds(250,30,100,40);
        Button b6 = new Button("O");
        b6.setBounds(50,130,100,40);
        Button b7 = new Button("AB");
        b7.setBounds(250,130,100,40);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        b4.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        get_A();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
	b5.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        get_B();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        }); 
	b6.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        get_O();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        }); 
	b7.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        get_AB();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });   
    }

    public void get_A() throws IOException {
        setTitle("Blood Group A Donor"); 
        Button b3=new Button("Back");  
        b3.setBounds(150,330,100,40);
        TextArea area=new TextArea(""); 
        area.setBounds(30,30, 340,200);  
        area.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
        area.setEditable(false);
        add(area);        
        add(b3);
        FileReader fr = null;
        try {
            fr = new FileReader("A.txt");
            char[] buffer = new char[4096]; 
            int len; 
            while ((len = fr.read(buffer)) != -1) { 
                String s = new String(buffer, 0, len); 
                area.append(s); 
            }
        }
        finally {
            fr.close();
        }
        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(area);
                    remove(b3);
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
	public void get_B() throws IOException {
        setTitle("Blood Group B Donor"); 
        Button b3=new Button("Back");  
        b3.setBounds(150,330,100,40);
        TextArea area=new TextArea(""); 
        area.setBounds(30,30, 340,200);  
        area.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
        area.setEditable(false);
        add(area);        
        add(b3);
        FileReader fr = null;
        try {
            fr = new FileReader("B.txt");
            char[] buffer = new char[4096]; 
            int len; 
            while ((len = fr.read(buffer)) != -1) { 
                String s = new String(buffer, 0, len); 
                area.append(s); 
            }
        }
        finally {
            fr.close();
        }
        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(area);
                    remove(b3);
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
public void get_O() throws IOException {
        setTitle("Blood Group O Donor"); 
        Button b3=new Button("Back");  
        b3.setBounds(150,330,100,40);
        TextArea area=new TextArea(""); 
        area.setBounds(30,30, 340,200);  
        area.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
        area.setEditable(false);
        add(area);        
        add(b3);
        FileReader fr = null;
        try {
            fr = new FileReader("O.txt");
            char[] buffer = new char[4096]; 
            int len; 
            while ((len = fr.read(buffer)) != -1) { 
                String s = new String(buffer, 0, len); 
                area.append(s); 
            }
        }
        finally {
            fr.close();
        }
        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(area);
                    remove(b3);
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
public void get_AB() throws IOException {
        setTitle("Blood Group AB Donor"); 
        Button b3=new Button("Back");  
        b3.setBounds(150,330,100,40);
        TextArea area=new TextArea(""); 
        area.setBounds(30,30, 340,200);  
        area.setFont(new Font("MonoSpaced", Font.PLAIN, 12));
        area.setEditable(false);
        add(area);        
        add(b3);
        FileReader fr = null;
        try {
            fr = new FileReader("AB.txt");
            char[] buffer = new char[4096]; 
            int len; 
            while ((len = fr.read(buffer)) != -1) { 
                String s = new String(buffer, 0, len); 
                area.append(s); 
            }
        }
        finally {
            fr.close();
        }
        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(area);
                    remove(b3);
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void enter_donor() {
        setTitle("Select Blood Group");
        Button b4 = new Button("A");
        b4.setBounds(50,30,100,40);
        Button b5 = new Button("B");
        b5.setBounds(250,30,100,40);
        Button b6 = new Button("O");
        b6.setBounds(50,130,100,40);
        Button b7 = new Button("AB");
        b7.setBounds(250,130,100,40);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        b4.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        enter_A();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
	b5.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        enter_B();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
	b6.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        enter_O();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
	b7.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(b4);
                    remove(b5);
                    remove(b6);
                    remove(b7);
                    try {
                        enter_AB();
                    } 
                    catch (IOException ie){}                                       
                }
            }
        );
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });  
    } 

    public void enter_A() throws IOException {
        setTitle("Blood Group A Donor"); 
        Button b3=new Button("Submit");  
        b3.setBounds(150,330,100,40);
        Label l1=new Label("Enter Name:"); 
        l1.setBounds(50,130,100,40);  
        Label l2=new Label("Enter Phone:"); 
        l2.setBounds(50,230,100,40); 
        TextField tf1=new TextField();  
        tf1.setBounds(250,130,100,40); 
        TextField tf2=new TextField();  
        tf2.setBounds(250,230,100,40); 
        add(l1);    
        add(l2);    
        add(b3);
        add(tf1);
        add(tf2);

        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(l1);
                    remove(l2);
                    remove(b3);
                    remove(tf1);
                    remove(tf2);
                    String s1=tf1.getText();  
                    String s2=tf2.getText();
                    try{
                        filewrite("A.txt",s1, s2);
                    }
                    catch (IOException ie){}  
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public void filewrite(String fname, String name, String ph) throws IOException {
        FileWriter fw = null;
        try {
            fw = new FileWriter(fname, true);
            fw.write("\n"+name+"\t"+ph);
        }
        finally {
            fw.close();
        }

    }
public void enter_B() throws IOException {
        setTitle("Blood Group B Donor"); 
        Button b3=new Button("Submit");  
        b3.setBounds(150,330,100,40);
        Label l1=new Label("Enter Name:"); 
        l1.setBounds(50,130,100,40);  
        Label l2=new Label("Enter Phone:"); 
        l2.setBounds(50,230,100,40); 
        TextField tf1=new TextField();  
        tf1.setBounds(250,130,100,40); 
        TextField tf2=new TextField();  
        tf2.setBounds(250,230,100,40); 
        add(l1);    
        add(l2);    
        add(b3);
        add(tf1);
        add(tf2);

        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(l1);
                    remove(l2);
                    remove(b3);
                    remove(tf1);
                    remove(tf2);
                    String s1=tf1.getText();  
                    String s2=tf2.getText();
                    try{
                        filewrite("B.txt",s1, s2);
                    }
                    catch (IOException ie){}  
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
public void enter_O() throws IOException {
        setTitle("Blood Group O Donor"); 
        Button b3=new Button("Submit");  
        b3.setBounds(150,330,100,40);
        Label l1=new Label("Enter Name:"); 
        l1.setBounds(50,130,100,40);  
        Label l2=new Label("Enter Phone:"); 
        l2.setBounds(50,230,100,40); 
        TextField tf1=new TextField();  
        tf1.setBounds(250,130,100,40); 
        TextField tf2=new TextField();  
        tf2.setBounds(250,230,100,40); 
        add(l1);    
        add(l2);    
        add(b3);
        add(tf1);
        add(tf2);

        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(l1);
                    remove(l2);
                    remove(b3);
                    remove(tf1);
                    remove(tf2);
                    String s1=tf1.getText();  
                    String s2=tf2.getText();
                    try{
                        filewrite("O.txt",s1, s2);
                    }
                    catch (IOException ie){}  
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
public void enter_AB() throws IOException {
        setTitle("Blood Group AB Donor"); 
        Button b3=new Button("Submit");  
        b3.setBounds(150,330,100,40);
        Label l1=new Label("Enter Name:"); 
        l1.setBounds(50,130,100,40);  
        Label l2=new Label("Enter Phone:"); 
        l2.setBounds(50,230,100,40); 
        TextField tf1=new TextField();  
        tf1.setBounds(250,130,100,40); 
        TextField tf2=new TextField();  
        tf2.setBounds(250,230,100,40); 
        add(l1);    
        add(l2);    
        add(b3);
        add(tf1);
        add(tf2);

        b3.addActionListener(
            new ActionListener(){  
                public void actionPerformed(ActionEvent e){  
                    remove(l1);
                    remove(l2);
                    remove(b3);
                    remove(tf1);
                    remove(tf2);
                    String s1=tf1.getText();  
                    String s2=tf2.getText();
                    try{
                        filewrite("AB.txt",s1, s2);
                    }
                    catch (IOException ie){}  
                    main_screen();
                }
            }
        ); 
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
     public static void main(String[] args) {      
        new bloodbank();
    }  
} 
