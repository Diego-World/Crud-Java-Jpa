package com.gouveia.crud.crudjpa.repository;

import com.gouveia.crud.crudjpa.model.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepository extends JpaRepository<Watch, Long> {
}
