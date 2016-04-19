package org.javaee7.sample;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author arungupta & arthur 
 * yeahhh yeah yeah
 *2e modif pour test le merge
 *test merge local
 */
@XmlRootElement
public class Person {
    private String name;
	private String mail ;
	private int age;
    public Person() {
    }

    public Person(String name, String mail, int age) {
        this.name = name;
		this.mail = mail;
		this.age = age;
    }
    
    public String getName() {
        return name;
    }

	public String getMail() {
        return mail;
    }
	public String getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}