
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Umar Faruk Shuvo
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
     private String username,email,batch,department;
    private String password;

    public Home(String username) {
        this.username = username;
       // this.password = password;
        initComponents();
    }
    public Home() {
        initComponents();
         // initComponents();
        // ImageIcon
//         Icon i =jP.getIcon();
//         ImageIcon icon=(ImageIcon)i;
//         Image image = icon.getImage().getScaledInstance(jP.getWidth(),jP.getHeight(),Image.SCALE_SMOOTH);
//         jP.setIcon(new ImageIcon(image));
        jP.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Central Library");
        setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 204, 204));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Central Library");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("“A library is like an island in the middle of a vast sea of ignorance,");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("particularly if the library is very tall and the surrounding area has been flooded.”");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("― Lemony Snicket, Horseradish: Bitter Truths You Can't Avoid");

        javax.swing.GroupLayout jPLayout = new javax.swing.GroupLayout(jP);
        jP.setLayout(jPLayout);
        jPLayout.setHorizontalGroup(
            jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39))
        );
        jPLayout.setVerticalGroup(
            jPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        getContentPane().add(jP, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 910, 370));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesF.jpeg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1672, 827));
        jLabel1.setPreferredSize(new java.awt.Dimension(1600, 900));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, 850));

        jMenuBar2.setBackground(new java.awt.Color(102, 0, 0));
        jMenuBar2.setForeground(new java.awt.Color(0, 0, 255));

        jMenu4.setText("PROFILE");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("View Profile");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar2.add(jMenu4);

        jMenu1.setText("BOOKS");

        jMenuItem2.setText("Go to book");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar2.add(jMenu1);

        jMenu5.setText("ADMIN");

        jMenuItem3.setText("Go to Admin");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuBar2.add(jMenu5);

        jMenu6.setText("LOGOUT");

        jMenuItem4.setText("logout");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
//             Profile profileFrame = new Profile();
//            setProfileTextFields(profileFrame); // Set text field values
//            profileFrame.setVisible(true); // Show the Profile form
//            dispose(); 
            
    }//GEN-LAST:event_jMenu4ActionPerformed
 private void setProfileTextFields(Profile profileFrame) {
        // Access the Profile form's text fields using the getters
        JLabel txtName = profileFrame.getTxtName();
        JLabel txtEmail = profileFrame.getTxtEmail();
        JLabel txtBatch = profileFrame.getTxtBatch();
        JLabel txtRoll = profileFrame.getTxtRoll();
        JLabel txtDepartment=profileFrame.getTxtDept();
        String url = "jdbc:mysql://localhost:3306/student";
        String duser = "root";
        String dpassword = "";

        try (Connection connection = DriverManager.getConnection(url, duser, dpassword)) {
            String query = "SELECT * FROM faruk WHERE `E-mail` = ? ";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
              //  preparedStatement.setString(2, password);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        // Data matching the username and password is found
                        // Fetch the user's data from the result set and set it in text fields
                        txtName.setText(resultSet.getString("Name"));
                        txtEmail.setText(resultSet.getString("E-mail"));
                        txtBatch.setText(String.valueOf(resultSet.getInt("Batch")));
                        txtRoll.setText(String.valueOf(resultSet.getInt("Roll")));
                        txtDepartment.setText(resultSet.getString("Department"));
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            // Handle any database-related errors here
        }
    }
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
  Profile profileFrame = new Profile(username);
            setProfileTextFields(profileFrame); // Set text field values
            profileFrame.setVisible(true); // Show the Profile form
            dispose(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         setVisible(false); 
//              Profile profileFrame = new Profile();
//            setProfileTextFields(profileFrame); 
            BOOK homeFrame = new BOOK(username);
            homeFrame.setVisible(true);
            homeFrame.pack();
            homeFrame.setLocationRelativeTo(null);
            dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
         Admin_login homeFrame = new Admin_login(username);
            homeFrame.setVisible(true);
            homeFrame.pack();
            homeFrame.setLocationRelativeTo(null);
            dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
            Login homeFrame = new Login();
            homeFrame.setVisible(true);
            homeFrame.pack();
            homeFrame.setLocationRelativeTo(null);
            dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
  //  User user = new User("email","name","department", 20, 16, "department");
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jP;
    // End of variables declaration//GEN-END:variables
}
