package com.sample.infra.jpa;

import com.sample.domain.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 *
 * */
public interface SampleRepository extends JpaRepository<SampleEntity, UUID> {
}
