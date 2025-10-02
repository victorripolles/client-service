package com.victorripolles.microservice_client.mapper;

import com.victorripolles.microservice_client.api.dto.ClientCreateRequestDTO;
import com.victorripolles.microservice_client.api.dto.ClientResponseDTO;
import com.victorripolles.microservice_client.api.dto.ClientUpdateRequestDTO;
import com.victorripolles.microservice_client.business.vo.ClientCreateRequestVO;
import com.victorripolles.microservice_client.business.vo.ClientResponseVO;
import com.victorripolles.microservice_client.business.vo.ClientUpdateRequestVO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ClientMapper {

    ClientResponseDTO clientResponseVOtoClientResponseDTO (ClientResponseVO clientResponseVO);

    ClientCreateRequestVO clientCreateRequestDTOtoClientCreateRequestVO(ClientCreateRequestDTO clientCreateRequestDTO);

    List<ClientResponseDTO> clientResponseVOListToClientResponseDTOList (List<ClientResponseVO> clientResponseVOList);

    ClientUpdateRequestVO clientUpdateRequestDTOtoClientUpdateRequestVO (ClientUpdateRequestDTO clientUpdateRequestDTO);
}
