/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.s8swing;

import model.*;
import repository.EntidadRepositorio;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class PantallaPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName());

    private EntidadRepositorio repositorio;

    // Nuevo: combo para tipo de entidad
    private javax.swing.JComboBox<String> cbTipo;

    public PantallaPrincipal() {
        initComponents();
        repositorio = EntidadRepositorio.getInstancia();
        configurarTabla();
        configurarComboTipo();
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcomuna = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcapacidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtproduccion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtantiguedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Comuna");

        jLabel3.setText("Capacidad Proceso");

        jLabel4.setText("Toneladas Producción");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {"Nombre", "Comuna", "Tipo", "Capacidad Proceso",
                        "Toneladas Producción", "Toneladas Proveídas", "Antigüedad"}
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Guardar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel5.setText("Toneladas Proveídas");

        jLabel6.setText("Antigüedad");

        jLabel7.setText("Tipo");

        // Layout generado a mano de forma simplificada:
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txtproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton1)))))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcomuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtantiguedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }

    private void configurarTabla() {
        DefaultTableModel modelo = new DefaultTableModel(
                new Object[][] {},
                new String [] {
                        "Nombre", "Comuna", "Tipo",
                        "Capacidad Proceso", "Toneladas Producción",
                        "Toneladas Proveídas", "Antigüedad"
                }
        ){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        jTable1.setModel(modelo);
    }

    private void configurarComboTipo() {
        cbTipo.removeAllItems();
        cbTipo.addItem("Centro de cultivo");
        cbTipo.addItem("Planta de proceso");
        cbTipo.addItem("Proveedor");
        cbTipo.addItem("Empleado");
    }

    private void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        for (Entidad entidad: repositorio.obtenerEntidades()){
            Object[] fila = new Object[7];
            fila[0] = entidad.getNombre();
            fila[1] = entidad.getComuna();
            fila[2] = entidad.getTipo();

            if (entidad instanceof CentroCultivo){
                CentroCultivo c = (CentroCultivo) entidad;
                fila[4] = c.getToneladasProduccion();
            } else if (entidad instanceof PlantaProceso){
                PlantaProceso p = (PlantaProceso) entidad;
                fila[3] = p.getCapacidadProceso();
            } else if (entidad instanceof Proveedor){
                Proveedor pr = (Proveedor) entidad;
                fila[5] = pr.getCantidadToneladas();
            } else if (entidad instanceof Empleado) {
                Empleado e = (Empleado) entidad;
                fila[6] = e.getAntiguedad();
            }

            modelo.addRow(fila);
        }
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        try{
            String nombre = txtnombre.getText().trim();
            String comuna = txtcomuna.getText().trim();
            String capacidadProceso = txtcapacidad.getText().trim();
            String toneladasProduccion = txtproduccion.getText().trim();
            String cantidadToneladas = txtcantidad.getText().trim();
            String antiguedad = txtantiguedad.getText().trim();
            String tipoSeleccionado = cbTipo.getSelectedItem().toString();

            if(nombre.isEmpty() || comuna.isEmpty()){
                JOptionPane.showMessageDialog(
                        this,
                        "Nombre y comuna son obligatorios",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Entidad entidad;

            switch (tipoSeleccionado) {
                case "Centro de cultivo":
                    entidad = new CentroCultivo(nombre, comuna, toneladasProduccion);
                    break;
                case "Planta de proceso":
                    entidad = new PlantaProceso(nombre, comuna, capacidadProceso);
                    break;
                case "Proveedor":
                    entidad = new Proveedor(nombre, comuna, cantidadToneladas);
                    break;
                case "Empleado":
                    entidad = new Empleado(nombre, comuna, antiguedad);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Tipo no válido", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
            }

            repositorio.agregarEntidad(entidad);
            cargarDatos();

            JOptionPane.showMessageDialog(
                    this,
                    "Entidad agregada",
                    "Éxito",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al agregar la entidad",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new PantallaPrincipal().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtantiguedad;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcapacidad;
    private javax.swing.JTextField txtcomuna;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtproduccion;
    // fin variables
}

