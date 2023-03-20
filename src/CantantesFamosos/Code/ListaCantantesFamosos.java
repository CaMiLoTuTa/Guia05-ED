package CantantesFamosos.Code;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

import CantantesFamosos.Visual.VentanaCantantes;

public class ListaCantantesFamosos {

    public static ArrayList<CantanteFamoso> cantantes = new ArrayList<CantanteFamoso>();

    static VentanaCantantes venCan = new VentanaCantantes();

    public static void añadir(String nombreCan, String discoMasFam, int discoVentas) {

        if (nombreCan.equals("") || discoMasFam.equals("") || discoVentas == 0) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS.");
        } else {

            if (cantantes.isEmpty()) {
                CantanteFamoso cantante = new CantanteFamoso();

                cantante.setNombre(nombreCan);
                cantante.setDiscoMasFamoso(discoMasFam);
                cantante.setDiscoVentas(discoVentas);

                cantantes.add(cantante);

                JOptionPane.showMessageDialog(null, "AÑADIDO CORRECTAMENTE.");
                venCan.limpiar();
            } else {

                for (CantanteFamoso i : cantantes) {
                    String nomBus = i.getNombre();

                    if (nombreCan.equals(nomBus)) {
                        JOptionPane.showMessageDialog(null, "EL CANTANTE YA SE ENCUENTRA REGISTRADO.");
                        break;
                    } else {

                        CantanteFamoso cantante = new CantanteFamoso();

                        cantante.setNombre(nombreCan);
                        cantante.setDiscoMasFamoso(discoMasFam);
                        cantante.setDiscoVentas(discoVentas);

                        cantantes.add(cantante);

                        JOptionPane.showMessageDialog(null, "AÑADIDO CORRECTAMENTE.");
                        venCan.limpiar();
                        break;

                    }
                }

            }
        }
    }

    public static void modificar(String nombreCan, String discoMasFam, int discoVentas) {

        int bool = 0;
        if (nombreCan.equals("") || discoMasFam.equals("") || discoVentas == 0) {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS.");
        } else {
            // Primero se elimina el cantante.
            if (nombreCan.equals("")) {
                JOptionPane.showMessageDialog(null, "EL CAMPO DE NOMBRE ES OBLIGATORIO.");

            } else if (cantantes.isEmpty()) {
                JOptionPane.showMessageDialog(null, "LA LISTA ESTÁ VACÍA.");

            } else if (!cantantes.isEmpty()) {
                for (CantanteFamoso i : cantantes) {
                    String nomEliminar = i.getNombre();

                    if (nombreCan.equals(nomEliminar)) {
                        cantantes.remove(i);
                        venCan.limpiar();
                        bool = 1;
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ EL CANTANTE.");
            }

            // Luego se añade.
            if (bool == 1) {
                if (nombreCan.equals("") || discoMasFam.equals("") || discoVentas == 0) {
                    JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS.");
                } else {
                    CantanteFamoso cantante = new CantanteFamoso();

                    cantante.setNombre(nombreCan);
                    cantante.setDiscoMasFamoso(discoMasFam);
                    cantante.setDiscoVentas(discoVentas);

                    cantantes.add(cantante);

                    JOptionPane.showMessageDialog(null, "ACTUALIZADO CORRECTAMENTE.");
                    venCan.limpiar();
                }
            }
        }
    }

    public static void eliminar(String nombreCan) {

        if (nombreCan.equals("")) {
            JOptionPane.showMessageDialog(null, "EL CAMPO DE NOMBRE ES OBLIGATORIO.");

        } else if (cantantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "LA LISTA ESTÁ VACÍA.");

        } else if (!cantantes.isEmpty()) {
            for (CantanteFamoso i : cantantes) {
                String nomEliminar = i.getNombre();

                if (nombreCan.equals(nomEliminar)) {
                    cantantes.remove(i);
                    JOptionPane.showMessageDialog(null, "EL CANTANTE FUE ELIMINADO CORRECTAMENTE.");
                    venCan.limpiar();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRÓ EL CANTANTE.");
        }
    }

    public static void ordenar() {
        Collections.sort(cantantes);
    }

}
