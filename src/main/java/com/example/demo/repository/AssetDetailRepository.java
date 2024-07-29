package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.AssetDetail;

/**
 * AssetDetailRepository
 */
@Repository
public interface AssetDetailRepository extends JpaRepository<AssetDetail, Integer>{
}