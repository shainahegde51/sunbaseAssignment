package com.example.sunbaseAssignment.service;

import com.example.sunbaseAssignment.Dto.Request.CustomerRequestDto;
import com.example.sunbaseAssignment.Dto.Response.CustomerResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface customerService {

    CustomerResponseDto createCustomer(CustomerRequestDto customerRequestDto , boolean SyncDb);

    CustomerResponseDto udapteCustomer(String email , CustomerRequestDto customerRequestDto);


    String deleteCustomer(String email);

    CustomerResponseDto getCustomerWithId(String email);

    List<CustomerResponseDto> searchBySpecificType(String searchBy, String searchQuery);

    Page<CustomerResponseDto> getAllCustomers(int pageNo, int rowsCount, String sortBy, String searchBy);
}
