package com.study.online_learning_platform.ultils;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JwtTokenUtils {
    private final UserDetails userDetails;
    @Value("${jwtSecret}")
    private String jwtSecret;
    public static final long TOKEN_VALIDITY = 604800000L;
    Date expirationDate = new Date(System.currentTimeMillis() + TOKEN_VALIDITY);

    public JwtTokenUtils(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public String generateJwtToken(String username) {
        // Thư viện JWS
        // JWSHeader header = new JWSHeader(JWSAlgorithm.HS512);
        // JWTClaimsSet jwtClaimsSet = new JWTClaimsSet.Builder()
        // .subject(username)
        // .expirationTime(expirationDate)
        // .issueTime(new Date())
        // .issuer("https://online-learning-platform.com")
        // .build();
        // Payload payload = new Payload(jwtClaimsSet.toJSONObject());
        // JWSObject jwsObject = new JWSObject(header, payload);
        // jwsObject.sign(new MACSigner(jwtSecret.getBytes()));
        // return jwsObject.serialize();
        // end thư viện JWS
        // Thư viện JWTs
        Map<String, Object> claims = new HashMap<>();
        String role = userDetails.getAuthorities().iterator().next().getAuthority();
        claims.put("role", role);

        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(expirationDate)
                .signWith(SignatureAlgorithm.ES512, jwtSecret)
                .compact();

        // end thư viện JWTs

    }

    // public String getUsernameFromToken(String token) throws ParseException {
    // SignedJWT signedJWT = SignedJWT.parse(token);
    // return signedJWT.getJWTClaimsSet().getSubject();
    // }
    //
    // public boolean isValidExpireTimeFromToken(String token) throws ParseException
    // {
    // SignedJWT signedJWT = SignedJWT.parse(token);
    // Date expire = signedJWT.getJWTClaimsSet().getExpirationTime();
    // return expire.after(new Date());
    // }
    //
    // public Boolean isValidJwtToken(String token) throws JOSEException,
    // ParseException {
    // JWSVerifier verifier = new MACVerifier(jwtSecret.getBytes());
    // SignedJWT signedJWT = SignedJWT.parse(token);
    // return signedJWT.verify(verifier);
    // }
    // public String getRoleFromToken(String token) {
    // Claims claims =
    // Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
    // return claims.get("role", String.class);
    // }

    public String getRoleFromToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(jwtSecret)
                .build()
                .parseClaimsJws(token)
                .getBody();
        return claims.get("role", String.class);
    }

    public String getUsernameFromToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(jwtSecret)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public Date getExpirationDateFromToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(jwtSecret)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getExpiration();
    }

    public boolean isValidateToken(String token) {
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(jwtSecret)
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            Date expiration = claims.getExpiration();
            return expiration.after(new Date(System.currentTimeMillis()));
        } catch (Exception e) {
            return false;
        }
    }
}
