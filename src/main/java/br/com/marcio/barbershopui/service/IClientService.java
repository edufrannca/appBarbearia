package br.com.marcio.barbershopui.service;

import br.com.marcio.barbershopui.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
