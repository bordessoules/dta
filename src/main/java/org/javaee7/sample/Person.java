package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta
 */
@XmlRootElement
public class Person {
    private String name;
	private String mail ;
	
    public Person() {
    }

    public Person(String name, String mail) {
        this.name = name;
		this.mail = mail;
    }
    
    public String getName() {
        return name;
    }

	public String getMail() {
        return mail;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}