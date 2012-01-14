/*
 * Copyright (C) 2011 Thedeath<www.fseek.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * TestApp.java
 *
 * Created on 03.05.2011, 01:04:43
 */
package test;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.fseek.jtwitteruser.JTwitterUser;
import org.fseek.jtwitteruser.Status;
import org.fseek.jtwitteruser.User;

/**
 *
 * @author Thedeath<www.fseek.org>
 */
public class TestApp extends javax.swing.JFrame implements Runnable
{

    /** Creates new form TestApp */
    public TestApp()
    {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        screenNameLabel = new javax.swing.JLabel();
        followersLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionArea = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusArea = new javax.swing.JEditorPane();
        locationLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TwitterUser TestApp");

        jPanel1.setLayout(new java.awt.GridLayout(7, 1, 0, 10));

        jLabel1.setText("Profile Image:");
        jPanel1.add(jLabel1);

        jLabel3.setText("Name:");
        jPanel1.add(jLabel3);

        jLabel4.setText("Screen Name:");
        jPanel1.add(jLabel4);

        jLabel6.setText("Followers:");
        jPanel1.add(jLabel6);

        jLabel7.setText("Description:");
        jPanel1.add(jLabel7);

        jLabel12.setText("Status:");
        jPanel1.add(jLabel12);

        jLabel5.setText("Location:");
        jPanel1.add(jLabel5);

        jPanel2.setLayout(new java.awt.GridLayout(7, 1, 0, 10));
        jPanel2.add(imageLabel);
        jPanel2.add(nameLabel);
        jPanel2.add(screenNameLabel);
        jPanel2.add(followersLabel);

        descriptionArea.setEditable(false);
        jScrollPane1.setViewportView(descriptionArea);

        jPanel2.add(jScrollPane1);

        statusArea.setEditable(false);
        jScrollPane2.setViewportView(statusArea);

        jPanel2.add(jScrollPane2);
        jPanel2.add(locationLabel);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel2.setText("TwitterID:");

        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_searchButtonActionPerformed
    {//GEN-HEADEREND:event_searchButtonActionPerformed
        if(searchField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "You must type in a twitter id !");
            return;
        }
        Thread t = new Thread(this);
        t.start();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt)//GEN-FIRST:event_searchFieldKeyReleased
    {//GEN-HEADEREND:event_searchFieldKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            searchButtonActionPerformed(null);
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {

            public void run()
            {
                new TestApp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane descriptionArea;
    private javax.swing.JLabel followersLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel screenNameLabel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JEditorPane statusArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run()
    {
        try
        {
            User parseProfil = JTwitterUser.parseProfil(searchField.getText());
            URL profile_image_url = new URL(parseProfil.getProfile_image_url());
            ImageIcon icon = new ImageIcon(profile_image_url);
            imageLabel.setIcon(icon);
            imageLabel.setSize(icon.getIconHeight(), icon.getIconWidth());
            nameLabel.setText(parseProfil.getName());
            screenNameLabel.setText(parseProfil.getScreen_name());
            locationLabel.setText(parseProfil.getLocation());
            followersLabel.setText(String.valueOf(parseProfil.getFollowers_count()));
            descriptionArea.setText(parseProfil.getDescription());
            Status status = parseProfil.getStatus();
            if(status != null)
            {
                statusArea.setText(status.getText());
            }
            this.pack();
        }
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(this, "User not found !");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}
