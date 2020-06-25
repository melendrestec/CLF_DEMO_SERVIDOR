package com.cibertec.interfaces;

import java.util.List;

import com.cibertec.entidad.Cliente;;

public interface ClienteDAO {
	public int saveCliente(Cliente bean);
	public List<Cliente> listAllClienteXEdad(int e1,int e2 );

}
