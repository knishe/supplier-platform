package com.knishe.supplier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SupplierRepository extends JpaRepository<Supplier,Long> {
}
