/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Curso.Visual;

import java.util.Map;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Curso.Code.Estudiante;

/**
 *
 * @author tutaa
 */
public class VentanaListaEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form VentanaListaEstudiantes
     */
    public VentanaListaEstudiantes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    static VentanaListaEstudiantes vle = new VentanaListaEstudiantes();

    public static void mostrar() {
        if (VentanaPrincipal.curso.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY ESTUDIANTES REGISTRADOS.");

        } else {

            vle.setVisible(true);

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Código");
            model.addColumn("Nombre");
            model.addColumn("Dirección");
            model.addColumn("Celular");
            model.addColumn("Programa");

            for (Map.Entry<String, Estudiante> i : VentanaPrincipal.curso.entrySet()) {
                String cod = i.getKey();
                String nom = i.getValue().getNombres() + " " + i.getValue().getApellidos();
                String dir = i.getValue().getDireccion();
                String cel = i.getValue().getCelular();
                String prog = i.getValue().getProgramaAc();

                Object[] fila;

                fila = new Object[]{cod, nom, dir, cel, prog};

                model.insertRow(0, fila);
            }

            tbListado.setModel(model);
            tbListado.setEnabled(false);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbListado = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbListado.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {},
                    {},
                    {},
                    {}
                },
                new String[]{}
        ));
        tbListado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListado);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("LISTADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnSalir)
                                                .addGap(289, 289, 289))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListaEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListaEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tbListado;
    // End of variables declaration//GEN-END:variables
}
