package com.hhu.service;

import com.hhu.domain.Address;

import java.util.List;

/**
 * @author cjh49
 * @date 2021/7/6 10:24
 */
public interface AddressService {
    void add(Address address);

    void update(Address address);

    List<Address> getAll();

    Address getAddressBylocationName(String locationName);

    void deleteBylocationName(String locationName);
}
