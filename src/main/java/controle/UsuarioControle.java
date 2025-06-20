// src/main/java/controle/UsuarioControle.java
package main.java.controle;

import main.java.objetos.*;

import java.util.LinkedList;
import java.util.List;

public class UsuarioControle {
    private static final List<Usuario> usuarios = new LinkedList<>();
    private static UsuarioControle usuarioControleUnic;
    
   
    
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
        
        if (!MenuControle.validarCPF(cpf)) {
            throw new IllegalArgumentException("CPF inválido");
        }
        
        if (!MenuControle.validarEmail(email)) {
            throw new IllegalArgumentException("Email inválido");
        }
        
        if (senha == null || senha.length() < 6) {
            throw new IllegalArgumentException("Senha deve ter pelo menos 6 caracteres");
        }
        
        if (!senha.equals(comfSenha)) {
            throw new IllegalArgumentException("Senhas não correspondem");
        }
        
        if (!MenuControle.validarUsername(user)) {
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
    
    public Usuario buscarCpf(String cpf){
        Usuario u = null;
        
        for(Usuario u1 : usuarios)
            if(u1.getCpf().equals(cpf)) u = u1;
        
        return u;
    }
    
    public boolean deletar(Usuario u){
        String cpf = u.getCpf();
        boolean existe = false;
        
        for(Usuario u1 : usuarios)
            if(u1.getCpf().equals(cpf)) existe = true;
        
        if(existe) usuarios.remove(u);
        
        return existe;
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
    
    public static void autoInscricao(Palestra palestra){
        if(palestra!=null){
            for(Palestra p : MenuControle.getUsuarioAtual().getPalestras()){ // verifica se já está inscrito na palestra
                if(p.getCodigo()==palestra.getCodigo()) throw new IllegalArgumentException("Já inscrito");
            }
            if(palestra.getVagas()>0){
                MenuControle.getUsuarioAtual().getPalestras().add(palestra);
                palestra.setVagas(palestra.getVagas()-1);
            } else throw new IllegalArgumentException("Não há vagas");        
        }
    }
}