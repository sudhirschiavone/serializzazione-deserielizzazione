package it.edu.itismeucci;

import java.util.ArrayList;

public class Classe {
    private double numero;
    private String sezione;
    private String aula;
    ArrayList<Alunno> alunni=new ArrayList<Alunno>();

    public Classe() {
    }
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }
    public String getSezione() {
        return sezione;
    }
    public void setSezione(String sezione) {
        this.sezione = sezione;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    public ArrayList<Alunno> getAlunni() {
        return alunni;
    }
    public void setAlunni(ArrayList<Alunno> alunni) {
        this.alunni = alunni;
    }
    public void aggiungi(Alunno a){
        alunni.add(a);
    }
    @Override
    public String toString() {
        return "Classe [numero=" + numero + ", sezione=" + sezione + ", aula=" + aula + ", alunni=" + alunni + "]";
    }

    
}
