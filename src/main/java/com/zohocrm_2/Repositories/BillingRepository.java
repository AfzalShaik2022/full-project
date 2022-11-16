package com.zohocrm_2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm_2.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
