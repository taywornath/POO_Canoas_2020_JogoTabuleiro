package br.edu.uniritter.canoas.poo.jogo;

import br.edu.uniritter.canoas.poo.jogo.model.Jogador;
import br.edu.uniritter.canoas.poo.jogo.model.MuitosJogadoresException;
import br.edu.uniritter.canoas.poo.jogo.model.Tabuleiro;
import br.edu.uniritter.canoas.poo.jogo.view.JogoView;
import br.edu.uniritter.canoas.poo.jogo.view.TabuleiroView;

public class JogoController {
    private static int qtdJogadores;
    private static Tabuleiro tabuleiro;
    private static int jogadorAtual = 0;
    private static boolean finalizado = false;

    public static void iniciarJogo() {
    	Dado dado = new Dado();
        tabuleiro = new Tabuleiro(50,20,20);
        qtdJogadores = JogoView.intQtdJogadores(2, 6);
        registrarJogadores();

       while(! finalizado) {
           iniciarJogada();
           proximoJogador();
           TabuleiroView.showSituacaoAtual(tabuleiro);
               
	       try {
	           tab.addJogador(jog1);
	           tab.addJogador(jog2);
	
	       } catch (MuitosJogadoresException e) {
	           e.printStackTrace();
	       }
	       jog1.avanca(dado.jogar());
	       jog2.avanca(dado.jogar());
	
	       TabuleiroView.showSituacaoAtual(tab);
	
	       for(int i = 0; i < 50; i ++) {
	           System.out.println(tab.getCasa(i));
	       }
	
	       int pos = -1;
	       Jogador jog1 = new Jogador("Jogador numero 1");
	       Jogador jog2 = new Jogador("Jogador numero 2"); 
	       Jogador jog3 = new Jogador("Jogador numero 3");
	       Jogador jog4 = new Jogador("Jogador numero 4");
	       Jogador jog5 = new Jogador("Jogador numero 5");
	       Jogador jog6 = new Jogador("Jogador numero 6");

	       
	       for(int i = 0; i < 10; i++) {
	           jog1.avanca(dado.jogar());
	           TabuleiroView.showSituacaoAtual(tab);
	           jog2.avanca(dado.jogar());
	           TabuleiroView.showSituacaoAtual(tab);
	       }
	       
	       for (int i = 0; i < 10; i++) {
	           pos += dado.jogar();
	           if (tab.getCasa(pos) instanceof CasaAzar) {
	               System.out.println("deu ruim !");
	           }
	           if (tab.getCasa(pos) instanceof CasaSorte) {
	               System.out.println("deu bom !");
	           }
	           System.out.println(tab.getCasa(pos).getIncremento()+ " posicoes");
	           pos += tab.getCasa(pos).getIncremento();
	
	           System.out.println(tab.getCasa(pos));
	       }
	       
	       
       }
       
       
       if Jogador.posicaoAtual = 50{
    	   JogoView.mostraJogadorGanhador(Jogador jog);
       }
       
       TabuleiroView.showSituacaoAtual(tab);
      
       
    }
    
    private static void proximoJogador() {
        jogadorAtual++;
        if(jogadorAtual == qtdJogadores) {
            jogadorAtual = 0;
        }
    }
    
    public static void registrarJogadores() {
        Jogador jog1 = new Jogador("Jogador numero 1");
        Jogador jog2 = new Jogador("Jogador numero 2");
        Jogador jog3 = new Jogador("Jogador numero 3");
        Jogador jog4 = new Jogador("Jogador numero 4");
        Jogador jog5 = new Jogador("Jogador numero 5");
        Jogador jog6 = new Jogador("Jogador numero 6");

        
        for (int i = 1; i <= qtdJogadores; i++) {
            String n = JogoView.InformeJogador(i);
            
            try {
                tabuleiro.addJogador(new Jogador(n));
            } catch (MuitosJogadoresException e) {
                e.printStackTrace();
            }
        }
    }
    
    private static void iniciarJogada() {
        JogoView.mostraJogadorAtual(tabuleiro.getJogadores().get(jogadorAtual));
    }
    
    
    
    
    public static void iniciarJogoOld() {
        Tabuleiro tab = new Tabuleiro(50,20,20);
        try {
            tab.addJogador(new Jogador("Jean1"));
            tab.addJogador(new Jogador("Jean2"));
            Jogador a = null;
            try {
                a.getNome();
            } catch (NullPointerException e) {
                System.out.println("ops, tu tentou usar um null como jogador");
            }
            tab.addJogador(new Jogador("Jean3"));
            tab.addJogador(new Jogador("Jean4"));
            tab.addJogador(new Jogador("Jean5"));
            tab.addJogador(new Jogador("Jean6"));
            tab.addJogador(new Jogador("Jean7"));
        } catch (MuitosJogadoresException e) {
            System.out.println(e.getMessage());
        }
         catch (NullPointerException e) {
            System.out.println("ops, tu tentou usar um null como jogador");
        }
        finally {
            System.out.println("depois de tudo");
        }
        for(int i = 0; i < tab.getJogadores().size(); i++) {
            System.out.println(tab.getJogadores().get(i));
        }
    }
}
