package org.example;

import java.util.function.*;

public class App {

  public static void main(String[] args) {

    // Predicate kijkt of een bepaalde opgegeven conditie correct is [conditie staat na de ->]:
    Predicate<String> stringLength = (s -> s.length() < 8);
    System.out.println(stringLength.test("apples") + " - Apples is less than 8");
    System.out.println(stringLength.test("redundant") + " - Redundant is more then 8");


    // Consumer accepteert een opgegeven waarde en gaat deze teruggeven (hier als UPPERCASE)
    Consumer<String> consumerString = s -> System.out.println(s.toUpperCase());
    consumerString.accept("BierFLesjE");


    // Function interface: Deze heeft 2 klasses tussen < > ; de eerste is de input, de 2e de output
    // in het voorbeeld wordt het aantal chars van het getal teruggegeven
    Function<Integer,String> convert = number -> Integer.toString(number);
    System.out.println("length of number 345 is " + convert.apply(345).length() + " chars");


    // Supplier (opgelet: geen argumenten meegeven!), er wordt enkel een 'bewerking' meegegeven
    Supplier<String> testString = () -> "this test sucks";
    Supplier<Integer> testcalculation = () -> 5 + 7;
    System.out.println(testString.get());
    System.out.println(testcalculation.get());


    // Binary Operator voert een 'bewerking' uit met de 2 inputs die je meegeeft
    BinaryOperator<Integer> vermenigvuldig = (a, b) -> a * b;
    System.out.println(vermenigvuldig.apply(5,25));


    // Unary Operator voer een 'bewerking' uit met de input die je meegeeft
    UnaryOperator<String> unaryString = (message) -> message.replace('o','a');
    System.out.println(unaryString.apply("the core of the world"));




    /*
    Methode referentie:
    ALS LAMBDA EXPRESSIE
      menu.sort((g1,g2) -> Integer.compare(g1.getCalorieën(), g2.getCalorieën()));

    ALS LAMBDA EXPRESSIE MET FUNCTIONELE INTERFACE
      menu.sort(comparing (g -> g.getCalorieën()));

    ALS METHODE REFERENTIE:
      menu.sort(comparing (Gerecht :: getCalorieën))
     */

  }
}