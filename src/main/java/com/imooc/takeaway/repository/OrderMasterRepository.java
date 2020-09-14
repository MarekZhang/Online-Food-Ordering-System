package com.imooc.takeaway.repository;

import com.imooc.takeaway.domain.OrderMaster;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
  Page<OrderMaster> findByBuyerOpenidIn(String openid, Pageable pageable);
}

