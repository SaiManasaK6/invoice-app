package test.interview.Demo.repository;

import java.util.List;

import test.interview.Demo.domain.BillingRecord;

public class BillingRecordRepo {

    public List<BillingRecord> getAllBillingRecords() {
        return FakeDB.allBillingRecords;
    }

}