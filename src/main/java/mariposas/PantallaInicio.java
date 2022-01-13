package mariposas;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class PantallaInicio extends javax.swing.JFrame {

    //Se crea el objeto de la pantalla de login (Usuario/Contraseña)
    PantallaLogin pantallalogin = new PantallaLogin();
    //Crea la imagen del boton login, parte superior derecha.
    ImageIcon login = new ImageIcon("imagenes\\login.jpg");
    //Creamos un arreglo dimanico de mariposas.
    File archivo = new File("informacion.txt");
    ArrayList<Mariposa> mariposas = new ArrayList<>();
    ArrayList<Mariposa> auxMariposas = new ArrayList<>();
    String ruta, boton;
    Imagen imagen;

    //Pasa por prametros un entero para saber cual botón eliminar o agregar.
    public PantallaInicio(int a) {
        //Se inician los componentes
        initComponents();
        //Se carga la imagen
        ruta = "imagenes\\filtrar.jpg";
        imagen = pintar(jTotal.getWidth(), jTotal.getHeight(), ruta);
        //Se añade la imagen al panel
        jTotal.add(imagen);
        //Se repinta el panel, es decir se agrega la imagen
        jTotal.repaint();
        //Lee el archivo
        leerArchivo();

        //Agregamos datos a los comboBox
        comboFamilia();

        listaGenero.addItem("");
        listaGenero.addItem("Femenino");
        listaGenero.addItem("Masculino");

        //Compara para saber que boton agregar 
        //**********1.- Botón de Login (Usuario/Contraseña)
        //**********2.- Botón de regresar al menu (Menu Administración ("PantallaAdministrador"))
        if (a == 3 || a == 2) {
            //Remueve el botón de Login (Botón azul, superior derecha)
            jTotal.remove(jLogin);
            if (a == 3) {
                boton = "Modificar";
            } else {
                boton = "Eliminar";
            }
        } else {
            //Remueve el botón de volver al menú (Superior izquierda)
            jTotal.remove(jVolver);
            boton = "Descargar";
        }
        jTotal.setLayout(null);
        listaFamilia.setBounds(780, 105, 300, 80);
        listaSubfamilia.setBounds(840, 225, 235, 80);
    }

    //Se carga imagen
    private Imagen pintar(int x, int y, String origen) {
        //Saca las medidas del panel
        int ancho = x;
        int alto = y;
        //Se crea el objeto imagen, se pasa por parametros en ancho y alto de tendrá la imagen. Además de la ruta
        Imagen imagen = new Imagen(ancho, alto, origen);
        return imagen;
    }

    private void leerArchivo() {
        String n, f, s_f, g, i;
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectura = new BufferedReader(lector);
            n = lectura.readLine();
            f = lectura.readLine();
            s_f = lectura.readLine();
            g = lectura.readLine();
            i = lectura.readLine();
            while (n != null) {
                Mariposa mariposa = new Mariposa(n, f, s_f, g, i);
                mariposas.add(mariposa);
                n = lectura.readLine();
                f = lectura.readLine();
                s_f = lectura.readLine();
                g = lectura.readLine();
                i = lectura.readLine();
            }
            lectura.close();
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR");
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }

    private void comboFamilia() {
        boolean repetido;
        //Si inicializa la lista desplegable con vacio, con ello se mostrará todas las mariposas en el registro.
        listaFamilia.addItem("");
        //Ciclo para el arreglo dinamico de los objetos mariposa.
        for (Mariposa mar : mariposas) {
            //Agregamos la primera Familia, si nuestro ComboBox tiene más de dos opciones entonces empezara a comparar que no se repitan
            if (listaFamilia.getItemCount() > 1) {
                repetido = true;
                //Ciclo de las opciones del ComboBox
                for (int i = 0; i < listaFamilia.getItemCount(); i++) {
                    //Compara el dato de array de Mariposa y las opciones del ComBox, con ello saber si ya existen una opción igual
                    if (listaFamilia.getItemAt(i).equalsIgnoreCase(mar.familia)) {
                        //Si es igula con 1 solo terminamos el ciclo y actualizamos nuestra variable boolean.
                        repetido = false;
                        break;
                    }
                }
                //Si nuestra variable es cierta, significa que la opciones es nueva y no hay 2 iguales.
                if (repetido) {
                    listaFamilia.addItem(mar.familia);
                }
            } else {
                //Segunda opción de nuestro ComboBox.
                listaFamilia.addItem(mar.familia);

            }
        }

    }

    private void comboSubfamilia() {

        boolean repetido;
        listaSubfamilia.addItem("");
        for (Mariposa mar : mariposas) {
            if (listaSubfamilia.getItemCount() > 1) {
                repetido = true;
                for (int i = 0; i < listaSubfamilia.getItemCount(); i++) {
                    if (listaSubfamilia.getItemAt(i).equalsIgnoreCase(mar.subfamilia)) {
                        repetido = false;
                        break;
                    }
                }
                if (repetido) {
                    listaSubfamilia.addItem(mar.subfamilia);
                }
            } else {
                listaSubfamilia.addItem(mar.subfamilia);
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTotal = new javax.swing.JPanel();
        listaFamilia = new javax.swing.JComboBox<>();
        listaSubfamilia = new javax.swing.JComboBox<>();
        botonAplicar = new javax.swing.JButton();
        listaGenero = new javax.swing.JComboBox<>();
        mostrarInfo = new javax.swing.JComboBox<>();
        jLogin = new javax.swing.JButton();
        jVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mariposas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jTotal.setBackground(new java.awt.Color(242, 242, 242));
        jTotal.setPreferredSize(new java.awt.Dimension(1258, 496));

        listaFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaFamiliaActionPerformed(evt);
            }
        });

        botonAplicar.setText("Aplicar filtro");
        botonAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarActionPerformed(evt);
            }
        });

        listaGenero.setAutoscrolls(true);

        mostrarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarInfoActionPerformed(evt);
            }
        });

        jLogin.setIcon(new ImageIcon(login.getImage().getScaledInstance(41,41,Image.SCALE_SMOOTH))
        );
        jLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });

        jVolver.setText("Volver menu");
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTotalLayout = new javax.swing.GroupLayout(jTotal);
        jTotal.setLayout(jTotalLayout);
        jTotalLayout.setHorizontalGroup(
            jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTotalLayout.createSequentialGroup()
                .addGroup(jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTotalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jTotalLayout.createSequentialGroup()
                                .addComponent(jVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(botonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jTotalLayout.createSequentialGroup()
                                .addComponent(listaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92))
                            .addGroup(jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(listaFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jTotalLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(listaSubfamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(96, 96, 96))
                    .addGroup(jTotalLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(mostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 615, Short.MAX_VALUE)))
                .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jTotalLayout.setVerticalGroup(
            jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTotalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(mostrarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jTotalLayout.createSequentialGroup()
                        .addComponent(listaFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(listaSubfamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(jTotalLayout.createSequentialGroup()
                        .addComponent(jLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(listaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(jTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed
        //Cuando el botón volver al menu (parte superior izquierda) es parte de nuestra pantalla, es decir no se elimino
        //Aquí al dar clic en el botón volver, se crea el objeto de tipo PantallaAdministrador
        PantallaAdministrador menuAdmin = new PantallaAdministrador();
        //Hace la pantalla administrador visible
        menuAdmin.setVisible(true);
        //Cierra ventana actual, PantallaInicio
        dispose();
    }//GEN-LAST:event_jVolverActionPerformed

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        //Al dar clic en el botón de Login la PantallaLogin se hace visible.
        pantallalogin.setVisible(true);
        //Cierra la pantalla actual, en este caso PantallaInicio
        dispose();

    }//GEN-LAST:event_jLoginActionPerformed

    private int botonesSeleccionados() {
        if (listaFamilia.getSelectedItem().equals("") && listaSubfamilia.getSelectedItem().equals("") && listaGenero.getSelectedItem().equals("")) {
            return 0;
        } else//Muestra solo por familia
        if (!listaFamilia.getSelectedItem().equals("") && listaSubfamilia.getSelectedItem().equals("") && listaGenero.getSelectedItem().equals("")) {
            return 1;
        } else//Muestra solo por subfamilia
        if (listaFamilia.getSelectedItem().equals("") && !listaSubfamilia.getSelectedItem().equals("") && listaGenero.getSelectedItem().equals("")) {
            return 2;
        } else//Muestra solo por genero
        if (listaFamilia.getSelectedItem().equals("") && listaSubfamilia.getSelectedItem().equals("") && !listaGenero.getSelectedItem().equals("")) {
            return 3;
        } else//Muestra por familia y subfamilia
        if (!listaFamilia.getSelectedItem().equals("") && !listaSubfamilia.getSelectedItem().equals("") && listaGenero.getSelectedItem().equals("")) {
            return 4;
        } else//Muestra familia y genero
        if (!listaFamilia.getSelectedItem().equals("") && listaSubfamilia.getSelectedItem().equals("") && !listaGenero.getSelectedItem().equals("")) {
            return 5;
        } else//Muestra subfamilia y genero
        if (listaFamilia.getSelectedItem().equals("") && !listaSubfamilia.getSelectedItem().equals("") && !listaGenero.getSelectedItem().equals("")) {
            return 6;
        } else//Muestra por todo
        {
            return 7;
        }

    }

    private void botonAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarActionPerformed
        auxMariposas.clear();
        mostrarInfo.removeAllItems();
        mostrarInfo.addItem("Lista de Mariposas");
        int opcion = botonesSeleccionados();

        switch (opcion) {
            case 0:
                for (Mariposa mariposa : mariposas) {
                    mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                    auxMariposas.add(mariposa);
                }
                break;
            case 1:
                for (Mariposa mariposa : mariposas) {
                    if (listaFamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getFamilia())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
            case 2:
                for (Mariposa mariposa : mariposas) {
                    if (listaSubfamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getSubfamilia())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
            case 3:
                for (Mariposa mariposa : mariposas) {
                    if (listaGenero.getSelectedItem().equals(mariposa.getGenero())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
            case 4:
                for (Mariposa mariposa : mariposas) {
                    if (listaFamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getFamilia()) && listaSubfamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getSubfamilia())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
            case 5:
                for (Mariposa mariposa : mariposas) {
                    if (listaFamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getFamilia()) && listaGenero.getSelectedItem().equals(mariposa.getGenero())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
            case 6:
                for (Mariposa mariposa : mariposas) {
                    if (listaSubfamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getSubfamilia()) && listaGenero.getSelectedItem().equals(mariposa.getGenero())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
            case 7:
                for (Mariposa mariposa : mariposas) {
                    if (listaFamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getFamilia()) && listaSubfamilia.getSelectedItem().toString().equalsIgnoreCase(mariposa.getSubfamilia()) && listaGenero.getSelectedItem().equals(mariposa.getGenero())) {
                        mostrarInfo.addItem(mariposa.getNombre() + "-" + mariposa.getGenero());
                        auxMariposas.add(mariposa);
                    }
                }
                break;
        }
    }//GEN-LAST:event_botonAplicarActionPerformed

    private void listaFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaFamiliaActionPerformed
        //Limpiamos la cadena en caso de contener datos inncesarios
        listaSubfamilia.removeAllItems();
        //Metodo para rellenar la cadena con los datos de toda la información de la base de datos
        comboSubfamilia();
        //Comparamos que la opción no se "", si lo es la pantalla presentará la información de todas las mariposas sin ningun filtro
        if (!listaFamilia.getSelectedItem().equals("")) {
            //Si ya se eligio una opción entonces empieza el ciclo del objeto mariposas, para saber que datos tomar y almacenar en los comboBox de Familias y de SubFamilia.
            for (Mariposa mar : mariposas) {
                //Si la superfamilia de la mariposas actual es diferente a la opción elegida comprobamos que nuestra listaFamilia (Opciones) no contenga familias que no pertenecen.
                if (!listaFamilia.getSelectedItem().equals(mar.familia)) {
                    //For que va hasta el numero de opciones que contiene el ComboBox de Subamilia
                    for (int i = 0; i < listaSubfamilia.getItemCount(); i++) {
                        //Si la listaSubfamilia en su posicion "n" es igual a la Subfamilia de la mariposa actual, entonces será borrada ya que no pertenece a la Familia seleccionada.
                        if (listaSubfamilia.getItemAt(i).equals(mar.subfamilia)) {
                            //Se elimina
                            listaSubfamilia.removeItemAt(i);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_listaFamiliaActionPerformed

    private void mostrarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarInfoActionPerformed
        int nMariposa;
        try {
            nMariposa = mostrarInfo.getSelectedIndex() - 1;
            PantallaMostrar pantallaMostrar = new PantallaMostrar(auxMariposas.get(nMariposa).nombre, auxMariposas.get(nMariposa).familia, auxMariposas.get(nMariposa).subfamilia, auxMariposas.get(nMariposa).genero, auxMariposas.get(nMariposa).imagen, boton);
            pantallaMostrar.setVisible(true);
            dispose();
        } catch (IndexOutOfBoundsException e) {
            //System.out.println("ups...");
        }
    }//GEN-LAST:event_mostrarInfoActionPerformed

    //Main de todo el programa
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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAplicar;
    public javax.swing.JButton jLogin;
    public javax.swing.JPanel jTotal;
    private javax.swing.JButton jVolver;
    private javax.swing.JComboBox<String> listaFamilia;
    private javax.swing.JComboBox<String> listaGenero;
    private javax.swing.JComboBox<String> listaSubfamilia;
    private javax.swing.JComboBox<String> mostrarInfo;
    // End of variables declaration//GEN-END:variables
}