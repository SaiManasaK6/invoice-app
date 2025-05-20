package test.interview.Demo.repository;

import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import test.interview.Demo.domain.Invoice;

@Service  // not using @Repository because it isn't a real repository
@RequiredArgsConstructor
public class InvoiceRepo {

    public Invoice getById(UUID id) {
        return FakeDB.idToInvoiceMap.get(id);
    }


}