package io.github.daninishikino.plusmed_api.repository;

import io.github.daninishikino.plusmed_api.model.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AppointmentsRepository extends JpaRepository<Appointments, UUID> {
}
