package com.hhu.service.impl;

import com.hhu.domain.Address;
import com.hhu.repository.AddressMapper;
import com.hhu.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cjh49
 * @date 2021/7/6 10:24
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    public void add(Address address) {
        addressMapper.insert(address);
    }

    public void update(Address address) {
        addressMapper.update(address);
    }

    public List<Address> getAll() {
        return addressMapper.queryAll();
    }

    public Address getAddressBylname(String lname) {
        return addressMapper.queryBylname(lname);
    }

    public void deleteBylname(String lname) {
        addressMapper.delete(lname);
    }
}