package visual;

import controladores.ControladorProfesionalesVolver;

public class ProfRegistro extends javax.swing.JFrame {

    public ProfRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("REGISTRO DE PROFESIONALES");
    
    controladorPV = new ControladorProfesionalesVolver();
    botMenuProf.addMouseListener(controladorPV);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        texGenero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        texDocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        texApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        texNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        texRegistro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        botMenuProf = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        texMatricula = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        texEspeci1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        texEspeci2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        texEspeci3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setText("EDITAR PROFESIONAL");
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 330, 34));

        btnEliminar.setText("ELIMINAR PROFESIONAL");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(577, 410, -1, 37));

        btnRegistrar.setText("REGISTRAR PROFESIONAL");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 170, 37));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sexo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, 20));

        texGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(texGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 260, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Documento:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        texDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texDocumentoActionPerformed(evt);
            }
        });
        getContentPane().add(texDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 260, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 50, -1));

        texApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texApellidoActionPerformed(evt);
            }
        });
        getContentPane().add(texApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 260, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre/s:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 20));

        texNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texNombreActionPerformed(evt);
            }
        });
        getContentPane().add(texNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 260, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro N°");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 20));

        texRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(texRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DATOS PERSONALES");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 163, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DIRECCION");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 111, -1));

        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 43, 87));

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tipo:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 260, 87));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TELEFONOS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 43, 87));

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 260, 87));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("EMAILS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 50, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 30, -1));

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 40, 87));

        jList4.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 280, 87));

        botMenuProf.setText("VOLVER");
        botMenuProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botMenuProfActionPerformed(evt);
            }
        });
        getContentPane().add(botMenuProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 330, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Registro Profesional");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 400, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Matricula N° ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 20));

        texMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texMatriculaActionPerformed(evt);
            }
        });
        getContentPane().add(texMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 260, -1));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Especialidad_1: ");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        texEspeci1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texEspeci1ActionPerformed(evt);
            }
        });
        getContentPane().add(texEspeci1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 260, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Especialidad_2: ");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, 90));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Especialidad_3: ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        texEspeci2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texEspeci2ActionPerformed(evt);
            }
        });
        getContentPane().add(texEspeci2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 260, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 100, 90));

        texEspeci3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texEspeci3ActionPerformed(evt);
            }
        });
        getContentPane().add(texEspeci3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 260, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/doctores.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 260, 250));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -20, -1, 580));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/fondo_verde.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void botMenuProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botMenuProfActionPerformed

    }//GEN-LAST:event_botMenuProfActionPerformed

    private void texRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texRegistroActionPerformed
        texRegistro.transferFocus();
    }//GEN-LAST:event_texRegistroActionPerformed

    private void texNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texNombreActionPerformed
        texNombre.transferFocus();
    }//GEN-LAST:event_texNombreActionPerformed

    private void texApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texApellidoActionPerformed
        texApellido.transferFocus();
    }//GEN-LAST:event_texApellidoActionPerformed

    private void texDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texDocumentoActionPerformed
        texDocumento.transferFocus();
    }//GEN-LAST:event_texDocumentoActionPerformed

    private void texGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texGeneroActionPerformed
        texGenero.transferFocus();
    }//GEN-LAST:event_texGeneroActionPerformed

    private void texMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texMatriculaActionPerformed
        texMatricula.transferFocus();
    }//GEN-LAST:event_texMatriculaActionPerformed

    private void texEspeci1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texEspeci1ActionPerformed
        texEspeci1.transferFocus();
    }//GEN-LAST:event_texEspeci1ActionPerformed

    private void texEspeci2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texEspeci2ActionPerformed
        texEspeci2.transferFocus();
    }//GEN-LAST:event_texEspeci2ActionPerformed

    private void texEspeci3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texEspeci3ActionPerformed
        texEspeci3.transferFocus();
    }//GEN-LAST:event_texEspeci3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botMenuProf;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField texApellido;
    private javax.swing.JTextField texDocumento;
    private javax.swing.JTextField texEspeci1;
    private javax.swing.JTextField texEspeci2;
    private javax.swing.JTextField texEspeci3;
    private javax.swing.JTextField texGenero;
    private javax.swing.JTextField texMatricula;
    private javax.swing.JTextField texNombre;
    private javax.swing.JTextField texRegistro;
    // End of variables declaration//GEN-END:variables
private ControladorProfesionalesVolver controladorPV;
}
