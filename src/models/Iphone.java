package models;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorNaInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo p�gina");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando p�gina");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando m�sica");		
	}
	
}
