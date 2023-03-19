/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Curso.Visual;

import Curso.Code.Estudiante;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.*;

/**
 *
 * @author tutaa
 */
public class VentanaEstudiante extends javax.swing.JFrame {
    // ? A. Crear una clase Estudiantes con los siguientes atributos: nombres,
    // ? apellidos, dirección,teléfono, carrera.
    // ? B. Crear una clase GestionEstudiantes donde incluya un HashMap un código
    // ? para el estudiante y la clase Estudiantes.
    // ? Debe existir un menú de gestión donde cree el estudiante y lo asigne al //
    // ? HashMap y utilizar métodos para lo siguiente: 
    // ? • Notas: las operaciones se deben realizar en el HashMap

    HashMap<String, Estudiante> curso = new HashMap<String, Estudiante>();

    public VentanaEstudiante() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    String codEst, nombresEst, apellidosEst, direccionEst, celularEst, programaAcEst;

    // ? • Inserta información.
    private void registrar(int bool) {
        Estudiante estAgregar = new Estudiante();
        codEst = tfCodigo.getText();
        nombresEst = tfNombres.getText();
        apellidosEst = tfApellidos.getText();
        direccionEst = tfDireccion.getText();
        celularEst = tfCelular.getText();
        programaAcEst = cbProgramaAc.getSelectedItem().toString();

        if (tfCodigo.getText().isEmpty() || nombresEst.equals("") || apellidosEst.equals("") || direccionEst.equals("") || celularEst.equals("")) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS");

        } else if (curso.containsKey(codEst) && bool == 0) {
            JOptionPane.showMessageDialog(null, "EL ESTUDIANTE YA SE ENCUENTRA REGISTRADO");

        } else {
            estAgregar.setNombres(nombresEst);
            estAgregar.setApellidos(apellidosEst);
            estAgregar.setDireccion(direccionEst);
            estAgregar.setCelular(celularEst);
            estAgregar.setProgramaAc(programaAcEst);

            curso.put(codEst, estAgregar);
            JOptionPane.showMessageDialog(null, "ESTUDIANTE REGISTRADO CORRECTAMENTE");
            limpiar();
        }
    }

    // ? • Consultar información.
    private void buscar() {
        codEst = tfCodigo.getText();

        if (!(curso.containsKey(codEst)) || tfCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CÓDIGO INCORRECTO");
        } else {
            Estudiante estBuscado = curso.get(codEst);

            nombresEst = estBuscado.getNombres();
            apellidosEst = estBuscado.getApellidos();
            direccionEst = estBuscado.getDireccion();
            celularEst = estBuscado.getCelular();
            programaAcEst = estBuscado.getProgramaAc();

            tfNombres.setText(nombresEst);
            tfApellidos.setText(apellidosEst);
            tfDireccion.setText(direccionEst);
            tfCelular.setText(celularEst);
            cbProgramaAc.setSelectedItem(programaAcEst);
        }
    }

    // ? • Borrar información.
    private void borrar() {
        codEst = tfCodigo.getText();

        if (!(curso.containsKey(codEst)) || tfCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "CÓDIGO INCORRECTO");

        } else {
            curso.remove(codEst);
            limpiar();
            JOptionPane.showMessageDialog(null, "ESTUDIANTE ELIMINADO CORRECTAMENTE");
        }
    }

    private void limpiar() {
        tfCodigo.setText("");
        tfNombres.setText("");
        tfApellidos.setText("");
        tfDireccion.setText("");
        tfCelular.setText("");
    }

    private void mostrar() {
        String text = "";

        Iterator<Map.Entry<String, Estudiante>> cursoIt = curso.entrySet().iterator();
        while (cursoIt.hasNext()) {
            Map.Entry<String, Estudiante> sigEst = cursoIt.next();
            text += sigEst.getKey() + ": " + sigEst.getValue().getNombres() + " " + sigEst.getValue().getApellidos() + ", " + sigEst.getValue().getDireccion() + ", " + sigEst.getValue().getCelular() + ", " + sigEst.getValue().getProgramaAc() + ".\n\n";
        }

        if (text.equals("")) {
            text = "NO HAY NINGÚN ESTUDIANTE REGISTRADO";
        }

        JOptionPane.showMessageDialog(null, text);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNombres = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfCelular = new javax.swing.JTextField();
        cbProgramaAc = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("CURSO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("CÓDIGO:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NOMBRES:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("APELLIDOS:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("DIRECCIÓN:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("PROGRAMA ACADÉMICO:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CELULAR:");

        cbProgramaAc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ingeniería de software", "Ingeniería biomédica", "Ingeniería ambiental", "Ciencias del deporte", "Psicología"}));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setText("Modificar");

        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnListado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnListado.setText("Mostrar Listado");
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRegistrar)
                                .addGap(29, 29, 29)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnModificar)
                                .addGap(27, 27, 27)
                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(71, 71, 71)
                                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(49, 49, 49)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cbProgramaAc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(23, 23, 23))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnListado)
                                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(37, 37, 37))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnLimpiar)
                                                .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(cbProgramaAc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRegistrar)
                                        .addComponent(btnBuscar)
                                        .addComponent(btnModificar)
                                        .addComponent(btnBorrar))
                                .addGap(18, 18, 18)
                                .addComponent(btnListado)
                                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold

    // iterar un hashmap con for en java 
    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {
        mostrar();
    }

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {
        registrar(0);
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        buscar();
    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {
        limpiar();
    }

    // ? • Modificar información.
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
        registrar(1);
    }

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {
        borrar();
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
            java.util.logging.Logger.getLogger(VentanaEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEstudiante.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbProgramaAc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration
}
