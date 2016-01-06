package com.ain.syl.support;

import lombok.extern.log4j.Log4j2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

/**
 * Created by ygpark2 on 15. 10. 29.
 */
@Log4j2
public class GenericUnmarshallFactory {

    public static <T> T getInstance(Class<T> theClass, String xmlBody) throws IllegalAccessException, InstantiationException, JAXBException {

        JAXBContext jc = JAXBContext.newInstance(theClass);
        Unmarshaller u = jc.createUnmarshaller();
        return (T) u.unmarshal( new StreamSource(new StringReader(xmlBody)) );

    }
}
