package com.steven.beekeeper.repository;

import com.steven.beekeeper.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemEntity, String> {

    ItemEntity findByIid(String iid);

}
