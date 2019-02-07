package dao;

import java.util.Set;

public abstract class DAO<T> {
	
	public void Incluir(T elemento) {}	
	public abstract T buscar(int id) throws Exception;
	public  abstract T  listar(int...param ) throws Exception;
}

