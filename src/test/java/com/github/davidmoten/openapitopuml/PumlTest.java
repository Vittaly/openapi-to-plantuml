package com.github.davidmoten.openapitopuml;

import org.junit.Test;

public class PumlTest {
    
    @Test
    public void testConvert() {
        String openapi = "openapi: 3.0.1\n" + 
                "components:\n" + 
                "  schemas:\n" + 
                "    CustomerType:\n" + 
                "      type: string\n" + 
                "      example: Example value\n" + 
                "    Customer:\n" + 
                "      type: string\n" +
                "      "
                ;
        
        System.out.println(Puml.toPuml(openapi));
    }

}
