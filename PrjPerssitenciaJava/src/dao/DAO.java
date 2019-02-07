package dao;

public abstract class DAO {
  public abstract void Incluir(T elemento) throws Exception;
  public T buscar(int id) throws Exception;
  public Set<T> listar(int... param) throws Exception;
}
