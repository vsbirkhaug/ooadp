/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabletennisscores;

import data_classes.Team;
import java.awt.Color;
import java.awt.event.WindowEvent;

/**
 *
 * @author Vilde
 */
public class AddTeam extends javax.swing.JFrame {

    /**
     * Creates new form AddTeam
     */
    public AddTeam() {
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

        teamNameTextField = new javax.swing.JTextField();
        venueNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addTeamButton = new javax.swing.JButton();
        cancelFrameButton = new javax.swing.JButton();
        addTeamErrorLabel = new javax.swing.JLabel();

        setTitle("Add team");

        jLabel1.setText("Team name");

        jLabel2.setText("Venue name");

        addTeamButton.setText("Add team");
        addTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeamButtonActionPerformed(evt);
            }
        });

        cancelFrameButton.setText("Cancel");
        cancelFrameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelFrameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(cancelFrameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addTeamButton)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addTeamErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1))
                    .addComponent(teamNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venueNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teamNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(venueNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addTeamErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addTeamButton)
                    .addComponent(cancelFrameButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeamButtonActionPerformed
        addTeam();       
    }//GEN-LAST:event_addTeamButtonActionPerformed

    private void cancelFrameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelFrameButtonActionPerformed
       closeWindow();
    }//GEN-LAST:event_cancelFrameButtonActionPerformed

    private void closeWindow() {
        this.setVisible(false);
        this.dispose();
    }
    
    private void addTeam() {
        String teamName = teamNameTextField.getText().toString();
        String venueName = venueNameTextField.getText().toString();
        
        if(teamName.isEmpty() || venueName.isEmpty()) { 
            addTeamErrorLabel.setForeground(Color.RED);
            addTeamErrorLabel.setText("Please don't leave any fields empty.");
        } else {
        
            Team newTeam = new Team(teamName, venueName);
            if(newTeam != null) {
                TTScoreGUI1.manager.teams.add(newTeam);
            }            
            closeWindow();
        }
        
        for(Team t :  TTScoreGUI1.manager.teams) {
            System.out.println(t.toString());
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
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTeamButton;
    private javax.swing.JLabel addTeamErrorLabel;
    private javax.swing.JButton cancelFrameButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField teamNameTextField;
    private javax.swing.JTextField venueNameTextField;
    // End of variables declaration//GEN-END:variables
}
