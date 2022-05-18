package com.bitc.shop_test.repository;

import com.bitc.shop_test.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
