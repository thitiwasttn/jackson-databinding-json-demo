package com.thitiwas.util;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thitiwas.model.Address;
import com.thitiwas.model.Customer;

public class Driver {

    public static void main(String[] args) {

        try {
            // create object mapper
            ObjectMapper mapper = new ObjectMapper();

            // read JSON from file and map/convert to Java POJO
            Customer myCustomer = mapper.readValue
                    (new File("data/sample-full2.json"), Customer.class);

            // also print individual items
            System.out.println(myCustomer);


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void temp()
	{

	}

}
