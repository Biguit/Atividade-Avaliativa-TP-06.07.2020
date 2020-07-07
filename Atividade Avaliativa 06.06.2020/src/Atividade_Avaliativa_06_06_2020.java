
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucca
 */
public class Atividade_Avaliativa_06_06_2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter= new Scanner (System.in);
        System.out.println("Digite um número pra escolher o programa: ");
        double NP = enter.nextDouble();
        
        if(NP == 1)
        {
            Metodo.geb();
        }
        else
            
        if(NP == 2)
            Metodo.extenso();
        else
            
        if(NP == 3)
            Metodo.multiplos();
        else
            
        if(NP == 4)
            Metodo.ordem();
        else
            
        if(NP == 5)
            Metodo.horas();
        else
            
        if(NP == 6)
            Metodo.entrada();
        else
            
        if(NP == 7)
            Metodo.sequencia();
        else
            
        if(NP == 8)
            Metodo.cardapio();
        else
            
        if(NP == 0)
            System.exit(0);
        else
            System.out.println("Número Inválido");
        
        

        // TODO code application logic here
    }

    private static class Metodo {

        private static void geb() {
            Scanner enter= new Scanner (System.in);
            int sx, id, h;
            float kg;
            
            System.out.println("Informe o sexo (Digite 1 para masculino e 2 para feminino): ");
            sx = enter.nextInt();
            System.out.println("Informe o seu peso em Quilogramas: ");
            kg = enter.nextFloat();
            System.out.println("Informe a sua altura em Centímetros: ");
            h = enter.nextInt();
            System.out.println("Informe sua idade em Anos: ");
            id = enter.nextInt();
            
            if(sx == 1)
            {
                float geb = (float) (66.47 + 13.75 * kg + 5 * h - 6.76 * 1);
                System.out.println("Seu GEB É: "+ geb);
            }
            else 
            if (sx == 2)
            {
               float geb = (float) (655.1 + (9.56 * kg) + (1.85 * h) - (1 * 4.67));
               System.out.println("Seu GEB é: "+ geb);
            }
            
        

       
}

        private static void extenso() {
            int n=0,r1,r2,d1,d2;
		String centena="",dezena="",unidade="";
		System.out.println("Tecle -1 para sair:");
		System.out.print("Digite um numero entre 0 e 1000: ");
		
		Scanner extenso = new Scanner(System.in);    
		n = extenso.nextInt();
		
                while(n<=1000 && n!=-1){
                    r1 = n%100;
                    d1 = n/100;
                    r2 = r1%10;
                    d2 = r1/10;
 
		switch(d1){
                    case 1 : centena = "cento"; break;
                    case 2 : centena = "duzentos"; break;
                    case 3 : centena = "trezentos"; break;
                    case 4 : centena = "quatrocentos"; break;
                    case 5 : centena = "quinhentos"; break;
                    case 6 : centena = "seiscentos"; break;
                    case 7 : centena = "setecentos"; break;
                    case 8 : centena = "oitocentos"; break;
                    case 9 : centena = "novecentos"; break;
		}
 
		if(r1 !=0 && r1>10 && r1<20) {
		
                switch(r1){
                    case 11: dezena = "onze"; break;
                    case 12: dezena = "doze"; break;
                    case 13: dezena = "treze"; break;
                    case 14: dezena = "quatorze"; break;
                    case 15: dezena = "quinze"; break;
                    case 16: dezena = "dezesseis"; break;
                    case 17: dezena = "dezessete"; break;
                    case 18: dezena = "dezoito"; break;
                    case 19: dezena = "dezenove"; break;
		}
				
                }else{
		
                switch(d2){
                    case 1 : dezena = "dez"; break;
                    case 2 : dezena = "vinte"; break;
                    case 3 : dezena = "trinta"; break;
                    case 4 : dezena = "quarenta"; break;
                    case 5 : dezena = "cinquenta"; break;
                    case 6 : dezena = "sessenta"; break;
                    case 7 : dezena = "setenta"; break;
                    case 8 : dezena = "oitenta"; break;
                    case 9 : dezena = "noventa"; break;
		}
		}
 
		if(r1>=20 || n<10 || r1<10){
					
                switch(r2){
                    case 1 : unidade = "um"; break;
                    case 2 : unidade = "dois"; break;
                    case 3 : unidade = "tres"; break;
                    case 4 : unidade = "quatro"; break;
                    case 5 : unidade = "cinco"; break;
                    case 6 : unidade = "seis"; break;
                    case 7 : unidade = "sete"; break;
                    case 8 : unidade = "oito"; break;
                    case 9 : unidade = "nove"; break;
		}
		}
 
		if(n==0)
                    System.out.println("Zero");
                else{
		
                if(n==1000)
                    System.out.println("Mil");
                else{
						
                if(n==100)
                    System.out.println("Cem");
		else{
							
                if(n>100 && r1<10 && r1!=0)
                    System.out.println(centena + " e " + unidade);
		else{
								
                if(n>100 && r1 ==0)
                    System.out.println(centena);
                else {
									
                if(n>100 && r1 !=0 && r2 !=0 && r1>=20)
                    System.out.println(centena + " e " + dezena + " e " + unidade);
		else{
										
                if(n>100 && r1 !=0 && r2 ==0)
                    System.out.println(centena + " e " + dezena);
		else{
											
                if(n>100 && r1 !=0)
                    System.out.println(centena + " e "+ dezena);
		else{
												
                if(n<100 && r1 !=0 && r2 ==0)
                    System.out.println(dezena);
                else{
													
                if(n>20 && r1 !=0 && r2 !=0)
                    System.out.println(dezena + " e " + unidade);
		else{
														
                if(n<10)
                    System.out.println(unidade);
		else
                    System.out.println(dezena);
		}
                }
		}
                }
		}
		}
		}
		}
		}
		}
		
                System.out.println("");
                System.out.print("Digite um numero: ");
		n = extenso.nextInt();
        }

        
        }

        private static void multiplos() {
            int n1, n2;
            
            Scanner multi = new Scanner(System.in);
            System.out.println ("Digite o primeiro número: ");
            n1 = multi.nextInt();
            System.out.println ("Digite o segundo número: ");
            n2 = multi.nextInt();
            
            if(n1 % n2 == 0)
                System.out.print ("São múltiplos ");
            else 
                System.out.println("Não são múltiplos");
        }

        private static void ordem() {
            int a, b, c, i;
  
        Scanner ordem = new Scanner(System.in);
        System.out.println ("Escolha a ordem (1 para crescente e 2 para decrescente: ");
        i = ordem.nextInt();
        System.out.println("Digite o primeiro número real: ");
        a = ordem.nextInt();
        System.out.println("Digite o segundo número real: ");
        b = ordem.nextInt();
        System.out.println("Digite o terceiro número real: ");
        c = ordem.nextInt();
                
        if (i == 1){
        if (a > b && a > c && b > c){
        System.out.printf("%d\n%d\n%d",c,b,a);
        }

        else if (a > b && a > c && c > b){
        System.out.printf("%d\n%d\n%d",b,c,a);
        }

        else if ( b > a && b > c && a > c){
        System.out.printf("%d\n%d\n%d",c,a,b);
        }

        else if ( b > a && b > c && c > a){
        System.out.printf("%d\n%d\n%d",a,c,b);
        }

        else if ( c > a && c > b && b > a){
        System.out.printf("%d\n%d\n%d",a,b,c);
        }

        else if ( c > a && c > b && a > b){
        System.out.printf("%d\n%d\n%d",b,a,c);
        }
        }

        if ( i == 2){

        if (a < b && a < c && b < c){
        System.out.printf("%d\n%d\n%d",c,b,a);
        }

        else if (a < b && a < c && c < b){
        System.out.printf("%d\n%d\n%d",b,c,a);
        }

        else if ( b < a && b < c && a < c){
        System.out.printf("%d\n%d\n%d",c,a,b);
        }

        else if ( b < a && b < c && c < a){
        System.out.printf("%d\n%d\n%d",a,c,b);
        }

        else if ( c < a && c < b && b < a){
        System.out.printf("%d\n%d\n%d",a,b,c);
        }

        else{
        if ( c < a && c < b && a < b){
        System.out.printf("%d\n%d\n%d",b,a,c);
        }
        }
        }
        }

        private static void horas() {
            int hxt, hft, p = 0, ht;
        
            Scanner horas = new Scanner(System.in);
            System.out.println ("Digite o numero de horas extras: ");
            hxt = horas.nextInt();
            System.out.printf ("Digite o numero de horas de faltas ");
            hft = horas.nextInt();

            ht = (hxt) - ((2 / 3) * (hft));

            if (ht > 40){
            p = 500;

            }else if (ht >30 && ht <= 40){
            p = 400;

            }else if (ht >20 && ht <= 30){
            p = 300;

            }else if (ht >10 && ht <= 20){
            p = 200;

            }else if (ht <= 10){
            p = 100;
            }

            System.out.printf("O valor da sua gratificacao e de %d reais\n\n", p);

            }

        private static void entrada() {
            int het, hsd;
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a hora de entrada: ");
            het = entrada.nextInt();
            hsd = het + 6;
            System.out.println("A hora de saída é: "+hsd+" horas");
        }



        private static void cardapio() {
            int qtddc = 0, qtddr = 0, qtdds = 0;
            double totalc = 0, totalr = 0, totals = 0;
            int cd;
            Scanner card = new Scanner(System.in);
            System.out.println("Digite o código do pedido (1 para C, 2 para R e 3 para S): ");
            cd = card.nextInt();
            
            switch (cd) 
                {
                    case (1):
                        System.out.print("Digite a quantidade do produto: ");
 
                        qtddc += (qtddc = card.nextInt());
                        totalc = 2.00 * qtddc;
 
                        break;
                    case (2):
                        System.out.println("Digite a quantidade do produto: ");
 
                        qtddr += (qtddr = card.nextInt());
                        totalr = 2.50 * qtddr;
 
                        break;
                    case (3):
                        System.out.println("Digite a quantidade do produto: ");
 
                        qtdds += (qtdds = card.nextInt());
                        totals = 1.50 * qtdds;
 
                        break;
                        default:
                        System.out.println("Codigo incorreto!");
                        break;
                }
 
        double total = totalc + totalr + totals; //Atribuição do total calculado na variável total.
 
        System.out.println("Total: R$ " + total); // Impressão na tela do valor do pedido do cliente.
 
    }

       
            }
                
            
            

        }
        

