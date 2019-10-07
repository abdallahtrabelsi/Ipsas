package com.example.activity;

public class utilisateur {


    private static String login;
    public static String password;
    public static String nom;
    public static String prenom;
    public static String email;
    public static String papierDemander;
    public static int annee ;

    public static String getLogin() {
        return login;
    }

    public static String getPassword() {
        return password;
    }

    public static String getNom() {
        return nom;
    }

    public static void setLogin(String login) {
        utilisateur.login = login;
    }
    public static void setPassword(String password) {
        utilisateur.password = password;
    }

    public static void setNom(String nom) {
        utilisateur.nom = nom;
    }

    public static void setPrenom(String prenom) {
        utilisateur.prenom = prenom;
    }

    public static void setEmail(String email) {
        utilisateur.email = email;
    }

    public static void setPapierDemander(String papierDemander) {
        utilisateur.papierDemander = papierDemander;
    }

    public static void setAnnee(int annee) {
        utilisateur.annee = annee;
    }

    public static String getPrenom() {
        return prenom;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPapierDemander() {
        return papierDemander;
    }

    public static int getAnnee() {
        return annee;
    }

}
