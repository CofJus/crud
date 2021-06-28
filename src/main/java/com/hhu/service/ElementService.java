package com.hhu.service;

import com.hhu.domain.Element;

import java.util.List;

/**
 * @author Ji Rui
 * @date 2021/6/28 22:33
 */
public interface ElementService {

    void add(Element element);

    void update(Element element);

    List<Element> getAll();

    Element getElementByName(String name);

    void deleteByName(String name);
}
