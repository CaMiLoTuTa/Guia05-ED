package CantantesFamosos.Code;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import CantantesFamosos.Visual.VentanaCantantes;

public class ListaCantantesFamosos {

    public static ArrayList<CantanteFamoso> cantantes = new ArrayList<CantanteFamoso>();

    static VentanaCantantes venCan = new VentanaCantantes();

    public static void añadir(String nombreCan, String discoMasFam, String discoVentas) {
        String text = "";

        if (nombreCan.equals("") || discoMasFam.equals("") || discoVentas.equals("")) {
            text = "TODOS LOS CAMPOS DEBEN ESTAR LLENOS.";
        } else {
            CantanteFamoso cantante = new CantanteFamoso();

            cantante.setNombre(nombreCan);
            cantante.setDiscoMasFamoso(discoMasFam);
            cantante.setDiscoVentas(discoVentas);

            cantantes.add(cantante);

            text = "AÑADIDO CORRECTAMENTE.";
            venCan.limpiar();
        }
        JOptionPane.showMessageDialog(null, text);
    }

    public static void modificar(String nombreCan, String discoMasFam, String discoVentas) {

        int bool = 0;
        if (nombreCan.equals("") || discoMasFam.equals("") || discoVentas.equals("")) {
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
                if (nombreCan.equals("") || discoMasFam.equals("") || discoVentas.equals("")) {
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

    public static void eliminar(String nombreCan, String discoMasFam, String discoVentas) {

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

    public static void mostrar(String nombreCan, String discoMasFam, String discoVentas) {
        String text = "";

        for (CantanteFamoso i : cantantes) {
            String nom = i.getNombre();
            String disc = i.getDiscoMasFamoso();
            String vent = i.getDiscoVentas();

            text += nom + ": " + disc + ", " + vent + ".\n";
        }
        if (text.equals("")) {
            text = "NO HAY CANTANTES REGISTRADOS.";
        }
        JOptionPane.showMessageDialog(null, text);
    }

}
