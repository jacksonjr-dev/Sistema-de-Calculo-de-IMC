import java.util.Scanner;
import java.util.Locale;

public class DesafioIndiceMassaCorporal {
  
  public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  entrada.useLocale(Locale.US);

  System.out.print("Genero (M/F): ");
  String genero = entrada.nextLine().toUpperCase();

  System.out.print("Peso: ");
  double peso = entrada.nextDouble();

  System.out.print("Altura: ");
  double altura = entrada.nextDouble();

  double imc = peso / (altura*altura);


  if (genero.equals("M")) {
    System.out.println("Masculino");

    if (imc < 20.7) {
      System.out.println("Abaixo do peso.");

    }

    else if (imc >= 20.8 && imc <= 26.4) {
      System.out.println("No peso ideal.");

    }

    else if (imc >= 26.5 && imc <= 27.8) {
      System.out.println("Um pouco acima do peso");

    }

    else if (imc >= 27.9 && imc <= 31.1) {
      System.out.println("Acima do peso ideal");
    }

    else if (imc > 31.1) {
      System.out.println("Obeso");

    }


  }else if (genero.equals("F")) {
    System.out.println("Feminino");

    if (imc < 19.1) {
      System.out.println("Abaixo do peso.");

    }

    else if (imc >= 19.1 && imc <= 25.8) {
      System.out.println("No peso ideal.");

    }

    else if (imc >= 25.9 && imc <= 27.3) {
      System.out.println("Um pouco acima do peso");
      
    }

    
    else if (imc >= 27.4 && imc <= 32.3) {
      System.out.println("Acima do peso ideal");
    }

    else if (imc > 32.3) {
      System.out.println("Obeso");

    }
  


  }else {
    System.out.println("Opção inválida.");
  }

  }

  }

