package service;

import entity.Entity;

import java.util.List;

/**
 * @author: Ezekiel Eromosei
 * @created: 14 October 2022
 */

public interface FindByNameInterface<T extends Entity> {

    List<T> findByName(String name);
}
