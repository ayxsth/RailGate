/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.railgate;

/**
 *
 * @author ayxst
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        bookTicketButton = new javax.swing.JButton();
        myBookingsButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        trainScrollPane = new javax.swing.JScrollPane();
        trainTable = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RailGate");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(690, 470));
        setResizable(false);

        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(229, 9, 20));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        exit.setText("×");
        exit.setToolTipText("Close");
        exit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(56, 0, 54));

        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Playlist", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("RailGate");

        bookTicketButton.setBackground(new java.awt.Color(56, 0, 54));
        bookTicketButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bookTicketButton.setForeground(new java.awt.Color(240, 240, 240));
        bookTicketButton.setText("Book Ticket");
        bookTicketButton.setBorder(null);
        bookTicketButton.setFocusPainted(false);
        bookTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTicketButtonActionPerformed(evt);
            }
        });

        myBookingsButton.setBackground(new java.awt.Color(56, 0, 54));
        myBookingsButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        myBookingsButton.setForeground(new java.awt.Color(240, 240, 240));
        myBookingsButton.setText("My Bookings");
        myBookingsButton.setBorder(null);
        myBookingsButton.setFocusPainted(false);

        logoutButton.setBackground(new java.awt.Color(56, 0, 54));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(240, 240, 240));
        logoutButton.setText("Logout");
        logoutButton.setBorder(null);
        logoutButton.setFocusPainted(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(bookTicketButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(myBookingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(name)
                .addGap(48, 48, 48)
                .addComponent(bookTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(myBookingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome.setText("Welcome, Void");

        trainTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1101H", "Kathmandu", "Pokhara", "10:00 AM", "45", "17/07/2021"},
                {"7735A", "Gorkha", "Bhaktapur", "02:00PM", "34", "17/07/2021"},
                {"4261F", "Janakpur", "Muktinath", "08:00 PM", "78", "18/07/2021"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Train ID", "From", "To", "Time", "Available Seats", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        trainScrollPane.setViewportView(trainTable);
        if (trainTable.getColumnModel().getColumnCount() > 0) {
            trainTable.getColumnModel().getColumn(0).setResizable(false);
            trainTable.getColumnModel().getColumn(1).setResizable(false);
            trainTable.getColumnModel().getColumn(2).setResizable(false);
            trainTable.getColumnModel().getColumn(3).setResizable(false);
            trainTable.getColumnModel().getColumn(4).setResizable(false);
            trainTable.getColumnModel().getColumn(5).setResizable(false);
        }

        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.setText("Search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchTextField))
                    .addComponent(trainScrollPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trainScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new LoginUI().setVisible(true);
            this.setVisible(false);
        });
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void bookTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTicketButtonActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new BookTrain().setVisible(true);
            this.setVisible(false);
        });
    }//GEN-LAST:event_bookTicketButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookTicketButton;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton myBookingsButton;
    private javax.swing.JLabel name;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JScrollPane trainScrollPane;
    private javax.swing.JTable trainTable;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
