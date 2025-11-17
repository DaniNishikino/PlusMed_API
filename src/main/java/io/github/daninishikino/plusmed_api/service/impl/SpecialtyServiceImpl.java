package io.github.daninishikino.plusmed_api.service.impl;

import io.github.daninishikino.plusmed_api.repository.SpecialtyRepository;
import io.github.daninishikino.plusmed_api.service.SpecialtyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SpecialtyServiceImpl implements SpecialtyService {

    private final SpecialtyRepository repository;
}
