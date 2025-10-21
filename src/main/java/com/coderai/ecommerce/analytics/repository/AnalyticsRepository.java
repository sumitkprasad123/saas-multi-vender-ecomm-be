package com.coderai.ecommerce.analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coderai.ecommerce.analytics.entity.Analytics;

@Repository
public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    // TODO: add query methods
}
