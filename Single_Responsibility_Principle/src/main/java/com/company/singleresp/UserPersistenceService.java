package com.company.singleresp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserPersistenceService {

    private final Store store = new Store();

	public void saveUser(User user){

        store.store(user);
    }
}
