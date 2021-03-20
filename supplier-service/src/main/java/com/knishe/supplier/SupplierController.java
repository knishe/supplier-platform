package com.knishe.supplier;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/supplier")
public class SupplierController {

    @Operation(
            summary = "",
            description = ""
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",
                    description = "Creates and returns an empty basket",
                    content = @Content(schema = @Schema(implementation = SupplierResponse.class)))
    })
    @GetMapping("{id}")
    public ResponseEntity requestSupplier(@PathVariable String id) {
        return ResponseEntity.ok().build();
    }


    class SupplierResponse {
    }
}
