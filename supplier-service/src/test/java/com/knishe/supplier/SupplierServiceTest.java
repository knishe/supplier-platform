package com.knishe.supplier;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SupplierServiceTest {

    @Test
    public void givenNoSupplierExist_whenCreateSupplier_thenReturnSupplier(){
        Supplier supplier = new Supplier();
        SupplierService service = new SupplierService();
        Supplier createdSupplier = service.createSupplier(supplier);

        assertThat(createdSupplier).isNull();
    }
}