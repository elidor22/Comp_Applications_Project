package GUI_Package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Hashtable;

import com.example.Elidor_Varosi.Trade_Like_A_Pro.Fixer_Data;
import com.example.Elidor_Varosi.Trade_Like_A_Pro.TradeLikeAProApplication;

public class GUI extends JFrame{
    JFrame frame = new JFrame("Trade like a pro");
    JPanel panel= new JPanel();
    JPanel panel2 = new JPanel();


    //Panel1 components
    JButton menu = new JButton();
    JButton convert = new JButton("Convert");
    JLabel mainCurrency = new JLabel("EUR");
    JTextArea wantedCurrency = new JTextArea("You will get the"+ "\n"+"convertion result"+"\n"+ "here");
    JTextField amount = new JTextField();
    JTextField rate = new JTextField();
    JTextField requested_Currency = new JTextField();
    JLabel rateLabel = new JLabel("Conversion rate");
    JLabel requestedLabel = new JLabel("Currency");
    JLabel label = new JLabel();
    JTextArea currencyStatus = new JTextArea();
    ImageIcon icon = new ImageIcon("icons8-menu-200.png");
    ImageIcon icon2 = new ImageIcon("C:\\Users\\Momentally\\Downloads\\Trade_Like_A_Pro\\src\\main\\java\\GUI_Package\\Refresh.png");
    ImageIcon icon3 = new ImageIcon("C:\\Users\\Momentally\\Desktop\\Trade_Like_A_Pro\\src\\main\\java\\GUI_Package\\icons8-save-close-100.png");
    ImageIcon frame_Icon = new ImageIcon("/home/elidor/Desktop/Trade_Like_A_Pro/src/main/java/GUI_Package/warren-buffett.jpg");
    ImageIcon back = new ImageIcon("C:\\Users\\Momentally\\Desktop\\Trade_Like_A_Pro\\src\\main\\java\\GUI_Package\\back.png");
    JButton backbutton = new JButton();
    Font realfont = new Font(Font.SANS_SERIF, Font.PLAIN, 24);
    public static String thisString;//Needs to be static in order to get the value of to string from Fixer_Data


    //panel2 components
    JTextField note1=new JTextField();
    JTextField note2 = new JTextField();
    JTextField note3=new JTextField();
    JTextField note4 = new JTextField();
    JTextField note5=new JTextField();
    JButton Save = new JButton("Save");
    JButton load = new JButton("Load note");
    JCheckBox checkbox1 = new JCheckBox();
    JCheckBox checkbox2 = new JCheckBox();
    JCheckBox checkbox3 = new JCheckBox();
    JCheckBox checkbox4 = new JCheckBox();
    JCheckBox checkbox5 = new JCheckBox();
    int i;


    public GUI(){
    frame.add(panel);
    menu.setBounds(10,20,120,120);
    convert.setBounds(500,600,200,120);
    convert.setIcon(icon2);
    convert.setOpaque(true);
    menu.setIcon(icon);
    menu.setBackground(Color.lightGray);
    mainCurrency.setBounds(400,500,100,50);
    mainCurrency.setFont(realfont);
    wantedCurrency.setBounds(800,500,200,100);
    wantedCurrency.setFont(realfont);
    currencyStatus.setBounds(100,200,650,200);
    currencyStatus.setText(thisString);
    amount.setBounds(200,500,200,50);
    rate.setBounds(500,500,70,50);
    requested_Currency.setBounds(600,500,70,50);
    requestedLabel.setBounds(600,450,100,50);
    rateLabel.setBounds(500,450,100,50);


   label.setIcon(frame_Icon);
   label.setBounds(0,0,1366,768);
   label.setOpaque(true);
    panel.add(menu);
    panel.add(convert);
    panel.add(mainCurrency);
    panel.add(wantedCurrency);
    panel.add(currencyStatus);
    panel.add(amount);
    panel.add(rate);
    panel.add(requested_Currency);
    panel.add(requestedLabel);
    panel.add(rateLabel);
        panel.add(label);
    panel.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    frame.setSize(1366,768);
    frame.setIconImage(frame_Icon.getImage());

    convert();
    nextMenu();
    }

    void convert(){
        convert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            float amountInt = Float.parseFloat(amount.getText());
            float conversionRate=Float.parseFloat(rate.getText());
            float converted = amountInt*conversionRate;
            wantedCurrency.setText(converted+"  "+requested_Currency.getText());
            }
        });
    }


    public static void main(String args[]) throws NoSuchFieldException {
        TradeLikeAProApplication.doit(args);
        //Fixer_Data data = new Fixer_Data();
        GUI GUI = new GUI();

    }

     void nextMenu(){
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                backbutton.setIcon(back);
                backbutton.setBounds(10,20,120,100);
                panel2.add(note1);
                panel2.add(note2);
                panel2.add(note3);
                panel2.add(note4);
                panel2.add(note5);
                panel2.add(Save);
                panel2.add(load);

                panel2.add(checkbox1);
                panel2.add(checkbox2);
                panel2.add(checkbox3);
                panel2.add(checkbox4);
                panel2.add(checkbox5);
                panel2.add(backbutton);

                load.setBounds(1200,500,200,60);
                note1.setBounds(100,100,800,60);
                note2.setBounds(100,250,800,60);
                note3.setBounds(100,400,800,60);
                note4.setBounds(100,550,800,60);
                note5.setBounds(100,700,800,60);
                Save.setBounds(1200,300,200,60);
                Save.setIcon(icon3);
                checkbox1.setBounds(1000,100,50,50);
                checkbox2.setBounds(1000,250,50,50);
                checkbox3.setBounds(1000,400,50,50);
                checkbox4.setBounds(1000,550,50,50);
                checkbox5.setBounds(1000,700,50,50);


                panel2.setLayout(null);
                panel.setVisible(false);
               panel2.setVisible(true);// Can be set visible even if only the below line is used, but it works only once per session
                frame.add(panel2);

               save();
            }
        });

    }

    void save(){
    Save.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            SaveData data = new SaveData();
            data.setNote1(note1.getText());
            data.setNote2(note2.getText());
            data.setNote3(note3.getText());
            data.setNote4(note4.getText());
            data.setNote5(note5.getText());

            //This if statement series makes sure that the selection state of our note is saved
            if (checkbox1.isSelected())
            data.Strikethrough1=true;
            else
                data.Strikethrough1=false;

            if (checkbox2.isSelected())
                data.Strikethrough2=true;
            else
                data.Strikethrough2=false;

            if (checkbox3.isSelected())
                data.Strikethrough3=true;
            else
                data.Strikethrough3=false;

            if (checkbox4.isSelected())
                data.Strikethrough4=true;
            else
                data.Strikethrough4=false;
            if (checkbox5.isSelected())
                data.Strikethrough5=true;
            else
                data.Strikethrough5=false;
            Strikethrough();
            try{
                resourceManager.save(data, "myfile.file");

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    });
    load.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                SaveData data= (SaveData) resourceManager.load("myfile.file");
                note1.setText(data.getNote1());
                note2.setText(data.getNote2());
                note3.setText(data.getNote3());
                note4.setText(data.getNote4());
                note5.setText(data.getNote5());
                Strikethrough();
                while(i==5){
                    JOptionPane.showMessageDialog(null, "Congratulations for completing all the tasks");
                    break;
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    });
        backbutton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            panel2.setVisible(false);
            panel.setVisible(true);
            nextMenu();

        }
    });

    }

    void Strikethrough() {
       try {
           SaveData data = (SaveData) resourceManager.load("myfile.file");
           Hashtable<TextAttribute, Object> map = new Hashtable<TextAttribute, Object>();
           Font font = new Font(Font.SERIF, Font.PLAIN, 24);
           /* Creates the strikethrough fonts by getting it's properties by map */
           map.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
           font = font.deriveFont(map);


          //Checks all the fields if strikethrough should be enabled
           if (data.Strikethrough1) {
               note1.setFont(font);
               note1.setBackground(Color.green);
               i++;
           }
           else if (!data.Strikethrough1){
               note1.setFont(realfont);
               note1.setBackground(Color.white);
                i--;
           }
           if (data.Strikethrough2) {
               note2.setFont(font);
               note2.setBackground(Color.green);
               i++;
           }
           else if (!data.Strikethrough2){
               note2.setFont(realfont);
               note2.setBackground(Color.white);
               i--;
           }
           if (data.Strikethrough3) {
               note3.setFont(font);
               note3.setBackground(Color.green);
               i++;
           }
           else if (!data.Strikethrough3){
               note3.setFont(realfont);
               note3.setBackground(Color.white);
               i--;
           }
           if (data.Strikethrough4) {
               note4.setFont(font);
               note4.setBackground(Color.green);
               i++;
           }
           else if (!data.Strikethrough4){
               note4.setFont(realfont);
               note4.setBackground(Color.white);
               i--;
           }
           if (data.Strikethrough5) {
               note5.setFont(font);
               note5.setBackground(Color.green);
               i++;
           }
           else if (!data.Strikethrough5){
               note5.setFont(realfont);
               note5.setBackground(Color.white);
               i--;
           }
       }catch (Exception e1) {
           e1.printStackTrace();
       }
    }
}
