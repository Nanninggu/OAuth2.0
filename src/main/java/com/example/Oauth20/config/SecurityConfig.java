package com.example.Oauth20.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        SimpleUrlAuthenticationSuccessHandler successHandler = new SimpleUrlAuthenticationSuccessHandler("/main"); // 구글 로그인 후 보여지는 페이지
        successHandler.setAlwaysUseDefaultTargetUrl(true);

        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/users/**").authenticated()
                                .requestMatchers("/main/**").authenticated()
                                .anyRequest().denyAll()
                )
                .oauth2Login(oauth2Login ->
                        oauth2Login.successHandler(successHandler)
                );

        return http.build();
    }
}