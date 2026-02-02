package br.com.alura.screenmatch.utils;

public interface InterfaceConveterData {
	
	/* <T> T : Siginifica que o metodo tem retorno de uma classe generica */
	<T> T obterDados(String json,  Class<T> classeGenerica) ;

}
