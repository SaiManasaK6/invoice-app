package test.interview.Demo.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import test.interview.Demo.domain.Invoice;
import test.interview.Demo.repository.InvoiceRepo;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepo invoiceRepo;

    public Invoice getInvoice(UUID id) {
        return invoiceRepo.getById(id);
    }
}
