

import java.util.Scanner;

public class Velha{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		String[][] tab = new String[4][4]; 
		//tabuleiro 3 por 3 
		int i =0;

tab[1][1]="7"; 
tab[1][2]="8";
tab[1][3]="9";
tab[2][1]="4";
tab[2][2]="5";
tab[2][3]="6";
tab[3][1]="1";
tab[3][2]="2";
tab[3][3]="3";

System.out.println("Insira o nome do jogador 1: "); 
//Insira o nome do primeiro jogador

String p1 = s.nextLine();
//jogador 1 usa 'X'

System.out.println("Insira o nome do jogador 2: "); 
//Insira o nome do segundo jogador
String p2 = s.nextLine();
//jogador 2 usa 'O'

boolean flag =true;
while(flag) { 
//Esse while é um loop infinito, temos System.exit (0) para parar o codigo 
	i++;
	
	System.out.println("      +---+---+---+");
	System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
	System.out.println("      +---+---+---+");
	System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
	System.out.println("      +---+---+---+");
	System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
	System.out.println("      +---+---+---+");
	
	System.out.print("Jogador 1, " + p1 + ", digite o número do quadro desejado: "); 
	//jogador 1, "nome", entre no primeiro quadrante
	int q = s.nextInt();
	
	
	//verificador p1
	switch(q){
		case 1:
		if ((tab[3][1]=="O") || (tab[3][1]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			//perdeu a vez
			}else{
			tab[3][1]="X";
			break;
		}
		case 2:
		if ((tab[3][2]=="O") || (tab[3][2]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[3][2]="X";
			break;
		}
		case 3:
		if ((tab[3][3]=="O") || (tab[3][3]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[3][3]="X";
			break;
		}
		case 4:
		if ((tab[2][1]=="O") || (tab[2][1]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[2][1]="X";
			break;
		}
		case 5:
		if ((tab[2][2]=="O") || (tab[2][2]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[2][2]="X";
			break;
		}
		case 6:
		if ((tab[2][3]=="O") || (tab[2][3]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[2][3]="X";
			break;
		}
		case 7:
		if ((tab[1][1]=="O") || (tab[1][1]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[1][1]="X"; 
			break;
		}
		case 8:
		if ((tab[1][2]=="O") || (tab[1][2]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[1][2]="X";
			break;
		}
		case 9:
		if ((tab[1][3]=="O") || (tab[1][3]=="X")) {
			System.out.println("Quadro repetido, perdeu a vez :c ");
			break;
			}else{
			tab[1][3]="X";
			break;
		}
		default:
		
		System.out.println("Quadro invalido, preste mais atenção ");
		//Quadro invalido, preste mais atenção
		break;
	}
	//empate p1 //sorteio jogador1
	int cont=0;
	for (int x=0;x<4;x++) {
		for (int w=0;w<4;w++) {
			if (tab[x][w] == "X" || tab[x][w] == "O") {
				cont++;
			}
		}
	}
	if(cont==9){
		System.out.println("Deu velha");
		//Ninguem ganhou

		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	
	//quem ganhou
	if (tab[3][1] == "X" && tab[3][2] == "X" && tab[3][3] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!"); 
		//Jogador 1 venceu

		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[2][1] == "X" && tab[2][2] == "X" && tab[2][3] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[1][1] == "X" && tab[1][2] == "X" && tab[1][3] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[1][1] == "X" && tab[2][1] == "X" && tab [3][1] == "X") { 
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[1][2] == "X" && tab[2][2] == "X" && tab[3][2] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[1][3] == "X" && tab[2][3] == "X" && tab[3][3] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[1][1] == "X" && tab[2][2] == "X" && tab[3][3] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	if (tab[1][3] == "X" && tab[2][2] == "X" && tab[3][1] == "X") {
		System.out.println("Jogador 1," + p1 + " ganhou!");
		System.out.println();
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		System.exit(0);
	}
	
	// Jogador 2
	if (i!=5) {
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
		System.out.println("      +---+---+---+");
		System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
		System.out.println("      +---+---+---+");
		
		System.out.print("Jogador 2," + p2 + ",digite o quadrante desejado: "); 
		//Jogador 2, "nome", entre no primeiro quadrante
		q = s.nextInt();
		
		switch(q){
			case 1:
			if ((tab[3][1]=="O") || (tab[3][1]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c "); 
				//Quadro repetido, perdeu a vez 
				break;
				}else{
				tab[3][1]="O";
				break;
			}
			case 2:
			if ((tab[3][2]=="O") || (tab[3][2]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[3][2]="O";
				break;
			}
			case 3:
			if ((tab[3][3]=="O") || (tab[3][3]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[3][3]="O";
				break;
			}
			case 4:
			if ((tab[2][1]=="O") || (tab[2][1]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[2][1]="O";
				break;
			}
			case 5:
			if ((tab[2][2]=="O") || (tab[2][2]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[2][2]="O";
				break;
			}
			case 6:
			if ((tab[2][3]=="O") || (tab[2][3]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[2][3]="O";
				break;
			}
			case 7:
			if ((tab[1][1]=="O") || (tab[1][1]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[1][1]="O"; 
				break;
			}
			case 8:
			if ((tab[1][2]=="O") || (tab[1][2]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[1][2]="O";
				break;
			}
			case 9:
			if ((tab[1][3]=="O") || (tab[1][3]=="X")) {
				System.out.println("Quadro repetido, perdeu a vez :c ");
				break;
				}else{
				tab[1][3]="O";
				break;
			}
			default:
			
			System.out.println("Quadro invalido, preste mais atenção "); 
			//Quadro invalido, preste mais atenção 

			break;
		}
		//empate p2 
		//sorteio jogador 2
		cont=0;
		for (int x=0;x<4;x++) {
			for (int w=0;w<4;w++) {
				if (tab[x][w] == "X" || tab[x][w] == "O") {
					cont++;
				}
			}
		}
		if(cont==9){
			System.out.println("Deu velha");
			//Ninguem ganhou

			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[3][1] == "o" && tab[3][2] == "o" && tab[3][3] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!"); 
			//Jogador 2 venceu

			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[2][1] == "o" && tab[2][2] == "o" && tab[2][3] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[1][1] == "o" && tab[1][2] == "o" && tab[1][3] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[1][1] == "o" && tab[2][1] == "o" && tab [3][1] == "o") { 
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[1][2] == "o" && tab[2][2] == "o" && tab[3][2] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[1][3] == "o" && tab[2][3] == "o" && tab[3][3] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[1][1] == "o" && tab[2][2] == "o" && tab[3][3] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
			System.exit(0);
		}
		if (tab[1][3] == "o" && tab[2][2] == "o" && tab[3][1] == "o") {
			System.out.println("Jogador 2," + p2 + " ganhou!");
			System.out.println();
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[1][1] + " | " + tab[1][2] + " | " + tab[1][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[2][1] + " | " + tab[2][2] + " | " + tab[2][3] + " |");
			System.out.println("      *---*---*---*");
			System.out.println("      | " + tab[3][1] + " | " + tab[3][2] + " | " + tab[3][3] + " |");
			System.out.println("      *---*---*---*");
					System.exit(0);
				}
			}
		}
	}
}