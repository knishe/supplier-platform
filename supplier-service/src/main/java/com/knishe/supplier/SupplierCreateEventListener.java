package com.knishe.supplier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class SupplierCreateEventListener {

    @Async
    @TransactionalEventListener
    public void processSupplierCreateEvent(SupplierCreateEvent supplierCreateEvent){
        log.info("Supplier created event processing...");
    }
}
