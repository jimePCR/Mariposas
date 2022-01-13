package mariposas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class PantallaMostrar extends javax.swing.JFrame {

    ImageIcon login = new ImageIcon("imagenes\\Info.png");
    String ruta;
    Imagen imagen;
    PantallaInicio inicio = new PantallaInicio(0);
    BufferedImage pkdx = null;
    int width = 1000, heigth = 1000;
    File f = null;

    public PantallaMostrar() {
    }

    public PantallaMostrar(String nombre, String familia, String subfamilia, String genero, String mariposaimg, String boton) {
        initComponents();
        ruta = "imagenes\\Info.png";
        imagen = pintar(panelTotal.getWidth(), panelTotal.getHeight(), ruta);
        panelTotal.add(imagen);
        panelTotal.repaint();
        nombreTexto.setText(nombre);
        familiaTexto.setText(familia);
        subfaTexto.setText(subfamilia);
        generoTexto.setText(genero);
        botonAccion.setText(boton);

        ruta = mariposaimg;
        imagen = pintar(panelImagen.getWidth(), panelImagen.getHeight(), ruta);
        panelImagen.add(imagen);
        panelImagen.repaint();
        try {

            f = new File(ruta);
            pkdx = new BufferedImage(width, heigth, BufferedImage.SCALE_DEFAULT);
            pkdx = ImageIO.read(f);
            Graphics g = pkdx.getGraphics();
            g.drawImage(pkdx, width, heigth, null);
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, 500, 100);
            g.setColor(Color.WHITE);
            //(String, tipo de fuente, tamaño)
            g.setFont(new Font("Tahoma", Font.BOLD, 20));
            g.drawString(nombre, 10, 30);
            g.drawString(familia, 10, 50);
            g.drawString(subfamilia, 10, 70);
            g.drawString(genero, 10, 90);
            //System.out.println("Reading complete...");
        } catch (IOException e) {
            //System.out.println("error = " + e);
            JOptionPane.showMessageDialog(null, "Ah ocurrido algo inesperado", "Lepidoptedéx", 2);
        }
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

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTotal = new javax.swing.JPanel();
        panelImagen = new javax.swing.JPanel();
        nombreTexto = new javax.swing.JLabel();
        familiaTexto = new javax.swing.JLabel();
        subfaTexto = new javax.swing.JLabel();
        generoTexto = new javax.swing.JLabel();
        volver = new javax.swing.JButton();
        botonAccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelTotal.setBackground(new java.awt.Color(195, 20, 25));
        panelTotal.setLayout(null);

        panelImagen.setBackground(new java.awt.Color(194, 229, 152));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 384, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        nombreTexto.setBackground(new java.awt.Color(0, 0, 0));
        nombreTexto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreTexto.setText("Nombre");

        familiaTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        familiaTexto.setText("Familia");

        subfaTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subfaTexto.setText("Subfamilia");

        generoTexto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        generoTexto.setText("Genero");

        volver.setText("Volver al menú");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        botonAccion.setText("Descargar");
        botonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generoTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subfaTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familiaTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreTexto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(botonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTotalLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(nombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(familiaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(subfaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(generoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTotalLayout.createSequentialGroup()
                        .addContainerGap(132, Short.MAX_VALUE)
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)))
                .addGroup(panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        switch (botonAccion.getText()) {
            case "Descargar":
                inicio = new PantallaInicio(1);
                inicio.setVisible(true);
                break;
            case "Eliminar":
                inicio = new PantallaInicio(2);
                inicio.setVisible(true);
                break;
            case "Modificar":
                inicio = new PantallaInicio(3);
                inicio.setVisible(true);
                break;
        }
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void botonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccionActionPerformed
        switch (botonAccion.getText()) {
            case "Descargar":
                descargarDatos();
                break;
            case "Eliminar":
                eliminarMariposa(nombreTexto.getText(), familiaTexto.getText(), subfaTexto.getText(), generoTexto.getText());
                escribirArchivo();
                File imagen = new File(ruta);
                imagen.delete();
                volverActionPerformed(evt);
                break;
            case "Modificar":
                PantallaAgregar cambiar = new PantallaAgregar(2, nombreTexto.getText(), familiaTexto.getText(), subfaTexto.getText(), generoTexto.getText(), ruta);
                cambiar.setVisible(true);
                dispose();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_botonAccionActionPerformed
    private void descargarDatos() {
        JFileChooser guardarComo = new JFileChooser();
        try {
            guardarComo.setApproveButtonText("Guardar");
            guardarComo.showSaveDialog(null);
            try {
                f = new File(guardarComo.getSelectedFile().getPath() + ".jpg");
                ImageIO.write(pkdx, "jpg", f);
                JOptionPane.showMessageDialog(null, "Imagen guardada correctamente", "Lepidoptedéx", -1);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Ah ocurrido algo inesperado", "Lepidoptedéx", 2);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido algo inesperado", "Lepidoptedéx", 2);
        }

    }

    public void eliminarMariposa(String nom, String fam, String sub, String gen) {
        for (Iterator<Mariposa> it = inicio.mariposas.iterator(); it.hasNext();) {
            Mariposa mar = it.next();
            if (nom.equals(mar.nombre) && fam.equals(mar.familia) && sub.equals(mar.subfamilia) && gen.equals(mar.genero)) {
                it.remove();
                //JOptionPane.showMessageDialog(null, "Eliminación exitosa", "Lepidoptedéx", -1);
                break;
            }
        }
    }

    public void escribirArchivo() {
        try {
            inicio.archivo.delete();
            File nuevo = new File("informacion.txt");
            nuevo.createNewFile();
            if (nuevo.exists()) {
                //Nos ayuda a escribir en el achivo que deseamos 
                FileWriter escritura = new FileWriter(nuevo, true);
                //Escribe los datos
                for (Mariposa mar : inicio.mariposas) {
                    escritura.write(mar.nombre + "\n");
                    escritura.write(mar.familia + "\n");
                    escritura.write(mar.subfamilia + "\n");
                    escritura.write(mar.genero + "\n");
                    escritura.write(mar.imagen + "\n");
                }
                //Cierra el archivo :b
                escritura.close();

            } else {
                System.out.println("UPS...");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Ah ocurrido algo inesperado", "Lepidoptedéx", 2);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAccion;
    public javax.swing.JLabel familiaTexto;
    public javax.swing.JLabel generoTexto;
    public javax.swing.JLabel nombreTexto;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JPanel panelTotal;
    public javax.swing.JLabel subfaTexto;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
