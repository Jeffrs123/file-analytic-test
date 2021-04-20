package com.accenture.menu;

import java.util.Scanner;

import com.accenture.dao.Diretorio;
import com.accenture.dao.Monitoramento;

public class MenuInicial {
	
	private static String PATH_DIRETORIO = "C:\\Users\\Micro\\Desktop\\teste";
	
	public static void iniciarMenu() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("Menu Inicial\n"
					+ "Digite uma das op��es a seguir.\n"
					+ "0 - Encerrar Programa\n"
					+ "1 - Iniciar Monitoramento\n"
					+ "2 - Escolher/Alterar diret�rio");

			int condicao = in.nextInt();
			switch(condicao) {
				case 0:{
					System.out.println("Programa encerrado!");
					System.exit(0);
					break;
				}
				case 1:{
					in.reset();
					Monitoramento.iniciarMonitoramento(PATH_DIRETORIO);
					iniciarMenu();
					break;
				}
				case 2:{
					in.reset();
					PATH_DIRETORIO = Diretorio.trocarDiretorio();
					iniciarMenu();
					break;
				}
				default:{
					in.reset();
					System.err.println("voc� digitou uma op��o inv�lida!");
					break;
				}
			}

		} catch (Exception e) {
			System.err.println("Voc� digitou um valor que n�o � um n�mero!");
		}
	}
}
