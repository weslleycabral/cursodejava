package org.example.entity;import java.util.Scanner;public class Aluno {    private String name, email;    private int quarto;    public Aluno() {        Scanner sc = new Scanner(System.in);        System.out.println("Qual o seu nome? ");        name = sc.nextLine();        System.out.println("Qual o seu email? ");        email = sc.nextLine();        System.out.println("Qual quarto você quer alugar? ");        quarto = sc.nextInt();        sc.nextLine();    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getEmail() {        return email;    }    public void setEmail(String email) {        this.email = email;    }    public int getQuarto() {        return quarto;    }    public void setQuarto(int quarto) {        this.quarto = quarto;    }}