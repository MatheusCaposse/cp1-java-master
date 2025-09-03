package Exercicios.ex13;

public class Car {

    private String marca;
    private String modelo;
    private int ano;

    public Car(String marca, String modelo, int ano){
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca +  " | Modelo: " + this.modelo + " | Ano: " + this.ano;
    }

    public static void main(String[] args) {
        var ferrari = new Car("Ferrari", "F80", 2024);

        System.out.println(ferrari);

        var onix = new Car("Chevrolet", "Onix", 2020);

        System.out.println(onix);
    }
}
