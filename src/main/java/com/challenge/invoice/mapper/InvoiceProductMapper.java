package com.challenge.invoice.mapper;

import com.challenge.invoice.dto.InvoiceProductDTO;
import com.challenge.invoice.entity.InvoiceProduct;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvoiceProductMapper {

    @Mappings({
            @Mapping(source = "id.invoice.id", target = "invoiceId"),
            @Mapping(source = "id.product.id", target = "productId"),
            @Mapping(source = "createdAt", target = "createdAt", dateFormat = "yyyy-MM-dd HH:mm"),
            @Mapping(source = "updatedAT", target = "updatedAT", dateFormat = "yyyy-MM-dd HH:mm")
    })
    InvoiceProductDTO map(InvoiceProduct de);

    List<InvoiceProductDTO> map(List<InvoiceProduct> invoiceProducts);

}
