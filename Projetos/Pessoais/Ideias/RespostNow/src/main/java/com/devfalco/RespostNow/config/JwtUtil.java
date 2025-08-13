package com.devfalco.RespostNow.config;

import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String keyJwt;
    @Value("${jwt.expiration}")
    private Long expirationJwt;

    private Key getSigningKey(){
        return Keys.hmacShaKeyFor(keyJwt.getBytes());
    }

    //Gera Token
    public String generateToken(String username){
        Date now = new Date();
        Date expirationDate = new Date(now.getTime() + expirationJwt);

        return Jwts.builder().setSubject(username).setIssuedAt(now).setExpiration(expirationDate).signWith(getSigningKey(), SignatureAlgorithm.HS256).compact();
    }

    public String extractUsername(String token){
        return Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody().getSubject();
    }

    public boolean validateToken(String token){
        try {
            Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            System.out.println("Token invalido"+ e.getMessage());
        }
        return false;
    }
}
