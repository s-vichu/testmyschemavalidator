package com.my

import grails.converters.JSON

class Person {
    
    
    Long id
    String firstname
    String lastname
    Long age
    Date dob
    String department

    static mapping = {
        datasource 'ALL'
        table "person"
        id name: "id", column: "id", generator:'identity'
        version false
    }    


    static constraints = {
        firstname nullable: true
        lastname nullable: true
        age nullable: true
        dob nullable: true
        department nullable: true
    }    
    
   
/*    static {
        JSON.registerObjectMarshaller(Brand) { Brand brand ->
            return [
                brand: brand.brand,
                status: brand.status,
                datediscontinued: brand?.datediscontinued?.format('yyyy-MM-dd'),
                brandurl: brand.brandurl,
                attrib: brand.attrib
            ]
        }

        XML.registerObjectMarshaller(Brand) { Brand brand ->
            return [
                brand: brand.brand,
                status: brand.status,
                datediscontinued: brand?.datediscontinued?.format('yyyy-MM-dd'),
                brandurl: brand.brandurl,
                attrib: brand.attrib
            ]
        }
    } */
}
