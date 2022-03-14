/*
	javac Ola.java
        java Ola [argumento1] [argumento2]
*/
//Todo programa Java é uma classe
public class Ola{

    //O método main é onde o prorama é executado
    public static void main(String[] args){
	//Imprime Olá mundo
	System.out.println("Ola mundo!!");
        // Imprime Olá e o argumento enviado ao executar o arquivo .class
	System.out.println("Olá " + args[0]);
	// Imprime "você digitou "
        // e os DOIS argumentos enviados ao executar o arquivo .class
	System.out.println("Você digitou " + args[0] + " e " + args[1]);
    }
}
