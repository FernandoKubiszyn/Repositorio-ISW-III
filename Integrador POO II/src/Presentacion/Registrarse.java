/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Presentacion;

import Excepciones.UsuarioException;
import Modelos.Servidor;
import Modelos.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Fer
 */
public class Registrarse extends javax.swing.JPanel {

    /**
     * Creates new form Registrarse
     */
    Principal principal;
    Servidor unServidor;
    public Registrarse(Principal unp, Servidor server) {
        this.principal=unp;
        this.unServidor=(Servidor) server;
        initComponents();
        this.lblErrorContraseña.setVisible(false);
        this.lblbErrorNombre.setVisible(false);
        this.lblErrorCorreo1.setVisible(false);
        this.lblErrorContraseña2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreUsertxt = new javax.swing.JTextField();
        lblnomUser = new javax.swing.JLabel();
        correoTxt = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        contraTxt = new javax.swing.JPasswordField();
        txtcontraconfirm = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        lblbErrorNombre = new javax.swing.JLabel();
        lblErrorContraseña = new javax.swing.JLabel();
        lblErrorCorreo1 = new javax.swing.JLabel();
        lblErrorContraseña2 = new javax.swing.JLabel();

        lblnomUser.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblnomUser.setText("Nombre usuario");

        lblCorreo.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblCorreo.setText("E-mail");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("Confirmar contraseña");

        btnRegistrarse.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        lblbErrorNombre.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblbErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblbErrorNombre.setText("Ingrese nombre!");

        lblErrorContraseña.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblErrorContraseña.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña.setText("Ingrese contraseña!");

        lblErrorCorreo1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblErrorCorreo1.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCorreo1.setText("Ingrese correo!");

        lblErrorContraseña2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lblErrorContraseña2.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorContraseña2.setText("Contraseña no coincide con la anterior!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(lblErrorContraseña))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnRegistrarse)))
                .addContainerGap(165, Short.MAX_VALUE))
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
                .addContainerGap(41, Short.MAX_VALUE))
        );
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
                    this.principal.crearUsuarioSimple(nombre, correo, contra);
                    Usuario user=(Usuario)this.unServidor.iniciarSesion(nombre, contra);
                    this.principal.iniciarSesion(user);
                    
                    Preguntas pnlPreguntas= new Preguntas(this.principal,user, this.unServidor);
                    JOptionPane.showMessageDialog(this, "Felcidades "+ user.getNombre()+ " ya es miembro de SQUestions", "SQUestions", JOptionPane.INFORMATION_MESSAGE);
                    this.principal.devolverScroll().setViewportView(pnlPreguntas);
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
