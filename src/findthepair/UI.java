/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findthepair;

import findthepair.game.Game;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Skaper
 */
public class UI extends javax.swing.JFrame {
    
    private boolean once;
    private short counter;

    /**
     * Creates new form UI
     */
    public UI() {
        this.counter = 0;
        this.once = true;
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

        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        label11 = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        label13 = new javax.swing.JLabel();
        label14 = new javax.swing.JLabel();
        label15 = new javax.swing.JLabel();
        label16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 125));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.GridLayout(4, 4, 3, 3));

        label1.setBackground(new java.awt.Color(36, 72, 103));
        label1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label1.setOpaque(true);
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label1);

        label2.setBackground(new java.awt.Color(36, 72, 103));
        label2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label2.setOpaque(true);
        label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label2);

        label3.setBackground(new java.awt.Color(36, 72, 103));
        label3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label3.setOpaque(true);
        label3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label3);

        label4.setBackground(new java.awt.Color(36, 72, 103));
        label4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label4.setOpaque(true);
        label4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label4);

        label5.setBackground(new java.awt.Color(36, 72, 103));
        label5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label5.setOpaque(true);
        label5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label5);

        label6.setBackground(new java.awt.Color(36, 72, 103));
        label6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label6.setOpaque(true);
        label6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label6);

        label7.setBackground(new java.awt.Color(36, 72, 103));
        label7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label7.setOpaque(true);
        label7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label7);

        label8.setBackground(new java.awt.Color(36, 72, 103));
        label8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label8.setOpaque(true);
        label8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label8);

        label9.setBackground(new java.awt.Color(36, 72, 103));
        label9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label9.setOpaque(true);
        label9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label9);

        label10.setBackground(new java.awt.Color(36, 72, 103));
        label10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label10.setOpaque(true);
        label10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label10);

        label11.setBackground(new java.awt.Color(36, 72, 103));
        label11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label11.setOpaque(true);
        label11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label11);

        label12.setBackground(new java.awt.Color(36, 72, 103));
        label12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label12.setOpaque(true);
        label12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label12);

        label13.setBackground(new java.awt.Color(36, 72, 103));
        label13.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label13.setOpaque(true);
        label13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label13);

        label14.setBackground(new java.awt.Color(36, 72, 103));
        label14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label14.setOpaque(true);
        label14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label14);

        label15.setBackground(new java.awt.Color(36, 72, 103));
        label15.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label15.setOpaque(true);
        label15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label15);

        label16.setBackground(new java.awt.Color(36, 72, 103));
        label16.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        label16.setOpaque(true);
        label16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                label1MouseReleased(evt);
            }
        });
        jPanel1.add(label16);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void label1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseReleased
        JLabel temp = new JLabel();
        
        temp = (JLabel) evt.getSource();
        
        if (temp == label1)
            sendInfo(label1, (short)1);
        else if (temp == label2)
            sendInfo(label2, (short)2);
        else if (temp == label3)
            sendInfo(label3, (short)3);
        else if (temp == label4)
            sendInfo(label4, (short)4);
        else if (temp == label5)
            sendInfo(label5, (short)5);
        else if (temp == label6)
            sendInfo(label6, (short)6);
        else if (temp == label7)
            sendInfo(label7, (short)7);
        else if (temp == label8)
            sendInfo(label8, (short)8);
        else if (temp == label9)
            sendInfo(label9, (short)9);
        else if (temp == label10)
            sendInfo(label10, (short)10);
        else if (temp == label11)
            sendInfo(label11, (short)11);
        else if (temp == label12)
            sendInfo(label12, (short)12);
        else if (temp == label13)
            sendInfo(label13, (short)13);
        else if (temp == label14)
            sendInfo(label14, (short)14);
        else if (temp == label15)
            sendInfo(label15, (short)15);
        else if (temp == label16)
            sendInfo(label16, (short)16);
    }//GEN-LAST:event_label1MouseReleased
    
    private void sendInfo(javax.swing.JLabel label, short position){
        Game game = new Game();
        
        counter++;
        
        if (game.checkIfAllDisabled()) {
            counter--;
            if (counter == 16) {
                String s = "Perfect Score!!! You completed in the minimum "
                        + "number of moves available.";
                JOptionPane.showMessageDialog(rootPane, s, "Result", 
                        JOptionPane.PLAIN_MESSAGE);
            } else if (counter > 16) {
                String s = "You took " +counter +" moves to complete.";
                JOptionPane.showMessageDialog(rootPane, s, "Result", 
                        JOptionPane.PLAIN_MESSAGE);
            }
        }
            
        while (this.once) {
            game.listOfLabels(label1, label2, label3, label4, label5, 
                    label6, label7, label8, label9, label10, label11, label12, 
                    label13, label14, label15, label16);
            game.createList();
            this.once = false;
        }
        
        game.letsPlay(position, label);
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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label16;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    // End of variables declaration//GEN-END:variables
}
