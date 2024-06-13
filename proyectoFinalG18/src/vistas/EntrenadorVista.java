
package vistas;

import accesoADatos.EntrenadorData;
import entidades.Entrenador;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EntrenadorVista extends javax.swing.JInternalFrame {

    private EntrenadorData entrenadorData = new EntrenadorData();
    private Entrenador entrenadorActual = null;

   
    public EntrenadorVista() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/resursos/fondo5.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jLDni = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLEspecialidad = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jTNombre = new javax.swing.JTextField();
        jTDni = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jBBuscarNombre = new javax.swing.JButton();
        jBBuscarEspecialidad = new javax.swing.JButton();
        jREstado = new javax.swing.JRadioButton();
        jTEspecialidad = new javax.swing.JTextField();

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resursos/entrenador.png"))); // NOI18N
        jLabel1.setText("Entrenadores");

        jLDni.setForeground(new java.awt.Color(255, 255, 255));
        jLDni.setText("DNI:");

        jLNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLNombre.setText("Nombre:");

        jLApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLApellido.setText("Apellido:");

        jLEspecialidad.setForeground(new java.awt.Color(255, 255, 255));
        jLEspecialidad.setText("Especialidad:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNombreActionPerformed(evt);
            }
        });

        jBBuscarNombre.setText("Buscar por nombre");
        jBBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarNombreActionPerformed(evt);
            }
        });

        jBBuscarEspecialidad.setText("Buscar por especialidad");
        jBBuscarEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarEspecialidadActionPerformed(evt);
            }
        });

        jREstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jREstadoActionPerformed(evt);
            }
        });

        jTEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEspecialidadActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLEspecialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscarNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscarEspecialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jREstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTEspecialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLApellido)
                                .addComponent(jLNombre)
                                .addComponent(jLDni))
                            .addComponent(jBNuevo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(19, 19, 19))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jREstado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLEspecialidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBBuscarEspecialidad))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBEliminar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTEspecialidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jBBuscarNombre)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarNombre))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLDni)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jREstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarEspecialidad)
                    .addComponent(jTEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jREstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jREstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jREstadoActionPerformed

    private void jTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNombreActionPerformed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTNombreActionPerformed

    private void jTEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEspecialidadActionPerformed

    }//GEN-LAST:event_jTEspecialidadActionPerformed

    private void jBBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarNombreActionPerformed
        // TODO add your handling code here:
        try {
           String nombre = jTNombre.getText();
            entrenadorActual = entrenadorData.buscarEntrenadorPorNombre(nombre);
            if (entrenadorActual != null) {
                jTDni.setText(entrenadorActual.getDni()+ "");
                jTApellido.setText(entrenadorActual.getApellido());
                jTEspecialidad.setText(entrenadorActual.getEspecialidad());
                jREstado.setSelected(entrenadorActual.isEstado());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar un Nombre válido");
        }
    }//GEN-LAST:event_jBBuscarNombreActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (entrenadorActual != null) {
            entrenadorData.eliminarEntrenador(entrenadorActual.getIdEntrenador());
            entrenadorActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un socio seleccionado");
        }

    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            Integer dni = Integer.parseInt(jTDni.getText());
            String nombre = jTNombre.getText();
            String apellido = jTApellido.getText();
            String especialidad = (jTEspecialidad.getText());
            boolean estado = jREstado.isSelected();
            
            if (entrenadorActual == null) {
                entrenadorActual = new Entrenador(dni,nombre, apellido, especialidad,estado);
                entrenadorData.guardarEntrenador(entrenadorActual);
                limpiarCampos();
            } else {
                entrenadorActual.setDni(dni);
                entrenadorActual.setNombre(nombre);
                entrenadorActual.setApellido(apellido);
                entrenadorActual.setEspecialidad(especialidad);
                entrenadorActual.setEstado(estado);
                entrenadorData.modificarEntrenador(entrenadorActual);
                limpiarCampos();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Los campos no deben estar vacios");
        }
                                   
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscarEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarEspecialidadActionPerformed
        try {
           String especialidad = jTEspecialidad.getText();
            entrenadorActual = entrenadorData.buscarEntrenadorPorEspecialidad(especialidad);
            if (entrenadorActual != null) {
                jTDni.setText(entrenadorActual.getDni()+ "");
                jTNombre.setText(entrenadorActual.getNombre());
                jTApellido.setText(entrenadorActual.getApellido());
                jREstado.setSelected(entrenadorActual.isEstado());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe Ingresar una Especialidad válida");
        }
    }//GEN-LAST:event_jBBuscarEspecialidadActionPerformed
// TODO add your handling code here:
public void limpiarCampos() {
        
        jTNombre.setText("");
        jTApellido.setText("");
        jTDni.setText("");
        jTEspecialidad.setText("");
        jREstado.setSelected(false);
        entrenadorActual = null;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarEspecialidad;
    private javax.swing.JButton jBBuscarNombre;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLEspecialidad;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTEspecialidad;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
