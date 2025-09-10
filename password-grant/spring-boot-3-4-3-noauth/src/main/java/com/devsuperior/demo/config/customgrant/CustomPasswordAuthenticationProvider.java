package com.devsuperior.demo.config.customgrant;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.core.OAuth2Token;
import org.springframework.security.oauth2.server.authorization.OAuth2AuthorizationService;
import org.springframework.security.oauth2.server.authorization.token.OAuth2TokenGenerator;

public class CustomPasswordAuthenticationProvider implements AuthenticationProvider {

    public CustomPasswordAuthenticationProvider(OAuth2AuthorizationService authorizationService,
            OAuth2TokenGenerator<? extends OAuth2Token> tokenGenerator, UserDetailsService userDetailsService,
            PasswordEncoder passwordEncoder) {
        //TODO Auto-generated constructor stub
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supports(Class<?> authentication) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
