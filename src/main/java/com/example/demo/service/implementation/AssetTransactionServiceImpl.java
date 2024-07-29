package com.example.demo.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.AssetTransaction;
import com.example.demo.repository.AssetTransactionRepository;
import com.example.demo.service.AssetTransactionService;

/**
 * AssetTransactionServiceImpl
 */
@Service
public class AssetTransactionServiceImpl implements AssetTransactionService {
  @Autowired
  private AssetTransactionRepository assetTransactionRepository;

  @Override
  public List<AssetTransaction> get() {
    return assetTransactionRepository.findAll();
  }

  @Override
  public AssetTransaction get(Integer id) {
    return assetTransactionRepository.findById(id).orElse(null);
  }

  @Override
  public Boolean save(AssetTransaction entity) {
    assetTransactionRepository.save(entity);
    return assetTransactionRepository.findById(entity.getId()).isPresent();
  }

  @Override
  public Boolean delete(Integer id) {
    assetTransactionRepository.deleteById(id);
    return assetTransactionRepository.findById(id).isEmpty();
  }
  
}