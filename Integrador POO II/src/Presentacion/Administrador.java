/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import Excepciones.UsuarioException;
import Modelos.Servidor;
import Modelos.Usuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    Servidor unServer;
    public Administrador(Servidor server) {
        this.unServer=(Servidor)server;
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/Logo_Pibe-M.png"));
        setIconImage(icon);
        setLocationRelativeTo(null);
        this.lblErrorContraseña.setVisible(false);
        this.lblbErrorNombre.setVisible(false);
        this.lblErrorCorreo1.setVisible(false);
        this.lblErrorContraseña2.setVisible(false);
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Logo_Pibe-M.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        correoTxt = new javax.swing.JTextField();
        lblnomUser = new javax.swing.JLabel();
        nombreUsertxt = new javax.swing.JTextField();
        txtcontraconfirm = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        contraTxt = new javax.swing.JPasswordField();
        lblbErrorNombre = new javax.swing.JLabel();
        lblErrorContraseña = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblErrorCorreo1 = new javax.swing.JLabel();
        lblErrorContraseña2 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setResizable(false);

        lblnomUser.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblnomUser.setText("Nombre usuario");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("Contraseña");

        lblCorreo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblCorreo.setText("E-mail");

        lblbErrorNombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblbErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblbErrorNombre.setText("Ingrese nombre!");

        lblErrorContraseña.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblErrorContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña.setText("Ingrese contraseña!");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Confirmar contraseña");

        lblErrorCorreo1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblErrorCorreo1.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCorreo1.setText("Ingrese correo!");

        lblErrorContraseña2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblErrorContraseña2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña2.setText("Contraseña no coincide con la anterior!");

        btnRegistrarse.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnRegistrarse.setText("Registrar moderador");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarse)
                    .addComponent(lblErrorContraseña2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblCorreo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblErrorCorreo1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblnomUser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblbErrorNombre))
                        .addComponent(nombreUsertxt)
                        .addComponent(correoTxt)
                        .addComponent(contraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcontraconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblErrorContraseña)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnomUser)
                    .addComponent(lblbErrorNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(lblErrorCorreo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblErrorContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcontraconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(lblErrorContraseña2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        // TODO add your handling code here:
        this.lblErrorContraseña.setVisible(false);
        this.lblbErrorNombre.setVisible(false);
        this.lblErrorCorreo1.setVisible(false);
        this.lblErrorContraseña2.setVisible(false);

        String nombre= this.nombreUsertxt.getText();
        String correo= this.correoTxt.getText();
        String contra= this.contraTxt.getText();
        String contra2=this.txtcontraconfirm.getText();

        if(!"".equals(nombre) && !"".equals(correo) && !"".equals(contra) && !"".equals(contra2)){
            try{
                if(contra.equals(contra2)){
                    this.unServer.crearUsuarioModerador(nombre, correo, contra);
                    Usuario user=this.unServer.buscarUsuario(nombre);
                    JOptionPane.showMessageDialog(this, "Usuario moderador "+ user.getNombre()+ " registrado en SQUestions", "SQUestions", JOptionPane.INFORMATION_MESSAGE);
                    this.txtcontraconfirm.setText("");
                    this.nombreUsertxt.setText("");
                    this.contraTxt.setText("");
                    this.correoTxt.setText("");
                }else {
                    this.lblErrorContraseña2.setVisible(true);
                    this.txtcontraconfirm.setText("");
                    this.contraTxt.setText("");
                }
            }catch (UsuarioException ex){
                JOptionPane.showMessageDialog(this, ex, "SQuestions", JOptionPane.WARNING_MESSAGE);
                this.nombreUsertxt.setText("");
            }
        }else if("".equals(nombre)){
            this.lblbErrorNombre.setVisible(true);
        }else if("".equals(correo)){
            this.lblErrorCorreo1.setVisible(true);
        }else if("".equals(contra)){
            this.lblErrorContraseña.setVisible(true);
        }else if("".equals(contra2)){
            this.lblErrorContraseña2.setVisible(true);
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(Servidor server) {
                new Administrador(server).setVisible(true);
            }

            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JPasswordField contraTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblErrorContraseña;
    private javax.swing.JLabel lblErrorContraseña2;
    private javax.swing.JLabel lblErrorCorreo1;
    private javax.swing.JLabel lblbErrorNombre;
    private javax.swing.JLabel lblnomUser;
    private javax.swing.JTextField nombreUsertxt;
    private javax.swing.JPasswordField txtcontraconfirm;
    // End of variables declaration//GEN-END:variables
}
