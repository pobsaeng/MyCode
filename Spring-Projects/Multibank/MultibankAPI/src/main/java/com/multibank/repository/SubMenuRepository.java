package com.multibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multibank.domain.entity.SubMenu;

@Repository
public interface SubMenuRepository extends JpaRepository<SubMenu, Integer>{

}
