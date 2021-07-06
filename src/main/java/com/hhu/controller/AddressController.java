package com.hhu.controller;

import com.hhu.domain.Address;
import com.hhu.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author cjh49
 * @date 2021/7/6 10:23
 */

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/add")
    public void add(@RequestBody Address address) {
        addressService.add(address);

    }

    @PostMapping("/update")
    public void update(@RequestBody Address address) {
        addressService.update(address);
    }

    @GetMapping("/delete/{locationName}")
    public void delete(@PathVariable String locationName) {
        addressService.deleteBylocationName(locationName);
    }

    @GetMapping("/getAll")
    public List<Address> getAll() {
        List<Address> list = addressService.getAll();
        list.forEach(System.out::println);
        return list;
    }

    @GetMapping("/getAddressBylocationName/{locationName}")
    public Address getAddressBylocationName(@PathVariable String locationName) {
        return addressService.getAddressBylocationName(locationName);
    }
}
