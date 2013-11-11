package com.laurinka;

import io.prediction.Client;

import java.util.Arrays;

public class BlogRecommender {

    public static void main(String[] args) throws Exception {

        Client client = new Client("BmGW6aDNWTjN42OJSC0bElyocWUf148hqrnOSlfpzNvXwFcnbyJyGbFNF9aUA1pL");
        client.identify("daniel");
        String[] recommendedItems = client.getItemSimTopN("engine2", "blog1", 5);

        System.out.println(String.format("User %s is recommended %s", "radim", Arrays.toString(recommendedItems)));

        client.close();
    }
}