import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class ExamPage extends javax.swing.JFrame {

    
        public String questionId="0";
        public String ans;
        public int min=0;
        public int marks = 0;
        public int sec=0;
        
        public void answerCheck()
        {
                String studentAnswer=" ";
                if(txtopt1.isSelected()){
                    studentAnswer = txtopt1.getText();
                }
                else if(txtopt2.isSelected()){
                    studentAnswer = txtopt2.getText();
                }
                else if(txtopt3.isSelected()){
                    studentAnswer = txtopt3.getText();
                }
                else 
                {
                    studentAnswer = txtopt4.getText();
                }
                if(studentAnswer.equals(ans)){
                    marks = marks+1;
                    String marks1 = String.valueOf(marks);
                    txtmarks.setText(marks1);
                }
                
                 int questionId1 = Integer.parseInt(questionId);
                 questionId1 = questionId1 +1;
                 questionId=String.valueOf(questionId1);
                 
                 txtopt1.setSelected(false);
                  txtopt2.setSelected(false);
                   txtopt3.setSelected(false);
                    txtopt4.setSelected(false);
                 
                 
                 if(questionId.equals("10")){
                     jButton1.setVisible(false);
                 }
        }
        public void question()
        {
             try{
                 //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Akash@217");
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs1=st.executeQuery("select * from question where id ='"+questionId+"' ");
           while(rs1.next())
           {
               txtid.setText(rs1.getString(1));
               txtquestion.setText(rs1.getString(2));
               txtopt1.setText(rs1.getString(3));
               txtopt2.setText(rs1.getString(4));
               txtopt3.setText(rs1.getString(5));
               txtopt4.setText(rs1.getString(6));
               ans = rs1.getString(7);
           }
        }
        catch(Exception e){
            JFrame f=new JFrame();
            f.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(f,e);
        }
        }
        public void submit()
        {
            String rollno = txtrollno.getText();
            answerCheck();
            try
            {
              //  Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Akash@217");
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); 
           
           st.executeUpdate("update registration set marks='"+marks+"' where rollno = '"+rollno+"' ");  
           String marks1=String.valueOf(marks);
           
           JOptionPane.showMessageDialog(null,marks1);
            }
            catch(Exception e){
         JOptionPane.showMessageDialog(null,e);
            }
                
        }  
        
        
    public ExamPage() {
        initComponents();
    }
    
    Timer time;
    public ExamPage(String rollno){
        initComponents();
        txtrollno.setText(rollno);

                  
        //txtid.setText(id);
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date() ;
        txtdate.setText(dFormat.format(date));
        
          try{
            //  Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_exam","root","Akash@217");
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            ResultSet rs=st.executeQuery("select * from registration where rollno ='"+rollno+"' ");
           while(rs.next())
           {
               txtname.setText(rs.getString(1));
           }
           ResultSet rs1=st.executeQuery("select * from question where id ='"+questionId+"' ");
           while(rs1.next())
           {
               txtid.setText(rs1.getString(1));
               txtquestion.setText(rs1.getString(2));
               txtopt1.setText(rs1.getString(3));
               txtopt2.setText(rs1.getString(4));
               txtopt3.setText(rs1.getString(5));
               txtopt4.setText(rs1.getString(6));
               ans = rs1.getString(7);
           }
        }
        catch(Exception e){
            JFrame f=new JFrame();
            f.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(f,e);
        }
          setLocationRelativeTo(this);
          time = new Timer (1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               txtmin.setText(String.valueOf(min));
                  txtsec.setText(String.valueOf(sec));
                  
                  if(sec==60){
                      sec=0;
                      min++;
                      if(min==10){
                          time.stop();
                          answerCheck();
                          submit();
                          
                      }
                  }
                  sec++;
              }
          });
          time.start();
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmin = new javax.swing.JLabel();
        txtdate = new javax.swing.JLabel();
        txtsec = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtrollno = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        txtmarks = new javax.swing.JLabel();
        txtquestion = new javax.swing.JLabel();
        txtopt1 = new javax.swing.JRadioButton();
        txtopt2 = new javax.swing.JRadioButton();
        txtopt3 = new javax.swing.JRadioButton();
        txtopt4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Date");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Total Time :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Time Taken :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("10 min");

        txtmin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtmin.setForeground(new java.awt.Color(255, 51, 102));
        txtmin.setText("00");

        txtdate.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtdate.setText("jLabel8");

        txtsec.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtsec.setForeground(new java.awt.Color(255, 51, 102));
        txtsec.setText("00");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("Welcome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsec)))
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmin)
                    .addComponent(txtsec, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, -1, 100));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Name");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Roll Number");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Total Question");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Question Number");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("Your Marks");

        txtname.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtname.setText("your name");

        txtrollno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtrollno.setText("1000");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("10");

        txtid.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtid.setText("00");

        txtmarks.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtmarks.setText("00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmarks)
                    .addComponent(txtid)
                    .addComponent(jLabel16)
                    .addComponent(txtrollno)
                    .addComponent(txtname))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtrollno))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtid))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtmarks))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 100, -1, -1));

        txtquestion.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        txtquestion.setForeground(new java.awt.Color(0,0,0));
        txtquestion.setText("Question");
        getContentPane().add(txtquestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 150, -1, -1));

        txtopt1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtopt1.setForeground(new java.awt.Color(255, 0, 0));
        txtopt1.setText("jRadioButton1");
        txtopt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtopt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 240, -1, -1));

        txtopt2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtopt2.setForeground(new java.awt.Color(255, 0, 0));
        txtopt2.setText("jRadioButton2");
        txtopt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopt2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtopt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 310, -1, -1));

        txtopt3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtopt3.setForeground(new java.awt.Color(255, 0, 0));
        txtopt3.setText("jRadioButton3");
        txtopt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopt3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtopt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 380, -1, -1));

        txtopt4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtopt4.setForeground(new java.awt.Color(255, 0, 0));
        txtopt4.setText("jRadioButton4");
        txtopt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtopt4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtopt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 255));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                answerCheck();
//                question();
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 600, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 255));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, -1, -1));

//       jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Akash\\Desktop\\download (2).jpg"))); // NOI18N
//        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 100, 680, 620));
//
//       jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Akash\\Desktop\\download (2).jpg"))); // NOI18N
//        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 440, 430, 280));
            
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
         int a = JOptionPane.showConfirmDialog(null,"Do You Really Want to Submit","Select",JOptionPane.YES_NO_OPTION);
         if (a==0){
             answerCheck();
             submit();
             
         }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       answerCheck();
       question();
       
    }                                        

    private void txtopt1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       if(txtopt1.isSelected())
       {
           txtopt2.setSelected(false);
           txtopt3.setSelected(false);
           txtopt4.setSelected(false);
    }                                       
    }
    private void txtopt2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
          if(txtopt2.isSelected())
       {
           txtopt1.setSelected(false);
           txtopt3.setSelected(false);
           txtopt4.setSelected(false);
    }
    }                                       

    private void txtopt3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
         if(txtopt3.isSelected())
       {
           txtopt2.setSelected(false);
           txtopt1.setSelected(false);
           txtopt4.setSelected(false);
    }
    }                                       

    private void txtopt4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       
          if(txtopt4.isSelected())
       {
           txtopt2.setSelected(false);
           txtopt3.setSelected(false);
           txtopt1.setSelected(false);
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
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtdate;
    private javax.swing.JLabel txtid;
    private javax.swing.JLabel txtmarks;
    private javax.swing.JLabel txtmin;
    private javax.swing.JLabel txtname;
    private javax.swing.JRadioButton txtopt1;
    private javax.swing.JRadioButton txtopt2;
    private javax.swing.JRadioButton txtopt3;
    private javax.swing.JRadioButton txtopt4;
    private javax.swing.JLabel txtquestion;
    private javax.swing.JLabel txtrollno;
    private javax.swing.JLabel txtsec;
    // End of variables declaration                   
}