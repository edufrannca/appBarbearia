package br.com.marcio.barbershopui.service;

import br.com.marcio.barbershopui.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
