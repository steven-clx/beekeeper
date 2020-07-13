package com.steven.beekeeper.mapper;

import com.steven.beekeeper.entity.ItemEntity;
import com.steven.beekeeper.util.Parser;

import java.text.ParseException;

public class ItemEntityMapper {

    public static ItemEntity map(FieldMapper fm) throws ParseException {
        return new ItemEntity()
                .setIid          (                     fm.map("iid"          ) )
                .setDetails      (                     fm.map("details"      ) )
                .setCategoryId   (                     fm.map("categoryId"   ) )
                .setPayServiceId (                     fm.map("payServiceId" ) )
                .setCreatedAt    (Parser.parseDate    (fm.map("createdAt"    )))
                .setUpdatedAt    (Parser.parseDate    (fm.map("updatedAt"    )))
                .setSpentAt      (Parser.parseDate    (fm.map("spentAt"      )))
                .setAmount       (Parser.parseDouble  (fm.map("amount"       )))
                .setIsBig        (Parser.parseBoolean (fm.map("isBig"        )))
                ;
    }

}
