package com.zohocrm_2.Services;

import java.util.List;

import com.zohocrm_2.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public Lead getOneLead(long id);

public void deleteOneLead(long id);

public List<Lead> listLeads();

}
