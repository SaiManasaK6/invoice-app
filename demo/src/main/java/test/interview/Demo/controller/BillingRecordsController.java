package test.interview.Demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.interview.Demo.domain.BillingRecord;
import test.interview.Demo.repository.FakeDB;

@RestController
@RequestMapping("/billing-records")
public class BillingRecordsController {

	@GetMapping
	 public ResponseEntity<List<BillingRecord>> getAllBillingRecords() {
	        return ResponseEntity.ok(FakeDB.allBillingRecords);
	    }
	 
	 @GetMapping("/{id}")
	    public ResponseEntity<BillingRecord> getBillingRecordById(@PathVariable("id") UUID id) {
	        return FakeDB.allBillingRecords.stream()
	                .filter(record -> record.getId().equals(id))
	                .findFirst()
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	    }
}
