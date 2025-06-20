package main.java.controle;

import java.util.regex.Pattern;

public abstract class Verificacao {
        
     // Padrões regex para validação
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    private static final Pattern CPF_PATTERN = Pattern.compile(
        "^(\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2})$");
    private static final Pattern USERNAME_PATTERN = Pattern.compile(
        "^[a-zA-Z0-9_]{5,20}$");
    
    // Métodos auxiliares de validação
    public static boolean validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
    
    public static boolean validarCPF(String cpf) {
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
    
    public static boolean validarUsername(String username) {
        if (username == null || username.trim().isEmpty()) {
            return false;
        }
        return USERNAME_PATTERN.matcher(username).matches();
    }
}
