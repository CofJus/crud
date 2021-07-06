package com.hhu.controller;

import com.hhu.domain.Element;
import com.hhu.service.ElementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:46
 */
@RestController
@RequestMapping("/element")
@Slf4j
public class ElementController {
    @Autowired
    private ElementService elementService;

    @PostMapping("/add")
    public void add(@RequestBody Element element) {
        elementService.add(element);
    }

    @PostMapping("/update")
    public void update(@RequestBody Element element) {
        elementService.update(element);
    }

    @GetMapping("/delete/{name}")
    public void delete(@PathVariable String name) {
        elementService.deleteByName(name);
    }

    @GetMapping("/getAll")
    public List<Element> getAll() {
        List<Element> list = elementService.getAll();
        list.forEach(System.out::println);
        return list;
    }

    @GetMapping("/getElementByName/{name}")
    public Element getElementByName(@PathVariable String name) {
        return elementService.getElementByName(name);
    }
}
