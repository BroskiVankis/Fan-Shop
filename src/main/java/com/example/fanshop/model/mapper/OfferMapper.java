package com.example.fanshop.model.mapper;

import com.example.fanshop.model.dto.offer.AddOfferDTO;
import com.example.fanshop.model.dto.offer.OfferDetailDTO;
import com.example.fanshop.model.entity.OfferEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OfferMapper {

    OfferEntity addOfferDtoToOfferEntity(AddOfferDTO addOfferDTO);

//    @Mapping(source = "brand.name", target = "brand")
    @Mapping(source = "model.brand.name", target = "brand")
    OfferDetailDTO offerEntityToCardListingOfferDto(OfferEntity offerEntity);
}
