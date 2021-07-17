package com.railgate;

import com.railgate.process.*;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Bookings extends javax.swing.JFrame {

    ProcessDAO process = new ProcessImpl();
    PopUp popUp = new PopUp();

    public Bookings() throws SQLException, ClassNotFoundException {
        initComponents();
        setTable();

    }

    DefaultTableModel model = new DefaultTableModel();
    String[] columns = {"Ticket ID", "Train ID", "From", "To", "Date", "Seats", "Status"};

    void setTable() throws SQLException, ClassNotFoundException {
        bookingTable.setModel(model);
        model.setColumnIdentifiers(columns);
        findAll();
    }

    void findAll() throws SQLException, ClassNotFoundException {
        model.setRowCount(0);
        List<Ticket> tickets = process.search();
        for (Ticket ticket : tickets) {
            String[] tk = {String.valueOf(ticket.getTicketId()),
                String.valueOf(ticket.getTrainId()),
                ticket.getFrom(),
                ticket.getTo(),
                ticket.getDate(),
                String.valueOf(ticket.getSeats()),
                ticket.getStatus()};
            model.addRow(tk);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        banner = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        blank = new javax.swing.JLabel();
        form = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        bookingScrollPane = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        title = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RailGate");
        setUndecorated(true);
        setResizable(false);

        banner.setBackground(new java.awt.Color(56, 0, 54));

        name.setBackground(new java.awt.Color(240, 240, 240));
        name.setFont(new java.awt.Font("Playlist", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(240, 240, 240));
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("RailGate");

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

        blank.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        blank.setForeground(new java.awt.Color(229, 9, 20));
        blank.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        blank.setToolTipText("Close");
        blank.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        blank.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blank.setPreferredSize(new java.awt.Dimension(24, 26));

        javax.swing.GroupLayout bannerLayout = new javax.swing.GroupLayout(banner);
        banner.setLayout(bannerLayout);
        bannerLayout.setHorizontalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(blank, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bannerLayout.setVerticalGroup(
            bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(bannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blank, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bannerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        cancelButton.setText("Cancel Ticket");
        cancelButton.setToolTipText("Cancel booking.");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket ID", "Train ID", "From", "To", "Date", "Seats", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookingTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookingScrollPane.setViewportView(bookingTable);
        if (bookingTable.getColumnModel().getColumnCount() > 0) {
            bookingTable.getColumnModel().getColumn(0).setResizable(false);
            bookingTable.getColumnModel().getColumn(1).setResizable(false);
            bookingTable.getColumnModel().getColumn(2).setResizable(false);
            bookingTable.getColumnModel().getColumn(3).setResizable(false);
            bookingTable.getColumnModel().getColumn(4).setResizable(false);
            bookingTable.getColumnModel().getColumn(5).setResizable(false);
            bookingTable.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                .addContainerGap())
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookingScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        title.setText("MY BOOKINGS");

        back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(240, 240, 240));
        back.setText("<html>\n←<span style = \"font-size: 12px;\"> Back</span>\n</html>");
        back.setToolTipText("Back");
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title)
                    .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(Color.decode("#E53F2E"));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.decode("#E50914"));
    }//GEN-LAST:event_exitMouseExited

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        int selectedRow = bookingTable.getSelectedRow();
        if (selectedRow != -1) {
            if (bookingTable.getValueAt(selectedRow, 6).equals("Active")) {
                try {
                    int ticketId = Integer.parseInt(bookingTable.getValueAt(selectedRow, 0).toString());
                    Ticket ticket = process.getOne(ticketId);
                    if (ticket != null) {
                        int affectedRow = process.remove(ticketId);
                        if (affectedRow > 0) {
                            new Dashboard().setVisible(true);
                            this.setVisible(false);
                        } else {
                            popUp.setMessage("Opps! Error 404");
                            popUp.setObject(this);
                            popUp.setVisible(true);
                            this.setEnabled(false);
                        }
                    }
                } catch (Exception ex) {
                    popUp.setMessage("Error: " + ex.getMessage());
                    popUp.setObject(this);
                    popUp.setVisible(true);
                    this.setEnabled(false);
                }
            } else {
                popUp.setMessage("You cannot cancel expired tickets.");
                popUp.setObject(this);
                popUp.setVisible(true);
                this.setEnabled(false);
            }
        } else {
            popUp.setMessage("Please select a row.");
            popUp.setObject(this);
            popUp.setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new Dashboard().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setForeground(Color.decode("#F0EEA9"));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setForeground(Color.decode("#f0f0f0"));
    }//GEN-LAST:event_backMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel banner;
    private javax.swing.JLabel blank;
    private javax.swing.JScrollPane bookingScrollPane;
    private javax.swing.JTable bookingTable;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel exit;
    private javax.swing.JPanel form;
    private javax.swing.JLabel name;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
