package br.com.alura.screenmatch.utils;

import tools.jackson.databind.ObjectMapper;

public class ConverterData implements InterfaceConveterData{
	
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	public <T> T obterDados(String json, Class<T> classeGenerica) {
		return mapper.readValue(json, classeGenerica);
	}
}
