package com.example.demo.service.generic;

import java.util.List;

import org.springframework.stereotype.Service;
// @Service
public interface GenericService<Entity, Key> {
  public List<Entity> get();
  public Entity get(Key id);
  public Boolean save(Entity entity);
  public Boolean delete(Key id);

}
