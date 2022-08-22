package dadosPessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int homens, mulheres;
		double menorAltura, maiorAltura, alturaMediaF, alturaTotalF; 
		
		System.out.print("Quantas pessoas serão digitadas:");
		int n = sc.nextInt();
		
		double altura[] = new double[n];
		char genero[] = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.print("Altura da " + (i + 1) + "º pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "º pessoa: ");
			genero[i] = sc.next().charAt(0);
			
		}
		
		menorAltura = altura[0];
		maiorAltura = altura[0];
		
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (altura[i] < maiorAltura) {
				menorAltura = altura[i];
			}
		}
		
		homens = 0;
		mulheres = 0;
		alturaTotalF = 0;
		for (int i = 0; i < n; i++) {
			if(genero[i] == 'M') {
				homens++;
			}
			else {
				mulheres++;
				alturaTotalF = alturaTotalF + altura[i];
			}
			
		}
		
		alturaMediaF = alturaTotalF / mulheres;
		
		System.out.println();
		System.out.printf("Menor altura = %.2f\n", menorAltura);
	    System.out.printf("Maior altura = %.2f\n", maiorAltura);
	    System.out.printf("Media das alturas das mulheres = %.2f\n", alturaMediaF);
	    System.out.printf("Número de homens = %d\n", homens);

		sc.close();
		
	}

}
