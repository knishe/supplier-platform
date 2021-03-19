package com.knishe.supplier;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController {

    @GetMapping("{id}")
    public ResponseEntity requestSupplier(@PathVariable String id){
        return ResponseEntity.ok().build();
    }
}
