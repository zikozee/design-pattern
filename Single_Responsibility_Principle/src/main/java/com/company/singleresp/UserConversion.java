package com.company.singleresp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author: Ezekiel Eromosei
 * @created: 11 September 2022
 */

public class UserConversion {

    public User convertToUser(String userJson) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(userJson, User.class);
    }
}
