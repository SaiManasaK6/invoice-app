package test.interview.Demo.domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Builder;
import lombok.Data;
import test.interview.Demo.constants.InvoiceStatus;

@Data
@Builder
public class Invoice implements Core {

    private List<BillingRecord> billingRecords;
    private Date createdTime;
    private UUID id;
    private InvoiceStatus status;
    private User user;

    public UUID getId() {
        return id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    
}