package mariposas;

public class PantallaAdministrador extends javax.swing.JFrame {

    public PantallaAdministrador() {
        initComponents();
        imagen();
    }
    
    private void imagen() {
        //Saca las medidas del panel
        int ancho = fondoadmin.getWidth();
        int alto = fondoadmin.getHeight();
        String ruta = "imagenes\\menuAdmin.jpg";
        Imagen imagen = new Imagen(ancho,alto, ruta);

        //Se añade la imagen al panel
        fondoadmin.add(imagen);
        //Se repinta el panel, es decir se agrega la imagen
        fondoadmin.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoadmin = new javax.swing.JPanel();
        jAgregar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jAgregar.setText("Agregar ejemplar");
        jAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgregarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar ejemplar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar ejemplar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoadminLayout = new javax.swing.GroupLayout(fondoadmin);
        fondoadmin.setLayout(fondoadminLayout);
        fondoadminLayout.setHorizontalGroup(
            fondoadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoadminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSalir)
                .addGap(61, 61, 61))
            .addGroup(fondoadminLayout.createSequentialGroup()
                .addGroup(fondoadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoadminLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoadminLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(fondoadminLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        fondoadminLayout.setVerticalGroup(
            fondoadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoadminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSalir)
                .addGap(11, 11, 11)
                .addComponent(jAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoadmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgregarActionPerformed
        //Cierra Pantalla de administración y abre pantalla de agregar
        PantallaAgregar agregar = new PantallaAgregar();
        //Se hace visible la PantallaAgregar
        agregar.setVisible(true);
        //Cierra la pantalla actual, es decir PantallaAdministrador
        dispose();
    }//GEN-LAST:event_jAgregarActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        //Cierra Pantalla de administración y regresa a la pantalla inicial
        PantallaInicio inicio = new PantallaInicio(1);
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    
    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        //Se crea un objeto de PantallaInicio, se pasa por parametros el número 2
        //Ya que es necesario el botón de volver a menú y ya estamos dentro de la sesión de administración
        //Por lo tanto no es necesario el botón de login
        PantallaInicio inicio = new PantallaInicio(2);
      
        //Se hace visible la PantallaInicio
        inicio.setVisible(true);
        
        //Cierra la pantalla actual, es decir PantallaAdministrador
        dispose();
        
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        //Se crea un objeto de PantallaInicio, se pasa por parametros el número 2
        //Ya que es necesario el botón de volver a menú y ya estamos dentro de la sesión de administración
        //Por lo tanto no es necesario el botón de login
        PantallaInicio inicio = new PantallaInicio(3);
        
        //Se hace visible la PantallaInicio
        inicio.setVisible(true);
        
        //Cierra la pantalla actual, es decir PantallaAdministrador
        dispose();
    }//GEN-LAST:event_jModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondoadmin;
    private javax.swing.JButton jAgregar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jModificar;
    private javax.swing.JButton jSalir;
    // End of variables declaration//GEN-END:variables
}
