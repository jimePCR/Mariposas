package mariposas;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PantallaAgregar extends javax.swing.JFrame {

    private String ruta = "", nom, fam, sub, gen, img;
    private int a;
    private boolean repetido = false;
    Imagen imagen;
    PantallaInicio inicio = new PantallaInicio(1);

    //Primer constructor solo inicializamos el diseño, esto se usa cuando el admin da clic en el botón Agregar ejemplar
    public PantallaAgregar() {
        initComponents();
        personalizar();
    }

    //Segundo constructor se inicializa el diseño, al igual que los datos que el admin eligio en filtros.
    //Este se usa cuando el admin da clic en el botón Modificar ejemplar
    public PantallaAgregar(int a, String nombre, String familia, String subfamilia, String genero, String mariposaimg) {
        initComponents();
        personalizar();
        //Sirve para saber a que menu volver, si es el menú de Administrador (Cuando se elige Agregar Ejemplar)
        //O volver al menu de los filtros (Cuando se elige Modificar Ejemplar)

        //Si a es igual a 1: Se regresara al menu Administrador
        //Si a es igual a 2: Se regresara al menu de filtros
        //Ver evento de botón guardar (jVolver)
        this.a = a;
        nom = nombre;
        fam = familia;
        sub = subfamilia;
        gen = genero;
        ruta = img = mariposaimg;
        escribirInfo();
    }

    private void personalizar() {
        //Cargamos la imagen de fondo
        imagen = pintar(jPanelAgregar.getWidth(), jPanelAgregar.getHeight(), "imagenes\\agregar.jpg");
        jPanelAgregar.add(imagen);
        jPanelAgregar.repaint();

        jGenero.addItem("");
        jGenero.addItem("Femenino");
        jGenero.addItem("Masculino");
        jVerImg.remove(errorEx);

        this.setLayout(null);
        //this.setSize(300,500);
        this.setLocationRelativeTo(null);
        jPanelAgregar.setLayout(null);
        jPanelAgregar.setSize(this.getSize().width, this.getSize().height);

        nombreLabel.setBounds(94, 75, 20, 20);
        jNombre.setBounds(20, 95, 590, 55);

        familiaLabel.setBounds(99, 178, 20, 20);
        jFamilia.setBounds(20, 200, 590, 55);

        subfamiliaLabel.setBounds(130, 277, 20, 20);
        jSubfamilia.setBounds(20, 304, 590, 55);

        labelGenero.setBounds(1015, 193, 20, 20);

        jVerImg.setLayout(null);
        jVerImg.setBounds(767, 64, 290, 110);
        jCargarImg.setLocation(75, 60);
        errorEx.setLocation(0, 0);

        jGenero.setBounds(983, 206, 240, 70);
        jGuardar.setBounds(975, 394, 245, 55);
        jVolver.setBounds(675, 394, 245, 55);
    }

    private Imagen pintar(int x, int y, String origen) {
        //Saca las medidas del panel
        int ancho = x;
        int alto = y;
        //Se crea el objeto imagen, se pasa por parametros en ancho y alto de tendrá la imagen. Además de la ruta
        Imagen imagen = new Imagen(ancho, alto, origen);
        return imagen;
    }

    private void escribirInfo() {
        jNombre.setText(nom);
        jFamilia.setText(fam);
        jSubfamilia.setText(sub);
        imagen = pintar(jVerImg.getWidth(), jVerImg.getHeight(), img);
        jVerImg.add(imagen);
        jVerImg.remove(errorEx);
        jVerImg.repaint();
        if (gen.equals("Femenino")) {
            jGenero.setSelectedIndex(1);
        } else {
            jGenero.setSelectedIndex(2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAgregar = new javax.swing.JPanel();
        jVolver = new javax.swing.JButton();
        jNombre = new javax.swing.JTextField();
        jFamilia = new javax.swing.JTextField();
        jSubfamilia = new javax.swing.JTextField();
        labelGenero = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        familiaLabel = new javax.swing.JLabel();
        subfamiliaLabel = new javax.swing.JLabel();
        jVerImg = new javax.swing.JPanel();
        jCargarImg = new javax.swing.JButton();
        errorEx = new javax.swing.JLabel();
        jGenero = new javax.swing.JComboBox<>();
        jGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar\n");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1170, 580));
        setResizable(false);

        jPanelAgregar.setBackground(new java.awt.Color(51, 51, 51));
        jPanelAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jVolver.setBackground(new java.awt.Color(242, 242, 242));
        jVolver.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jVolver.setText("Volver al menu");
        jVolver.setPreferredSize(new java.awt.Dimension(150, 30));
        jVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVolverActionPerformed(evt);
            }
        });

        jNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jNombre.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jNombreKeyTyped(evt);
            }
        });

        jFamilia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jFamilia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFamilia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFamiliaKeyTyped(evt);
            }
        });

        jSubfamilia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSubfamilia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jSubfamilia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSubfamiliaKeyTyped(evt);
            }
        });

        labelGenero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labelGenero.setForeground(new java.awt.Color(255, 255, 255));
        labelGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGenero.setText(" ");

        nombreLabel.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(255, 255, 255));
        nombreLabel.setText(" ");

        familiaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        familiaLabel.setForeground(new java.awt.Color(255, 255, 255));
        familiaLabel.setText(" ");

        subfamiliaLabel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        subfamiliaLabel.setForeground(new java.awt.Color(255, 255, 255));
        subfamiliaLabel.setText(" ");
        subfamiliaLabel.setToolTipText("");
        subfamiliaLabel.setAlignmentX(400.0F);
        subfamiliaLabel.setAlignmentY(400.0F);

        jVerImg.setBackground(new java.awt.Color(144, 144, 144));

        jCargarImg.setText("Cargar imagen");
        jCargarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargarImgActionPerformed(evt);
            }
        });

        errorEx.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        errorEx.setText("Archivo incorrecto, solo imagenes.");

        javax.swing.GroupLayout jVerImgLayout = new javax.swing.GroupLayout(jVerImg);
        jVerImg.setLayout(jVerImgLayout);
        jVerImgLayout.setHorizontalGroup(
            jVerImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jVerImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorEx)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jVerImgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCargarImg, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jVerImgLayout.setVerticalGroup(
            jVerImgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jVerImgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errorEx)
                .addGap(99, 99, 99)
                .addComponent(jCargarImg)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        jGenero.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N

        jGuardar.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jGuardar.setText("Guardar");
        jGuardar.setPreferredSize(new java.awt.Dimension(160, 30));
        jGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAgregarLayout = new javax.swing.GroupLayout(jPanelAgregar);
        jPanelAgregar.setLayout(jPanelAgregarLayout);
        jPanelAgregarLayout.setHorizontalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAgregarLayout.createSequentialGroup()
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(familiaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(subfamiliaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jSubfamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVerImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelAgregarLayout.createSequentialGroup()
                        .addComponent(labelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAgregarLayout.setVerticalGroup(
            jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jVerImg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSubfamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subfamiliaLabel))
                .addGap(5, 5, 5)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelAgregarLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familiaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelGenero))
                .addGap(18, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//Confirma que los campos de texto no se encuentren vacios.
    private boolean confirmaInfo() {

        return !(jNombre.getText().isEmpty() || jFamilia.getText().isEmpty() || jSubfamilia.getText().isEmpty() || ruta.length() == 0 || jGenero.getSelectedIndex() == 0);
    }

    private void escribirArchivo(Mariposa mariposa, Path ruta) {

        //El archivo de texto ya fue crea en la carpeta del proyecto, pero el if valida que si existan, también se podría crear el archivo automaticamente.
        //Busca que el archivo de texto existan en la carpeta del proyecto
        File archivo = new File("informacion.txt");
        if (archivo.exists()) {
            try {
                //Nos ayuda a escribir en el achivo que deseamos 
                FileWriter escritura = new FileWriter(archivo, true);
                //Escribe los datos
                escritura.write(mariposa.nombre + "\n");
                escritura.write(mariposa.familia + "\n");
                escritura.write(mariposa.subfamilia + "\n");
                escritura.write(mariposa.genero + "\n");
                escritura.write(ruta + "\n");
                //Cierra el archivo :b
                escritura.close();
                //JOptionPane.showMessageDialog(null, "Guardado Correctamente", "Lepidoptedéx", -1);    
            } catch (IOException ex) {
                Logger.getLogger(PantallaAgregar.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error al guardar ejemplar", "Lepidoptedéx", 2);
            }
        } else {
            //System.out.println("Error al guardar ejemplar");
            JOptionPane.showMessageDialog(null, "Error al guardar ejemplar", "Lepidoptedéx", 2);

        }

    }

    private void limpiarPantalla() {
        //Reestablece los campos a su forma original-
        ruta = "";
        jNombre.setText("");
        jFamilia.setText("");
        jSubfamilia.setText("");
        jGenero.setSelectedIndex(0);
        jVerImg.removeAll();
        jVerImg.add(jCargarImg);
        jVerImg.repaint();
        nombreLabel.setText("");
        familiaLabel.setText("");
        subfamiliaLabel.setText("");
        labelGenero.setText("");
        jCargarImg.setText("Cargar imagen");
    }

    private void mensajeError() {
        //Confirma cual de todos los campos de texto esta vacio, si esta vacio agrega un asterisco al final de cada componente.

        if (jNombre.getText().isEmpty()) {
            nombreLabel.setText("*");
        }
        if (jFamilia.getText().isEmpty()) {
            familiaLabel.setText("*");
        }
        if (jSubfamilia.getText().isEmpty()) {
            subfamiliaLabel.setText("*");
        }
        if (jGenero.getSelectedItem().equals("")) {
            labelGenero.setText("*");
        }
        if (ruta.isEmpty()) {
            jCargarImg.setText("Cargar imagen *");
        }
    }

    private boolean repetido() {
        for (Mariposa mar : inicio.mariposas) {
            if (jNombre.getText().equalsIgnoreCase(mar.nombre) && jFamilia.getText().equalsIgnoreCase(mar.familia) && jSubfamilia.getText().equalsIgnoreCase(mar.subfamilia) && jGenero.getSelectedItem().equals(mar.genero)) {
                repetido = true;
                break;
            }
        }
        return repetido;
    }
    private void jVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVolverActionPerformed

        if (a == 2) {
            //Cierra pantalla de modificar ejemplar y regresa al menu de filtros
            PantallaInicio menuInicio = new PantallaInicio(3);
            menuInicio.setVisible(true);
            dispose();
        } else {
            //Cierra pantalla de agregar ejemplar y regresa al menu de administración
            PantallaAdministrador menuAdmin = new PantallaAdministrador();
            menuAdmin.setVisible(true);
            //Cierra ventana actual
            dispose();
        }

    }//GEN-LAST:event_jVolverActionPerformed
    //Estos evento evitan que el admin escriba caracteres incorrectos, como lo son números o " $ % & / > < "
    private void jNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNombreKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jNombreKeyTyped

    private void jFamiliaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFamiliaKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jFamiliaKeyTyped

    private void jSubfamiliaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSubfamiliaKeyTyped
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jSubfamiliaKeyTyped

    //El usuario proporciona la imagen, se abre la pestaña adecuado para cargar la imagen desde su computadora.
    private void jCargarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargarImgActionPerformed
        //Funcion para elegir la imagen por medio del usuario
        String confirmarRuta = "";
        JFileChooser escoger = new JFileChooser();
        escoger.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        //Muestra las extensiones permitidas a subir.
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("PNG, JPG & JPEG ", "png", "jpg", "jpeg");

        //Agrega los filtros
        escoger.setFileFilter(filtro);
        //Saber si el usuario dio "ACEPTAR" o "CANCELAR"
        int seleccion = escoger.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            //Si es aceptar, crea el archivo para que la imagen se pinte en el panel.
            File archivo = escoger.getSelectedFile();

            ruta = archivo.getAbsolutePath();
            confirmarRuta = ruta.substring(ruta.lastIndexOf(".") + 1);
            if (confirmarRuta.equals("png") || confirmarRuta.equals("jpg") || confirmarRuta.equals("jpeg")) {
                jVerImg.remove(imagen);
                int ancho = jVerImg.getWidth();
                int alto = jVerImg.getHeight();
                Imagen imagen = new Imagen(ancho, alto, ruta);
                jVerImg.add(imagen);
                jVerImg.remove(jCargarImg);
                jVerImg.remove(errorEx);
                jVerImg.repaint();
            } else {
                jVerImg.add(errorEx);
                jVerImg.repaint();
            }
        }
    }//GEN-LAST:event_jCargarImgActionPerformed

    private void jGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGuardarActionPerformed
        if (confirmaInfo()) {
            if (a == 2) {
                //Modifica los datos
                modificarEjemplar();
                //Reegresa a la pantalla de filtros
                jVolverActionPerformed(evt);
            } else {
                agregarEjemplar();
            }
        } else {
            //Se ponen asteriscos si falta algun dato por rellenar.
            mensajeError();
        }
    }//GEN-LAST:event_jGuardarActionPerformed
    private void modificarEjemplar() {
        try {
            PantallaMostrar mostrar = new PantallaMostrar();
            //Elimina la mariposa modificada
            mostrar.eliminarMariposa(nom, fam, sub, gen);
            String imagen = jNombre.getText().trim() + jFamilia.getText().trim() + jSubfamilia.getText().trim() + jGenero.getSelectedItem().toString() + ".jpg";
            Mariposa mariposa = new Mariposa(jNombre.getText().trim(), jFamilia.getText().trim(), jSubfamilia.getText().trim(), jGenero.getSelectedItem().toString(), imagen.toLowerCase());
            mostrar.inicio.mariposas.add(mariposa);
            Path origen = FileSystems.getDefault().getPath(ruta);
            Path destino = FileSystems.getDefault().getPath(imagen.toLowerCase());
            Files.copy(origen, destino, REPLACE_EXISTING);
            //Elimina la imagen, si es que cambiaron alguno de sus datos.
            if (!jNombre.getText().equals(nom) || !jFamilia.getText().equals(fam) || !jSubfamilia.getText().equals(sub) || !jGenero.getSelectedItem().equals(gen)) {
                File imagenAnterior = new File(img);
                imagenAnterior.delete();
            }

            //Se escriben los nuevos datos en el archivo
            mostrar.escribirArchivo();
            JOptionPane.showMessageDialog(null, "Actualizacion finalizada", "Lepidoptedéx", -1);

        } catch (IOException ex) {
            Logger.getLogger(PantallaAgregar.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al modificar ejemplar", "Lepidoptedéx", 2);
        }

    }

    private void agregarEjemplar() {
        try {
            if (!repetido()) {
                PantallaInicio inicio = new PantallaInicio(1);
                String imagen = jNombre.getText().trim() + jFamilia.getText().trim() + jSubfamilia.getText().trim() + jGenero.getSelectedItem().toString() + ".jpg";
                //Crea un objeto de la clase mariposa y le pasa por parametros los datos agregados en los cuadros de texto.
                Mariposa mariposa = new Mariposa(jNombre.getText().trim(), jFamilia.getText().trim(), jSubfamilia.getText().trim(), jGenero.getSelectedItem().toString(), imagen);
                inicio.mariposas.add(mariposa);
                //Copiamos la imagen dada por el usuario a nuestra carpeta de proyecto, con ello logrando que en otras computadoras sea visible la imagen.
                //source es el origen de la imgamen y target será el destino con un nuevo nombre.
                Path source = FileSystems.getDefault().getPath(ruta);
                Path target = FileSystems.getDefault().getPath(imagen.toLowerCase());
                Files.copy(source, target, REPLACE_EXISTING);
                //Llama a la función escribir en archivo con un parametro de tipo objeto InfoMariposa y la ruta de la imagen seleccionada por el usuario
                escribirArchivo(mariposa, target);
                //Limpia los campos de texto e imagen para que se pueda agragar otra mariposa.
                limpiarPantalla();
                JOptionPane.showMessageDialog(null, "Guardado correctamente", "Lepidoptedéx", -1);
            }else{
                JOptionPane.showMessageDialog(null, "Ejemplar repetido, agregar uno nuevo", "Lepidoptedéx", -1);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ejemplar", "Lepidoptedéx", 2);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorEx;
    private javax.swing.JLabel familiaLabel;
    private javax.swing.JButton jCargarImg;
    private javax.swing.JTextField jFamilia;
    private javax.swing.JComboBox<String> jGenero;
    private javax.swing.JButton jGuardar;
    private javax.swing.JTextField jNombre;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JTextField jSubfamilia;
    private javax.swing.JPanel jVerImg;
    private javax.swing.JButton jVolver;
    private javax.swing.JLabel labelGenero;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel subfamiliaLabel;
    // End of variables declaration//GEN-END:variables
}
