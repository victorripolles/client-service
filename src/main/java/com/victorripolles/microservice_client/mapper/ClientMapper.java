package com.victorripolles.microservice_client.mapper;

import com.victorripolles.microservice_client.api.dto.ClientResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ClientMapper {

    ClientResponseDTO clientResponseVOtoClientResponseDTO (ClientResponseVO clientResponseVO);
}
