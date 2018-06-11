
package Unidad_1.Interfaz;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class prueba extends javax.swing.JFrame {
    //ATRIBUTOS
    
    public double valorR;
    public double valorA;
    public double opcion;
    public double redondear;
    public double resultado;
    public int decimales;
    public double truncar;

    public prueba(double valor1, double valor2, double opcion, double redondear, int decimales) {
        this.valorR = valorR;
        this.valorA = valorA;
        this.opcion = opcion;
        this.redondear = redondear;
        this.decimales = decimales;
    }
    public prueba() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel_VR = new javax.swing.JLabel();
        jLabelVA = new javax.swing.JLabel();
        jTextFieldVR = new javax.swing.JTextField();
        jTextFieldVA = new javax.swing.JTextField();
        jRadioButtonTruncar = new javax.swing.JRadioButton();
        jRadioButtonRedondear = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNuevo_valor_apoximado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDecimales = new javax.swing.JTextField();
        jButtonVA_VR_VP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtER = new javax.swing.JTextField();
        txtEP = new javax.swing.JTextField();
        txt_EA = new javax.swing.JTextField();
        jRadioButtonNO_Hacer_Nada = new javax.swing.JRadioButton();
        jLabel_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_VR.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_VR.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_VR.setText("Valor Real");
        jLabel_VR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel_VR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 30));

        jLabelVA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelVA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVA.setText("Valor Aproximado");
        jLabelVA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabelVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, 30));

        jTextFieldVR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVRActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldVR, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 80, 30));
        getContentPane().add(jTextFieldVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 80, 30));

        buttonGroup1.add(jRadioButtonTruncar);
        jRadioButtonTruncar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonTruncar.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTruncar.setText("Truncar");
        jRadioButtonTruncar.setContentAreaFilled(false);
        jRadioButtonTruncar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTruncarActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonTruncar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        buttonGroup1.add(jRadioButtonRedondear);
        jRadioButtonRedondear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jRadioButtonRedondear.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonRedondear.setText("Redondear");
        jRadioButtonRedondear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jRadioButtonRedondear.setContentAreaFilled(false);
        getContentPane().add(jRadioButtonRedondear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Que Desea Hacer con el VAlor Aproximado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 210, 40));

        jTextFieldNuevo_valor_apoximado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNuevo_valor_apoximadoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNuevo_valor_apoximado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, 30));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Finalizar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 530, 90, 30));

        jButtonCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalcular.setText("Nuevo Valor Aproximado");
        jButtonCalcular.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCalcular.setContentAreaFilled(false);
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 190, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Numero de Decimales");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 150, 30));

        jTextFieldDecimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDecimalesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldDecimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, 30));

        jButtonVA_VR_VP.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVA_VR_VP.setText("calcular");
        jButtonVA_VR_VP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonVA_VR_VP.setContentAreaFilled(false);
        jButtonVA_VR_VP.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jButtonVA_VR_VP.setPreferredSize(new java.awt.Dimension(256, 256));
        jButtonVA_VR_VP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVA_VR_VPActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVA_VR_VP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 130, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Error Relativo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 80, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Error Porcentual");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 90, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Error Absoluto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, 30));
        getContentPane().add(txtER, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 120, 30));
        getContentPane().add(txtEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 110, 30));
        getContentPane().add(txt_EA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 30));

        buttonGroup1.add(jRadioButtonNO_Hacer_Nada);
        jRadioButtonNO_Hacer_Nada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButtonNO_Hacer_Nada.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNO_Hacer_Nada.setText("Nada");
        jRadioButtonNO_Hacer_Nada.setContentAreaFilled(false);
        getContentPane().add(jRadioButtonNO_Hacer_Nada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jLabel_fondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Unidad_1/imagen/fondo.jpg"))); // NOI18N
        jLabel_fondo.setInheritsPopupMenu(false);
        jLabel_fondo.setOpaque(true);
        jLabel_fondo.setPreferredSize(new java.awt.Dimension(240, 420));
        getContentPane().add(jLabel_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNuevo_valor_apoximadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNuevo_valor_apoximadoActionPerformed
        
    }//GEN-LAST:event_jTextFieldNuevo_valor_apoximadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButtonTruncarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTruncarActionPerformed
        
    }//GEN-LAST:event_jRadioButtonTruncarActionPerformed

    private void jTextFieldVRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVRActionPerformed

    }//GEN-LAST:event_jTextFieldVRActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
    valorR=Double.parseDouble(jTextFieldVR.getText());
    valorA=Double.parseDouble(jTextFieldVA.getText());
    
    if(jRadioButtonTruncar.isSelected()){
        NumberFormat numberFormat = NumberFormat.getInstance();
        decimales=Integer.parseInt(jTextFieldDecimales.getText());
        numberFormat.setMaximumFractionDigits(decimales);
        numberFormat.setRoundingMode( RoundingMode.DOWN);
        truncar=Double.parseDouble(numberFormat.format( valorA));
        jTextFieldNuevo_valor_apoximado.setText(""+truncar);
        }else if(jRadioButtonRedondear.isSelected()){
            decimales=Integer.parseInt(jTextFieldDecimales.getText());
            redondear= new BigDecimal(valorA).setScale(decimales, RoundingMode.HALF_EVEN).doubleValue();
            jTextFieldNuevo_valor_apoximado.setText(""+redondear);
        }else if(jRadioButtonNO_Hacer_Nada.isSelected()){
            valorA=valorA;
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonVA_VR_VPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVA_VR_VPActionPerformed

        if(jRadioButtonTruncar.isSelected()){    
            txt_EA.setText(""+(valorR-truncar));
            txtER.setText(""+(valorR-truncar)/valorR);
            txtEP.setText(""+((valorR-truncar)/valorR)*100+"%");
        }else if(jRadioButtonRedondear.isSelected()){
        txt_EA.setText(""+(valorR-redondear));
        txtER.setText(""+(valorR-redondear)/valorR);
        txtEP.setText(""+((valorR-redondear)/valorR)*100+"%");
        }else if(jRadioButtonNO_Hacer_Nada.isSelected()){
        txt_EA.setText(""+(valorR-valorA));
        txtER.setText(""+(valorR-valorA)/valorR);
        txtEP.setText(""+((valorR-valorA)/valorR)*100+"%");
            
        }
        
    }//GEN-LAST:event_jButtonVA_VR_VPActionPerformed

    private void jTextFieldDecimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDecimalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDecimalesActionPerformed
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonVA_VR_VP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelVA;
    private javax.swing.JLabel jLabel_VR;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JRadioButton jRadioButtonNO_Hacer_Nada;
    private javax.swing.JRadioButton jRadioButtonRedondear;
    private javax.swing.JRadioButton jRadioButtonTruncar;
    private javax.swing.JTextField jTextFieldDecimales;
    private javax.swing.JTextField jTextFieldNuevo_valor_apoximado;
    private javax.swing.JTextField jTextFieldVA;
    private javax.swing.JTextField jTextFieldVR;
    private javax.swing.JTextField txtEP;
    private javax.swing.JTextField txtER;
    private javax.swing.JTextField txt_EA;
    // End of variables declaration//GEN-END:variables
}
