package com.mycompany.poojava;

import javax.swing.JOptionPane;

public class PooJava {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, Bienvenid@ al BANCO J, oprime OK para continuar", "BIENVENIDA", 1);

        int ventana1 = JOptionPane.showConfirmDialog(null, "Primero iniciaremos creando tu cuenta", "Primer paso",
                JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        // 0=yes, 1=no,
        if (ventana1 == 0) {
            System.out.println("continuar");
        } else if (ventana1 == 1) {
            System.out.println("cerrar");
        }

        String Nombre = JOptionPane.showInputDialog(null, "Escriba su nombre completo", "ningun numero");
        System.out.println(Nombre);

        String[] Documento = {
                "Cedula de ciudadania",
                "Cedula de extranjería" };
        String Opcion = (String) JOptionPane.showInputDialog(null, "¿Qué tipo de identificacion tienes?",
                "Identificación", JOptionPane.QUESTION_MESSAGE, null, Documento, Documento[0]);
        System.out.println(Documento[0]);

        String NumeroId = JOptionPane.showInputDialog(null, "Escriba su numero de identificación", "10 digitos");
        System.out.println(NumeroId);

        String NumeroTel = JOptionPane.showInputDialog(null, "Escriba su numero de celular", "10 digitos");
        System.out.println(NumeroTel);

        String Correo = JOptionPane.showInputDialog(null, "Escriba su correo electronico", "@gmail.com");
        System.out.println(Correo);

        if (JOptionPane.showConfirmDialog(null, "¿Autorizas a BANCO J para que use tus datos personales?",
                "Autorización",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.out.println("Acepto el uso de datos");
        } else {
            System.out.println("Niega el uso de datos");
        }

        JOptionPane.showMessageDialog(null, "Nos estaremos comunicando con used", "SALIDA", 1);
    }
}