

import java.util.Date;

public class Person {

    public String name;
    public Date birthday ;
    public Adress adresses;
    Person(String name,Date birthday, Adress  adresses){
        this.name=name;
        this.birthday=birthday;
        this.adresses=adresses;
    }
    Person(String name,Date birthday){
        this.name=name;
        this.birthday=birthday;
    }

    public void print() {
        System.out.println(" Фамилия " + this.name  + " Дата рождения: " + this. birthday + " Адресс: " + this.adresses);
    }
    public String getName()
    {

        return this.name;

    }
    public Adress getAdress()
    {

        return this.adresses;

    }
    public Date getBirthday(){

        return this.birthday;
    }




}
