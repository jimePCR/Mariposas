package mariposas;

import javax.swing.JOptionPane;

public class PantallaLogin extends javax.swing.JFrame {

    
    public PantallaLogin() {
        initComponents();
        //fondoLogin.setSize(400, 1040);
        imagen();
        //fondoLogin.layout(null);
        
    }
     private void imagen() {
        //Saca las medidas del panel
        int ancho = fondoLogin.getWidth();
        int alto = fondoLogin.getHeight();
        String ruta = "imagenes\\fondo.jpeg";
        Imagen imagen = new Imagen(ancho,alto, ruta);

        //Se añade la imagen al panel
        fondoLogin.add(imagen);
        //Se repinta el panel, es decir se agrega la imagen
        fondoLogin.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoLogin = new javax.swing.JPanel();
        jPassword = new javax.swing.JPasswordField();
        jAcceso = new javax.swing.JButton();
        jUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesión");
        setLocationByPlatform(true);
        setResizable(false);

        fondoLogin.setBackground(new java.awt.Color(136, 201, 242));

        jPassword.setBackground(new java.awt.Color(231, 49, 48));
        jPassword.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jAcceso.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jAcceso.setText("Acceso");
        jAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAccesoActionPerformed(evt);
            }
        });

        jUsuario.setBackground(new java.awt.Color(231, 49, 48));
        jUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLoginLayout = new javax.swing.GroupLayout(fondoLogin);
        fondoLogin.setLayout(fondoLoginLayout);
        fondoLoginLayout.setHorizontalGroup(
            fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLoginLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLoginLayout.createSequentialGroup()
                .addContainerGap(704, Short.MAX_VALUE)
                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83)
                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLoginLayout.createSequentialGroup()
                        .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLoginLayout.createSequentialGroup()
                        .addComponent(jAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        fondoLoginLayout.setVerticalGroup(
            fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLoginLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addGap(105, 105, 105)
                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(fondoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAcceso, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAccesoActionPerformed
        //Dos variables para comparar que el usuario y contraseña sea correcto
        
        //***********************************+Lo intente con .getText()pero nomas no puede, si lo lográ favor de modificar.
        String contra = "";
        String usuario = jUsuario.getText();
        
        //Ciclo para obtener la contraseña como String, ya que .getPassword nos da la contraseña como tipo char
        for(int i = 0;i<jPassword.getPassword().length;i++){
            contra += jPassword.getPassword()[i];
        }
        
        //Compara que los datos usuario y contraseña sean correctos
        if(usuario.equals("Admin") && contra.equals("gatitosbonitos")){//Si son correctos se crea el objeto PantallaAdministrador
            PantallaAdministrador menuAdmin = new PantallaAdministrador();
        
            //Se hace visible la pantallaAdministrador
            menuAdmin.setVisible(true);
            
            //Se cierra la pantalla actual, PantallaLogin
            dispose();
        }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto\nIntente de nuevo", "Lepidoptedéx", 2);    
        }
       
    }//GEN-LAST:event_jAccesoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PantallaInicio pantallaInicial = new PantallaInicio(1);
        pantallaInicial.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondoLogin;
    private javax.swing.JButton jAcceso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
}
