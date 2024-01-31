	import java.util.Locale;
	import java.util.Scanner;
	
	public class Atletas {
	
		public static void main(String[] args) {
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			String nome;
			String atletaMaisAlto;
			char sexo;
			double altura, peso, pesoMedio, percentHomens; 
			double totalPeso, maiorAltura, somaAlturaMulher, mediaAlturaMulher;
			int totalAtletas, totalMasc, totalMulher;
			
	
		    System.out.print("Qual a quantidade de atletas? ");
		    int n = sc.nextInt();
	
		    totalMasc = 0;
		    totalMulher = 0;
		    totalAtletas = 0;
		    totalPeso= 0.0;
		    maiorAltura = 0.0;
	    	somaAlturaMulher = 0.0;
		    atletaMaisAlto = "";
		    
		    for (int i=0; i<n; i++) {
		    	sc.nextLine();
		    	System.out.println("Digite os dados do atleta numero "+(i+1)+": ");
		    	
		    	System.out.print("Nome: ");
		        nome = sc.nextLine();
		        
		        System.out.print("Sexo: ");     
		        sexo = sc.next().charAt(0);
		        while (sexo != 'M' && sexo != 'F') {
		        	System.out.print("Valor invalido! Favor digitar F ou M: ");
		        	sexo = sc.next().charAt(0);
		        }
		        if (sexo == 'M') {
		        	totalMasc += 1;
		        	
		        }
		        sc.nextLine();
		        
		        System.out.print("Altura: ");
		        altura = sc.nextDouble();
		        while (altura <= 0) {
		        	System.out.print("Valor invalido! Favor digitar um valor positivo: ");
		        	altura = sc.nextDouble();
		        }	        
		        if (altura > maiorAltura) {
		        	maiorAltura = altura;
		        	atletaMaisAlto = nome;
		        }
		        if (sexo == 'F') {
		        	totalMulher += 1;
		        	somaAlturaMulher += altura;
		        	
		        }
		        sc.nextLine();
		        
		        
		        System.out.print("Peso: ");
		        peso = sc.nextDouble();
		        while (peso <= 0) {
		        	System.out.print("Valor invalido! Favor digitar um valor positivo: ");
		        	peso = sc.nextDouble();
		        }
		        totalPeso += peso;
	
		    }
		    
		    totalAtletas = n;
		    pesoMedio = totalPeso / (double)totalAtletas;
		    percentHomens = ((double)totalMasc / (double)totalAtletas) * 100.0;
		    mediaAlturaMulher = ((double)somaAlturaMulher / (double)totalMulher);
	
	
		    System.out.println("\nRELATORIO:");
		    System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
		    System.out.printf("Atleta mais alto: %s%n", atletaMaisAlto);
		    System.out.printf("Porcentagem de homens: %.1f %%%n", percentHomens);
		    if (totalMulher == 0) {
		    	System.out.printf("Não há mulheres cadastradas");
		    }else System.out.printf("Altura média das mulheres: %.2f%n", mediaAlturaMulher);
	
			sc.close();
		}
	}