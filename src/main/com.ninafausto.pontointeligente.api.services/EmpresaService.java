package main.com.ninafausto.pontointeligente.api.services

import java.util.Optional;

import com.ninafausto.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

    /**
	 * Retorna uma empresa dado um CNPJ.
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
    Optional<Empresa>buscarPorCnPj(String cnpj);

    /**
	 * Cadastra uma nova empresa na base de dados.
	 * 
	 * @param empresa
	 * @return Empresa
	 */

    Empresa Persistir(Empresa empresa);
} 