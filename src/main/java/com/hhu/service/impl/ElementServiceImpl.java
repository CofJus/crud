package com.hhu.service.impl;

import com.hhu.domain.Element;
import com.hhu.repository.ElementMapper;
import com.hhu.service.ElementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:37
 */
@Service
public class ElementServiceImpl implements ElementService {

    //TODO 调用elementMapper

    @Autowired
    private ElementMapper elementMapper;

    public void add(Element element) {
        elementMapper.insert(element);
    }

    public void update(Element element) {

    }

    public List<Element> getAll() {
        return elementMapper.queryAll();
    }

    public Element getElementByName(String name) {
        return null;
    }

    public void deleteByName(String name) {

    }
}
