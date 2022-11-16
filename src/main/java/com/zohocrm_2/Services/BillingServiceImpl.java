package com.zohocrm_2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm_2.Repositories.BillingRepository;
import com.zohocrm_2.entities.Billing;
@Service
public class BillingServiceImpl implements BillingService {
@Autowired
private BillingRepository billingRepo;
	@Override
	public void SaveBill(Billing bill) {
	billingRepo.save(bill);
	}

}
