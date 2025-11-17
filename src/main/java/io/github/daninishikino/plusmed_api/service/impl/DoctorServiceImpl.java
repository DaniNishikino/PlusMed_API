package io.github.daninishikino.plusmed_api.service.impl;

import io.github.daninishikino.plusmed_api.repository.DoctorRepository;
import io.github.daninishikino.plusmed_api.service.DoctorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {
    private final DoctorRepository repository;
}
