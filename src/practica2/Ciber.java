package practica2;

import javax.swing.JOptionPane;

public class Ciber extends javax.swing.JFrame {

    Control c, c1, c2, c3;

    public Ciber() {
        initComponents();
        this.setLocationRelativeTo(null);
        BtP1.setEnabled(false);
        BtR1.setEnabled(false);
        BtF1.setEnabled(false);
        BtP2.setEnabled(false);
        BtR2.setEnabled(false);
        BtF2.setEnabled(false);
        BtP3.setEnabled(false);
        BtR3.setEnabled(false);
        BtF3.setEnabled(false);
        BtP4.setEnabled(false);
        BtR4.setEnabled(false);
        BtF4.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        T1 = new javax.swing.JLabel();
        BtP1 = new javax.swing.JButton();
        BtR1 = new javax.swing.JButton();
        BtF1 = new javax.swing.JButton();
        BtI1 = new javax.swing.JButton();
        BtP3 = new javax.swing.JButton();
        BtR3 = new javax.swing.JButton();
        BtF3 = new javax.swing.JButton();
        BtI3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        T3 = new javax.swing.JLabel();
        T2 = new javax.swing.JLabel();
        BtI2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        BtF2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BtR2 = new javax.swing.JButton();
        BtP2 = new javax.swing.JButton();
        T4 = new javax.swing.JLabel();
        BtI4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        BtF4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        BtR4 = new javax.swing.JButton();
        BtP4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        P4 = new javax.swing.JLabel();
        Gt = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        G1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        G2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        G3 = new javax.swing.JLabel();
        G4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Maquina 1");

        jLabel1.setText("31 a 1 hora 10$");

        jLabel3.setText("Tarifas: 30 minutos 5$");

        jLabel4.setText("Tiempo");

        T1.setText("00:00:00");

        BtP1.setText("Pausa");
        BtP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtP1ActionPerformed(evt);
            }
        });

        BtR1.setText("Reanudar");
        BtR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtR1ActionPerformed(evt);
            }
        });

        BtF1.setText("Terminar y cobrar");
        BtF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtF1ActionPerformed(evt);
            }
        });

        BtI1.setText("Inicio");
        BtI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtI1ActionPerformed(evt);
            }
        });

        BtP3.setText("Pausa");
        BtP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtP3ActionPerformed(evt);
            }
        });

        BtR3.setText("Reanudar");
        BtR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtR3ActionPerformed(evt);
            }
        });

        BtF3.setText("Terminar y cobrar");
        BtF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtF3ActionPerformed(evt);
            }
        });

        BtI3.setText("Inicio");
        BtI3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtI3ActionPerformed(evt);
            }
        });

        jLabel6.setText("31 a 1 hora 18$");

        jLabel7.setText("Tarifas: 30 minutos 9$");

        jLabel8.setText("Tiempo");

        jLabel9.setText("Maquina 3");

        T3.setText("00:00:00");

        T2.setText("00:00:00");

        BtI2.setText("Inicio");
        BtI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtI2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Tarifas: 30 minutos 7$");

        BtF2.setText("Terminar y cobrar");
        BtF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtF2ActionPerformed(evt);
            }
        });

        jLabel13.setText("31 a 1 hora 14$");

        jLabel14.setText("Tiempo");

        jLabel15.setText("Maquina 2");

        BtR2.setText("Reanudar");
        BtR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtR2ActionPerformed(evt);
            }
        });

        BtP2.setText("Pausa");
        BtP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtP2ActionPerformed(evt);
            }
        });

        T4.setText("00:00:00");

        BtI4.setText("Inicio");
        BtI4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtI4ActionPerformed(evt);
            }
        });

        jLabel17.setText("Tarifas: 30 minutos 11$");

        BtF4.setText("Terminar y cobrar");
        BtF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtF4ActionPerformed(evt);
            }
        });

        jLabel18.setText("31 a 1 hora 22$");

        jLabel19.setText("Tiempo");

        jLabel20.setText("Maquina 4");

        BtR4.setText("Reanudar");
        BtR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtR4ActionPerformed(evt);
            }
        });

        BtP4.setText("Pausa");
        BtP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtP4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Presio:   $");

        jLabel10.setText("Presio:  $");

        jLabel11.setText("Presio:  $");

        jLabel16.setText("Presio:   $");

        P1.setText("0.00");

        P2.setText("0.00");

        P3.setText("0.00");

        P4.setText("0.00");

        Gt.setText("Ganancias totales ");
        Gt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GtActionPerformed(evt);
            }
        });

        jLabel21.setText("Ganancia producida:");

        G1.setText("0.00");

        jLabel22.setText("Ganancia producida:");

        G2.setText("0.00");

        jLabel24.setText("Ganancia producida:");

        jLabel25.setText("Ganancia producida:");

        G3.setText("0.00");

        G4.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtI1)
                                        .addGap(4, 4, 4)
                                        .addComponent(BtP1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtR1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(BtF1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(62, 62, 62)
                                                    .addComponent(jLabel2))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(T1))
                                                .addComponent(jLabel3)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(P1))))))
                                .addGap(141, 141, 141)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BtI2)
                                        .addGap(4, 4, 4)
                                        .addComponent(BtP2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BtR2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(BtF2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(T2))
                                                .addComponent(jLabel12)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(P2)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(G2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(Gt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(211, 211, 211)))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BtI3)
                                                .addGap(4, 4, 4)
                                                .addComponent(BtP3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtR3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel8)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(T3))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(62, 62, 62)
                                                            .addComponent(jLabel9))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel16)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(P3))))))
                                        .addGap(149, 149, 149)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(BtI4)
                                                .addGap(4, 4, 4)
                                                .addComponent(BtP4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BtR4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel20))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel19)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addComponent(T4))
                                                        .addComponent(jLabel17)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel10)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(P4)))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(BtF3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtF4)
                                        .addGap(51, 51, 51))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(G4)
                                .addGap(64, 64, 64)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(T1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(P1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtP1)
                            .addComponent(BtR1)
                            .addComponent(BtI1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtF1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(T2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(P2))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtP2)
                            .addComponent(BtR2)
                            .addComponent(BtI2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtF2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(G1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(G2)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(T4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(P4))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtP4)
                            .addComponent(BtR4)
                            .addComponent(BtI4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(T3))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(P3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtP3)
                            .addComponent(BtR3)
                            .addComponent(BtI3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtF4)
                    .addComponent(BtF3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(G3)
                    .addComponent(G4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(Gt)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtI1ActionPerformed
        c = new Control(T1, P1, 5);
        c.start();
        BtI1.setEnabled(false);
        BtP1.setEnabled(true);
        BtR1.setEnabled(true);
        BtF1.setEnabled(true);
    }//GEN-LAST:event_BtI1ActionPerformed

    private void BtP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtP1ActionPerformed
        c.suspend();
    }//GEN-LAST:event_BtP1ActionPerformed

    private void BtR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtR1ActionPerformed
        c.resume();
    }//GEN-LAST:event_BtR1ActionPerformed

    private void BtF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtF1ActionPerformed
        c.suspend();
        int op = JOptionPane.showConfirmDialog(this, "desea finalizar y cobrar\nla deuda es de " + P1.getText() + "$", "finalizar", 1);
        if (op == 0) {
            float gan=Float.parseFloat(P1.getText()),gan1=Float.parseFloat(G1.getText());
            gan=gan+gan1;
            G1.setText(String.valueOf(gan));
            c.stop();
            T1.setText("00:00:00");
            P1.setText("0.00");
            BtI1.setEnabled(true);
            BtP1.setEnabled(false);
            BtR1.setEnabled(false);
            BtF1.setEnabled(false);
        } else if (op == 1) {
            c.resume();
            JOptionPane.showMessageDialog(this, "Echale campeon ");
        } else if (op == 2 || op == -1) {
            c.resume();
            JOptionPane.showMessageDialog(this, "falsa alarma ");
        }


    }//GEN-LAST:event_BtF1ActionPerformed

    private void BtI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtI2ActionPerformed
        c1 = new Control(T2, P2, 7);
        c1.start();
        BtI2.setEnabled(false);
        BtP2.setEnabled(true);
        BtR2.setEnabled(true);
        BtF2.setEnabled(true);
    }//GEN-LAST:event_BtI2ActionPerformed

    private void BtP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtP2ActionPerformed
        c1.suspend();
    }//GEN-LAST:event_BtP2ActionPerformed

    private void BtR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtR2ActionPerformed
        c1.resume();
    }//GEN-LAST:event_BtR2ActionPerformed

    private void BtF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtF2ActionPerformed
        c1.suspend();
        int op = JOptionPane.showConfirmDialog(this, "desea finalizar y cobrar\nla deuda es de " + P2.getText() + "$", "finalizar", 1);
        if (op == 0) {
            float gan=Float.parseFloat(P2.getText()),gan1=Float.parseFloat(G2.getText());
            gan=gan+gan1;
            G2.setText(String.valueOf(gan));
            c1.stop();
            T2.setText("00:00:00");
            P2.setText("0.00");
            BtI2.setEnabled(true);
            BtP2.setEnabled(false);
            BtR2.setEnabled(false);
            BtF2.setEnabled(false);
        } else if (op == 1) {
            c1.resume();
            JOptionPane.showMessageDialog(this, "Echale campeon ");
        } else if (op == 2 || op == -1) {
            c1.resume();
            JOptionPane.showMessageDialog(this, "falsa alarma ");
        }
    }//GEN-LAST:event_BtF2ActionPerformed

    private void BtI3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtI3ActionPerformed
        c2 = new Control(T3, P3, 9);
        c2.start();
        BtI3.setEnabled(false);
        BtP3.setEnabled(true);
        BtR3.setEnabled(true);
        BtF3.setEnabled(true);
    }//GEN-LAST:event_BtI3ActionPerformed

    private void BtP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtP3ActionPerformed
        c2.suspend();
    }//GEN-LAST:event_BtP3ActionPerformed

    private void BtR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtR3ActionPerformed
        c2.resume();
    }//GEN-LAST:event_BtR3ActionPerformed

    private void BtF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtF3ActionPerformed
        c2.suspend();
        int op = JOptionPane.showConfirmDialog(this, "desea finalizar y cobrar\nla deuda es de " + P3.getText() + "$", "finalizar", 1);
        if (op == 0) {
            float gan=Float.parseFloat(P3.getText()),gan1=Float.parseFloat(G3.getText());
            gan=gan+gan1;
            G3.setText(String.valueOf(gan));
            c2.stop();
            T3.setText("00:00:00");
            P3.setText("0.00");
            BtI3.setEnabled(true);
            BtP3.setEnabled(false);
            BtR3.setEnabled(false);
            BtF3.setEnabled(false);
        } else if (op == 1) {
            c2.resume();
            JOptionPane.showMessageDialog(this, "Echale campeon ");
        } else if (op == 2 || op == -1) {
            c2.resume();
            JOptionPane.showMessageDialog(this, "falsa alarma ");
        }
    }//GEN-LAST:event_BtF3ActionPerformed

    private void BtI4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtI4ActionPerformed
        c3 = new Control(T4, P4, 11);
        c3.start();
        BtI4.setEnabled(false);
        BtP4.setEnabled(true);
        BtR4.setEnabled(true);
        BtF4.setEnabled(true);
    }//GEN-LAST:event_BtI4ActionPerformed

    private void BtP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtP4ActionPerformed
        c3.suspend();
    }//GEN-LAST:event_BtP4ActionPerformed

    private void BtR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtR4ActionPerformed
        c3.resume();
    }//GEN-LAST:event_BtR4ActionPerformed

    private void BtF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtF4ActionPerformed
        c3.suspend();
        int op = JOptionPane.showConfirmDialog(this, "desea finalizar y cobrar\nla deuda es de " + P4.getText() + "$", "finalizar", 1);
        if (op == 0) {
            float gan=Float.parseFloat(P4.getText()),gan1=Float.parseFloat(G4.getText());
            gan=gan+gan1;
            G4.setText(String.valueOf(gan));
            c3.stop();
            T4.setText("00:00:00");
            P4.setText("0.00");
            BtI4.setEnabled(true);
            BtP4.setEnabled(false);
            BtR4.setEnabled(false);
            BtF4.setEnabled(false);
        } else if (op == 1) {
            c3.resume();
            JOptionPane.showMessageDialog(this, "Echale campeon ");
        } else if (op == 2 || op == -1) {
            c3.resume();
            JOptionPane.showMessageDialog(this, "falsa alarma ");
        }
    }//GEN-LAST:event_BtF4ActionPerformed

    private void GtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GtActionPerformed
        float gt,g1=Float.parseFloat(G1.getText()),g2=Float.parseFloat(G2.getText()),g3=Float.parseFloat(G3.getText()),g4=Float.parseFloat(G4.getText());
            gt=g1+g2+g3+g4;
            JOptionPane.showMessageDialog(null, "las ganancias del dia son "+gt +"0 $", "Reporte de ganancias", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_GtActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtF1;
    private javax.swing.JButton BtF2;
    private javax.swing.JButton BtF3;
    private javax.swing.JButton BtF4;
    private javax.swing.JButton BtI1;
    private javax.swing.JButton BtI2;
    private javax.swing.JButton BtI3;
    private javax.swing.JButton BtI4;
    private javax.swing.JButton BtP1;
    private javax.swing.JButton BtP2;
    private javax.swing.JButton BtP3;
    private javax.swing.JButton BtP4;
    private javax.swing.JButton BtR1;
    private javax.swing.JButton BtR2;
    private javax.swing.JButton BtR3;
    private javax.swing.JButton BtR4;
    private javax.swing.JLabel G1;
    private javax.swing.JLabel G2;
    private javax.swing.JLabel G3;
    private javax.swing.JLabel G4;
    private javax.swing.JButton Gt;
    public static javax.swing.JLabel P1;
    public static javax.swing.JLabel P2;
    public static javax.swing.JLabel P3;
    public static javax.swing.JLabel P4;
    public static javax.swing.JLabel T1;
    public static javax.swing.JLabel T2;
    public static javax.swing.JLabel T3;
    public static javax.swing.JLabel T4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
