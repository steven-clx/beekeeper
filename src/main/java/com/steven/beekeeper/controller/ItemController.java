package com.steven.beekeeper.controller;

import com.steven.beekeeper.entity.ItemEntity;
import com.steven.beekeeper.exception.InternalException;
import com.steven.beekeeper.mapper.ItemEntityMapper;
import com.steven.beekeeper.repository.ItemRepository;
import com.steven.beekeeper.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.LinkedHashMap;


@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;


    @RequestMapping(value = "/test-by-httpservletrequest", method = RequestMethod.POST)
    public ItemEntity testByHttpServletRequest(HttpServletRequest request) throws ParseException {

        ItemEntity itemEntity = ItemEntityMapper.map(request::getParameter);

        System.out.println(itemEntity);

        return itemEntity;
    }


    @RequestMapping(value = "/test-by-json", method = RequestMethod.POST)
    public ItemEntity testByJson(@RequestBody LinkedHashMap<String, String> map) throws ParseException {

        ItemEntity itemEntity = ItemEntityMapper.map(map::get);

        System.out.println(itemEntity);

        return itemEntity;
    }


    @RequestMapping(value = "/test-by-bean", method = RequestMethod.POST)
    public ItemEntity testByBean(@RequestBody ItemEntity itemEntity) {

        System.out.println(itemEntity);

        return itemEntity;
    }


    @RequestMapping(value = "/test-add", method = RequestMethod.POST)
    public ItemEntity testAdd(@RequestBody ItemEntity itemEntity) throws InternalException {

        if (itemEntity.getIid() != null)
            throw new InternalException();

        itemEntity.setIid(StringUtil.generateUUID());

        return itemRepository.save(itemEntity);
    }


    @RequestMapping(value = "/test-update", method = RequestMethod.POST)
    public ItemEntity testUpdate(@RequestBody ItemEntity itemEntity) throws Exception {

        if (itemEntity.getIid() == null)
            throw new Exception("Item iid cannot be null");

        ItemEntity existing = itemRepository.findByIid(itemEntity.getIid());

        if (existing == null)
            throw new Exception("Item iid does not match any record");

        return itemRepository.save(itemEntity);
    }

}
