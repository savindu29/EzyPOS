package com.savindu.POS.EzyPOS.util;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class IdGenerator {
    private final Random RANDOM = new Random();
    private final String RESOURCE="0123456789abcdefghijklmnopqrstuvwxyz";
    public String generateId(int i){
        StringBuilder simpleId = new StringBuilder();
        for (int j = 0; j < i; j++) {
            simpleId.append(RESOURCE.charAt(RANDOM.nextInt(35)));
        }
        return simpleId.toString();
    }


}
