// src/main/java/controle/UsuarioControle.java
package main.java.controle;

import main.java.objetos.*;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;


public class UsuarioControle {
    private static final List<Usuario> usuarios = new LinkedList<>();
    private static UsuarioControle usuarioControleUnic;
    
    // Padrões regex para validação
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern CPF_PATTERN = Pattern.compile(
        "^(\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2})$");
    private static final Pattern USERNAME_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9_]{5,20}$");
    
    private UsuarioControle(){}
  
    public static UsuarioControle getUsuarioControle() {
        if (usuarioControleUnic == null) {
            usuarioControleUnic = new UsuarioControle();
        }
        return usuarioControleUnic;
    }
    
    public static List<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public static void cadastrar(String nome, String cpf, String email, String senha, String comfSenha,
                               String user, boolean adm_flag, boolean colab_flag) {
        // Validação de campos obrigatórios
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        
        if (!validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        
        if (!validarEmail(email)) {
            throw new IllegalArgumentException("Email inválido");
        }
        
        if (senha == null || senha.length() < 6) {
            throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres");
        }
        
        if (!senha.equals(comfSenha)) {
            throw new IllegalArgumentException("Senhas não correspondem");
        }
        
        if (!validarUsername(user)) {
            throw new IllegalArgumentException("Username deve ter entre 5 e 20 caracteres alfanuméricos");
        }
        
        // Verifica se usuário ou email já existem
        int existe = buscar(email, user);
        if (existe == 1) {
            throw new IllegalArgumentException("Email");
        }
        if (existe == 2) {
            throw new IllegalArgumentException("User");
        }
        if (existe == 3) {
            throw new IllegalArgumentException("UserEmail");
        }
        
        usuarios.add(new Usuario(nome, cpf, email, senha, user, adm_flag, colab_flag));
    }
    
    public static Usuario buscar(String userEmail) {
        if (userEmail == null || userEmail.trim().isEmpty()) {
            return null;
        }
        
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equalsIgnoreCase(userEmail) || 
                usuario.getEmail().equalsIgnoreCase(userEmail)) {
                return usuario;
            }
        }
        return null;
    }
    
    public static int buscar(String email, String user) {
        int correspondencia = 0;
        
        if (email == null || user == null) {
            return correspondencia;
        }
        
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equalsIgnoreCase(email)) {
                correspondencia++;
                break;
            }
        }
        
        for (Usuario usuario : usuarios) {
            if (usuario.getUser().equalsIgnoreCase(user)) {
                correspondencia += 2;
                break;
            }
        }
        
        return correspondencia;
    }
    
    public static Usuario entrar(String userEmail, String senha) {
        if (userEmail == null || userEmail.trim().isEmpty()) {
            throw new IllegalArgumentException("Email/usuário não pode ser vazio");
        }
        
        if (senha == null || senha.isBlank()) {
            throw new IllegalArgumentException("Senha não pode ser vazia");
        }
        
        Usuario usuario = buscar(userEmail);
        
        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        } else {
            throw new IllegalArgumentException("Credenciais inválidas");
        }
    }
    
    // Métodos auxiliares de validação
    private static boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    
    private static boolean validarCPF(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            return false;
        }
        
        // Remove caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");
        
        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }
        
        // Verifica dígitos repetidos (ex: 111.111.111-11)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }
        
        // Validação dos dígitos verificadores
        try {
            int[] digits = new int[11];
            for (int i = 0; i < 11; i++) {
                digits[i] = Integer.parseInt(cpf.substring(i, i + 1));
            }
            
            // Calcula primeiro dígito verificador
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                sum += digits[i] * (10 - i);
            }
            int firstDigit = 11 - (sum % 11);
            if (firstDigit >= 10) firstDigit = 0;
            
            // Calcula segundo dígito verificador
            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += digits[i] * (11 - i);
            }
            int secondDigit = 11 - (sum % 11);
            if (secondDigit >= 10) secondDigit = 0;
            
            // Verifica se os dígitos calculados conferem com os informados
            return (digits[9] == firstDigit) && (digits[10] == secondDigit);
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    private static boolean validarUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }
        return USERNAME_PATTERN.matcher(username).matches();
    }
    
    public static void autoInscricao(Palestra palestra){
        if(palestra!=null){
            for(Palestra p : MenuControle.getUsuarioAtual().getPalestras()){ // verifica se já está inscrito na palestra
                if(p.getCodigo()==palestra.getCodigo()) return;
            }
            if(palestra.getVagas()>0){
                MenuControle.getUsuarioAtual().getPalestras().add(palestra);
                palestra.setVagas(palestra.getVagas()-1);
            }        
        }
    }
}