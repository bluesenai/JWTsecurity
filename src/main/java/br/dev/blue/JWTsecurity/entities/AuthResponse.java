/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.blue.JWTsecurity.entities;

/**
 *
 * @author sesi3dib
 */
public class AuthResponse {
   private String email;
   private String acceToken;

    public AuthResponse() {
    }

    public AuthResponse(String email, String acceToken) {
        this.email = email;
        this.acceToken = acceToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAcceToken() {
        return acceToken;
    }

    public void setAcceToken(String acceToken) {
        this.acceToken = acceToken;
    }

}