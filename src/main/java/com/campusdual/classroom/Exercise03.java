package com.campusdual.classroom;

import java.util.Objects;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    public static String greetings(String name) {
        String bienvenida = "Hola. Bienvenido " + name;
        return bienvenida;

    }

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
    public static String error(String nombre) {
        String error = "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
        return error;
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    public static void checkUser(String user, String pass) {
        String usuarioCorrecto = "Sebas";
        String contraseñaCorrecta = "sebas01";
        if (Objects.equals( user, usuarioCorrecto) && Objects.equals(pass, contraseñaCorrecta)) {
            System.out.println(greetings(user));
        } else {
            System.out.println(error(usuarioCorrecto));
        }
    }


    public static void main(String[] args) {

       checkUser("Sebas", "sebas01");

    }
}





