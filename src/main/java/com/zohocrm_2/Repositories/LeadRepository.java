package com.zohocrm_2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm_2.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {
}
