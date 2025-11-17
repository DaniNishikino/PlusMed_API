package io.github.daninishikino.plusmed_api.service.impl;

import io.github.daninishikino.plusmed_api.repository.PatientRepository;
import io.github.daninishikino.plusmed_api.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepository repository;
}
