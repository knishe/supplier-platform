package com.knishe.supplier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SupplierService {

    private ApplicationEventPublisher applicationEventPublisher;
    private SupplierRepository supplierRepository;

    @Autowired
    public SupplierService(ApplicationEventPublisher applicationEventPublisher,
                           SupplierRepository supplierRepository) {
        this.applicationEventPublisher = applicationEventPublisher;
        this.supplierRepository = supplierRepository;
    }

    /**
     * Creates supplier
     * @param supplier Supplier to create
     * @return {@link Supplier}
     */
    public Supplier createSupplier(Supplier supplier) {
        Supplier createdSupplier = supplierRepository.save(supplier);

        applicationEventPublisher.publishEvent(new SupplierCreateEvent(createdSupplier));
        return createdSupplier;
    }
}
