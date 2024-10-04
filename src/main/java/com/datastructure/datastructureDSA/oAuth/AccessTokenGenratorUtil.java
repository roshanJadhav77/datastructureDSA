/*
package com.datastructure.datastructureDSA.oAuth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.*;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Map;

@Component
@Slf4j
public class AccessTokenGenratorUtil {
    // Define the cache name and key for the access token
    private static final String CACHE_NAME = "alrajhiaccessToken";



    // Define the ttl for the access token in milliseconds


    // Define the url for the oauth2 token API
    @Value("${partner.alrajhi.oauthtokenUrl}")
    private String TOKEN_URL;

    // Define the client id, client secret, grant type and scope for the oauth2 token API

    @Value("${partner.alrajhi.clientId}")
    private String CLIENT_ID;
    @Value("${partner.alrajhi.clientSecret}")
    private String CLIENT_SECRET;
    @Value("${partner.alrajhi.grantType}")
    private String GRANT_TYPE;
    @Value("${partner.alrajhi.scope}")
    private String SCOPE;

    // Autowire the cache manager and the rest template


    @Autowired
    private RestTemplate restTemplate;

    public void initateRestTemplate() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom().loadTrustMaterial(null, acceptingTrustStrategy).build();
        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
        CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(csf).build();

        requestFactory.setHttpClient(httpClient);
        this.restTemplate.setRequestFactory(requestFactory);
    }

    // Define the request headers and set the content type
    private HttpHeaders getHttpHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(PartnerHeaderNames.CONTENT_TYPE.getValue(), MediaType.APPLICATION_FORM_URLENCODED_VALUE);
        return headers;
    }

    // Define the request body as a multi value map
    private MultiValueMap<String, String> getCredentialsBody() {
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add(PartnerHeaderNames.CLIENT_ID.getValue(), CLIENT_ID);
        body.add(PartnerHeaderNames.CLIENT_SECRET.getValue(), CLIENT_SECRET);
        body.add(PartnerHeaderNames.GRANT_TYPE.getValue(), GRANT_TYPE);
        body.add(PartnerHeaderNames.SCOPE.getValue(), SCOPE);
        return body;
    }

    @Cacheable(CACHE_NAME)
    public String generateAccessToken() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {

        this.initateRestTemplate();

// Create an HttpEntity object to wrap the request body and headers
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(getCredentialsBody(), getHttpHeaders());

// Make a POST request to the token url and get the response as a JSON string
        ResponseEntity<Map> response = restTemplate.exchange(TOKEN_URL, HttpMethod.POST, entity, Map.class);

// Parse the response body and extract the access token
// You can use a library like Jackson or Gson to handle the JSON parsing
// For simplicity, I will assume that the response body is a JSON object with a field named "access_token"
        Map<String, Object> responseBody = response.getBody();
        String accessToken = (String) responseBody.get("access_token");
        log.info("----------------> new token generated ----{}", accessToken);
// Return the access token
        return accessToken;
    }

    */
/**
     * Empty access token cache.
     *//*


    @CacheEvict(value = CACHE_NAME, allEntries = true)
    @Scheduled(fixedRateString = "${partner.alrajhi.accessTokenTTL}")
    public void emptyAccessTokenCache() {
        log.info("emptying alrajhi access token cache");
    }
}*/
