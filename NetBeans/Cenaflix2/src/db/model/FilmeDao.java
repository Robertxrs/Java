package db.model;

import java.util.List;

public interface FilmeDao{
    void cadastrar(Filme filme);
    Filme buscarPorId(int id);
    List<Filme> listarTodos();
    void atualizar(Filme filme);
    void deletar(int id);
}
