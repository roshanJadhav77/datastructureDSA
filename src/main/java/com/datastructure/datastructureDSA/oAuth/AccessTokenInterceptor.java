/*
package com.datastructure.datastructureDSA.oAuth;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

*/
/**
 * The type Alrajhi access toekn interceptor.
 *
 * @author Varun K Y
 * @since 2024 -01-31 17:08
 *//*

@Component
@Slf4j
public class AccessTokenInterceptor implements ClientHttpRequestInterceptor {

    public String BEARER_PREFIX = "Bearer ";

    @Autowired
   // AlrajhiAccessTokenGenratorUtil alrajhiAccessTokenGenratorUtil;
    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
// Get the cache for the access token
        String accessToken = null;
        try {
            accessToken = AccessTokenGenratorUtil.generateAccessToken();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (KeyStoreException e) {
            throw new RuntimeException(e);
        } catch (KeyManagementException e) {
            throw new RuntimeException(e);
        }

// Set the authorization header with the access token
        HttpHeaders headers = request.getHeaders();
        headers.set("Authorization", BEARER_PREFIX + accessToken);


        log.info("request ++{}", request.toString());
// Proceed with the request execution
        return execution.execute(request, body);
    }


}
*/
