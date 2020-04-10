package br.com.vetorsistemas.integradorbw;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class Servicebw {

	
	public static void enviaDados(List<?> dados, String caminho) throws JsonProcessingException {
        
		String url = "https://integracao.bwcenter.shop/vetorsistemas/" + caminho + "/salvarImportacao";
		String name = "integracao";
		String password = "uFaO5luw";
		String authString = name + ":" + password;
		String authStringEnc = new String(Base64Utils.encode(authString.getBytes()));
		

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBasicAuth(authStringEnc);

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<List<?>> entity = new HttpEntity<>(dados,  headers);
		
	    String answer = restTemplate.postForObject(url, entity, String.class);

		System.out.println(answer);
		System.out.println(entity);

	}
}
