import com.sun.glass.events.KeyEvent;
import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.lang.ClassNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akash
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form registrationform
     */
    public StudentRegistration() {
        initComponents();
//        this.setAlwaysOnTop(true);
//       this.setResizable(false);
//       this.setVisible(true);
//       initComponents();
//       Toolkit toolkit = Toolkit.getDefaultToolkit();
//         int xsize = (int) toolkit.getScreenSize().getWidth();
//         int ysize = (int) toolkit.getScreenSize().getHeight();
//         this.setSize(xsize, ysize);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 225), 20, true));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("         STUDENT REGISTRATION");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(70, 250, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("FULL NAME        :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 125, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 5, 0, 0);
        jPanel1.add(jTextField1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("CLASS                :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 125, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel1.add(jTextField2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("YEAR                  :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 125, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 5, 0, 0);
        jPanel1.add(jTextField3, gridBagConstraints);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel1.add(jTextField5, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ROLL NO           :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 125, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("PHONE NUMBER :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 125, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("EMAIL                :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 125, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("PASSWORD        :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 125, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 5, 0, 0);
        jPanel1.add(jTextField6, gridBagConstraints);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 5, 0, 0);
        jPanel1.add(jTextField4, gridBagConstraints);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 203, 0, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 244;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 3, 0, 0);
        jPanel1.add(jPasswordField1, gridBagConstraints);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Akash\\Desktop\\download (2).jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.ipadx = -357;
        gridBagConstraints.ipady = -190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 50, 107, 87);
        jPanel1.add(jLabel10, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c)|| Character.isWhitespace(c) || Character.isISOControl(c))
        {
            jTextField1.setEditable(true);
            
        }   
        else
        {
               jTextField1.setEditable(false);
        }
            
    }                                    

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACKSPACE ||  c==KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }                                    

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

        Connection con1;
        PreparedStatement insert;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
                    String fullname = jTextField1.getText();
                       String class1 = jTextField2.getText();
                          String year = jTextField3.getText();
                             String email  = jTextField4.getText();
                                String rollno = jTextField5.getText();
                                   String phoneno = jTextField6.getText();
                                      String password = jPasswordField1.getText();
                                         
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Akash21");
            insert = con1.prepareStatement("insert into registration(fullname,class1,year,rollno,phoneno,email,password) values(?,?,?,?,?,?,?)");
            insert.setString(1,fullname);
            insert.setString(2,class1);
            insert.setString(3,year);
            insert.setString(4,rollno);
            insert.setString(5,phoneno);
            insert.setString(6,email);
            insert.setString(7,password);
            insert.executeUpdate();
            
        JOptionPane.showMessageDialog(this, "REGISTRATION DONE SUCCESSFULLY :) ");
             loginform f = new loginform();
             f.setVisible(true);
             dispose();
           
            
        }
        catch(SQLException  | ClassNotFoundException ex){
            
                    JOptionPane.showMessageDialog(this, "*ALL FIELDS SHOULD BE FILLED PROPERLY");
      
        } 
            
        
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration                   

    private static class registrationform {

        public registrationform() {
        }
    }
}
