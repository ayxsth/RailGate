package com.railgate;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Queue;

public class LoginUI extends javax.swing.JFrame {

    private Dashboard dashboard = new Dashboard();
    private static PopUp popUp = new PopUp();

    public LoginUI() {
        initComponents();
    }


    Queue<BookedUsers> bookUsers;
    
//    public void loadUsers() {
//        try {
//            bookUsers = loadUser.loadUsers();
//            for (BookedUsers bookUser : bookUsers) {
//                System.out.println(bookUser.getFirstName());
//            }
//            System.out.println("---------------------------");
//        } catch (FileNotFoundException ex) {
//
//        }
//
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        brandingPanel = new javax.swing.JPanel();
        slogan = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        welcome = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        remember = new javax.swing.JCheckBox();
        login = new javax.swing.JButton();
        or = new javax.swing.JLabel();
        loginGoogle = new javax.swing.JButton();
        exit = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RailGate");
        setUndecorated(true);
        setResizable(false);

        brandingPanel.setBackground(new java.awt.Color(56, 0, 54));
        brandingPanel.setForeground(new java.awt.Color(73, 104, 158));

        slogan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        slogan.setForeground(new java.awt.Color(240, 240, 240));
        slogan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        slogan.setText("BOOK YOUR NEXT TRAIN");

        name.setFont(new java.awt.Font("Playlist", 1, 54)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("RailGate");

        javax.swing.GroupLayout brandingPanelLayout = new javax.swing.GroupLayout(brandingPanel);
        brandingPanel.setLayout(brandingPanelLayout);
        brandingPanelLayout.setHorizontalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addGroup(brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slogan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(brandingPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
                .addContainerGap())
        );
        brandingPanelLayout.setVerticalGroup(
            brandingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brandingPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(name)
                .addGap(156, 156, 156)
                .addComponent(slogan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome Back!");

        username.setText("Username:");

        password.setText("Password:");

        remember.setText("Remember me");
        remember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.setToolTipText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        or.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        or.setText("--OR--");

        loginGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/railgate/img/icons8_google.png"))); // NOI18N
        loginGoogle.setText("Login with Google");
        loginGoogle.setToolTipText("Login with Google");
        loginGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginGoogleActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(229, 9, 20));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        exit.setText("×");
        exit.setToolTipText("Close");
        exit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setPreferredSize(new java.awt.Dimension(24, 26));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(or, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remember)
                    .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(welcome)
                .addGap(18, 18, 18)
                .addComponent(username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(remember)
                .addGap(18, 18, 18)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(or)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginGoogle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(brandingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(brandingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private User getCredentials() {
        return new User(usernameTextField.getText().trim(), passwordField.getText().trim());
    }

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        User user = getCredentials();
        if (user.getUsername().equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("admin")) {
        //    loadUsers();
            dashboard.setVisible(true);
            this.setVisible(false);

        } else if (user.getUsername().equals("") || user.getPassword().equals("")) {
            popUp.setMessage("Please enter both username and password.");
            popUp.setObject(this);
            popUp.setVisible(true);
            this.setEnabled(false);
        } else {
            popUp.setMessage("Incorrect username or password.");
            popUp.setObject(this);
            popUp.setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(Color.decode("#E53F2E"));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.decode("#E50914"));
    }//GEN-LAST:event_exitMouseExited

    private void loginGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginGoogleActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            popUp.setMessage("Oops! Only for Beta Testers.");
            popUp.setObject(this);
            popUp.setVisible(true);
            this.setEnabled(false);
        });
    }//GEN-LAST:event_loginGoogleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel brandingPanel;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel form;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JButton loginGoogle;
    private javax.swing.JLabel name;
    private javax.swing.JLabel or;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox remember;
    private javax.swing.JLabel slogan;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
