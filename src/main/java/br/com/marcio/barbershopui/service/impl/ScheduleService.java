package br.com.marcio.barbershopui.service.impl;

import br.com.marcio.barbershopui.entity.ScheduleEntity;
import br.com.marcio.barbershopui.repository.IScheduleRepository;
import br.com.marcio.barbershopui.service.IScheduleService;
import br.com.marcio.barbershopui.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
