package com.prueba.croydon.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prueba.croydon.entity.GetNameDto;
import com.prueba.croydon.entity.GetNameIdDto;
import com.prueba.croydon.util.Consts;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

    public GetNameDto getCharacterByName(String name) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = Consts.API_URL + "?name=" + name.replaceAll(" ", "%20");
            HttpGet request = new HttpGet(url);

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                ObjectMapper objectMapper = new ObjectMapper();
                GetNameDto character = objectMapper.readValue(responseBody, GetNameDto.class);
                return character;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public GetNameIdDto getCharacterById(Integer id) {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            String url = Consts.API_URL + "/"+ id;
            HttpGet request = new HttpGet(url);

            try (CloseableHttpResponse response = httpClient.execute(request)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                ObjectMapper objectMapper = new ObjectMapper();
                GetNameIdDto character = objectMapper.readValue(responseBody, GetNameIdDto.class);
                return character;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
