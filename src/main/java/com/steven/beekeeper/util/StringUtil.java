package com.steven.beekeeper.util;

import java.util.UUID;

public class StringUtil {

    public static String generateUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
