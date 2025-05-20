package test.interview.Demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.interview.Demo.domain.BillingRecord;
import test.interview.Demo.domain.Invoice;
import test.interview.Demo.repository.FakeDB;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{customerNumber}/invoices")
    public ResponseEntity<List<Invoice>> getInvoicesForUser(@PathVariable("customerNumber") int customerNumber) {
        List<Invoice> result = FakeDB.idToInvoiceMap.values().stream()
                .filter(inv -> inv.getUser().getCustomerNumber() == customerNumber)
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(result);
    }

    @GetMapping("/{customerNumber}/billing-records")
    public ResponseEntity<List<BillingRecord>> getBillingRecordsForUser(@PathVariable("customerNumber") int customerNumber) {
        List<BillingRecord> result = FakeDB.allBillingRecords.stream()
                .filter(br -> br.getUser().getCustomerNumber() == customerNumber)
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        return ResponseEntity.ok(result);
    }
}
