package br.com.ingenium.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.ingenium.dao.UsuarioDAO;
import br.com.ingenium.model.Usuario;

public class UsuarioDAOTest {

	@Test
	@Ignore
	public void salvar() {
		
		Usuario usuario = new Usuario();
		usuario.setUsuario("Wesleyosantos91");
		usuario.setNome("Wesley Oliveira");
		usuario.setDescricao(" Teste1 ");
		usuario.setEmail("wesleyosantos91@gmail.com");
		usuario.setSenha("123456d");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
	}

	@Test
	@Ignore
	public void buscartodos() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		List<Usuario> usuariolist = usuarioDAO.buscarTodos();
		
		usuariolist.forEach(usuario -> {
			System.out.println(usuario.getId());
			System.out.println(usuario.getUsuario());
			System.out.println(usuario.getNome());
			System.out.println(usuario.getDescricao());
			System.out.println(usuario.getEmail());
			System.out.println(usuario.getSenha());
			System.out.println();
		});

	}
	
	@Test
	//@Ignore
	public void login(){
		Usuario usuario = new Usuario();
		usuario.setUsuario("wesleyosantos91");
		usuario.setSenha("12345");
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		boolean login = usuarioDAO.login(usuario);
		System.out.println(login);
	}

	@Test
	@Ignore
	public void excluir() {
		Usuario usuario = new Usuario();
		usuario.setId(5L);
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.excluir(usuario);
	}

	@Test
	@Ignore
	public void buscarPorCodigo() {
		Long codigo = 1L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		Usuario usuario = usuarioDAO.buscarPeloCodigo(codigo);

		System.out.println(usuario.getId());
		System.out.println(usuario.getUsuario());
		System.out.println(usuario.getNome());
		System.out.println(usuario.getDescricao());
		System.out.println(usuario.getEmail());
		System.out.println(usuario.getSenha());
		System.out.println();

	}

	@Test
	@Ignore
	public void alterar() {

		Usuario usuario = new Usuario();
		usuario.setId(2L);
		usuario.setUsuario("Wesleyosantos91");
		usuario.setNome("Wesley Oliveira");
		usuario.setDescricao(" Teste3 ");
		usuario.setEmail("wesleyosantos91@gmail.com");
		usuario.setSenha("12345");

		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.alterar(usuario);
	}
}