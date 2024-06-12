package vistas;

import accesoADatos.MembresiaData;
import entidades.Membresia;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Candela
 */
public class ListaMembresia extends javax.swing.JInternalFrame {

    private MembresiaData membresiaData = new MembresiaData();
    private List<Membresia> LTodas;
    private Membresia membresiaDni = null;

    private DefaultTableModel modelo;

    public ListaMembresia() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabecera();
        cargarTodasMembresias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMembresias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setText("MEMBRESIAS");

        jTMembresias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTMembresias);

        jLabel2.setText("DNI Socio:");

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resursos/lupa_1.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jBLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jBLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(30, 30, 30))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2)
                .addGap(80, 80, 80)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(113, 113, 113))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jBBuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        cargarPorDni();

    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        // TODO add your handling code here:
        jTDni.setText("");
        borrarFilaTabla();
        
        cargarTodasMembresias();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    public void cargarPorDni() {
        membresiaDni = membresiaData.buscarMembresia(jTDni.getText());
        if (membresiaDni != null) {
            
            modelo.addRow(new Object[]{membresiaDni.getIdMembresia(), membresiaDni.getSocio().getIdSocio(), membresiaDni.getCantidadPases(),
                membresiaDni.getFechaInicio(), membresiaDni.getFechaFin(), membresiaDni.getCosto(), membresiaDni.isEstado()});
            
        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un dni válido para buscar su membresia");
        }
        
        
    }

    public void cargarTodasMembresias() {
        LTodas = membresiaData.listarMembresias();
        for (Membresia m : LTodas) {
            modelo.addRow(new Object[]{m.getIdMembresia(), m.getSocio().getIdSocio(), m.getCantidadPases(),
                m.getFechaInicio(), m.getFechaFin(), m.getCosto(), m.isEstado()});
        }
       
    }

    public void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Id Membresia");
        filaCabecera.add("Id Socio");
        filaCabecera.add("Cantidad Pases");
        filaCabecera.add("Fecha Inicio");
        filaCabecera.add("Fecha Fin");
        filaCabecera.add("Costo");
        filaCabecera.add("Estado");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTMembresias.setModel(modelo);

    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTable jTMembresias;
    // End of variables declaration//GEN-END:variables
}
