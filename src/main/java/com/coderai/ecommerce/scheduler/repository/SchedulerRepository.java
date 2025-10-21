package com.coderai.ecommerce.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderai.ecommerce.scheduler.entity.Scheduler;

@Repository
public interface SchedulerRepository extends JpaRepository<Scheduler, Long> {
    // TODO: add query methods
}
