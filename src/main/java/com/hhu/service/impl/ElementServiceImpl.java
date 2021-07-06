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

    @Autowired
    private ElementMapper elementMapper;

    @Override
    public void add(Element element) {
        elementMapper.insert(element);
    }

    @Override
    public void update(Element element) {
        elementMapper.update(element);
    }

    @Override
    public List<Element> getAll() {
        return elementMapper.queryAll();
    }

    @Override
    public Element getElementByName(String name) {
        return elementMapper.queryByName(name);
    }

    @Override
    public void deleteByName(String name) {
        elementMapper.delete(name);
    }
}
