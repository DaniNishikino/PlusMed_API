package io.github.daninishikino.plusmed_api.service.impl;

import io.github.daninishikino.plusmed_api.repository.AppointmentsRepository;
import io.github.daninishikino.plusmed_api.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {
    private final AppointmentsRepository repository;
}
