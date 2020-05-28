
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("r.txt",true);

        Adress street1 = new Adress("Герасима Кондратьева");
        Adress street2 = new Adress("Петропавловская");

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        Date date4 = new Date();
        try {
            date1 = format.parse("200.06.09");
            date2 = format.parse("2001.05.25");
            date3 = format.parse("1998.3.21");
            date4 = format.parse("2004.10.5");
        } catch (Exception e) {
            e.printStackTrace();}

            Person[] persons = new Person[5];

            persons[0] = new Person("Ten", date1, street1);
            persons[1] = new Person("Filatova", date2, street2);
            persons[2] = new Person("Pogor", date3, street1);
            persons[3] = new Person("Ten", date4, street2);

        for (Person p:persons)
        {
            p.print();
        }

        Scanner enter = new Scanner(System.in);

        System.out.print("Введите фамилию:");

        String name = new String(enter.nextLine());

        for (Person p:persons)
        {
            if(name.equals(p.getName()) == true)
            {
                System.out.println(p.getName());
                file.write(p.getName() + " "+ "\n");
            }
        }

        System.out.println("Введите aдресс:");

        String ad = new String(enter.nextLine());

        for (Person p:persons)
        {

            if(ad.equals( p.getAdress()) == true)
            {
                System.out.println("Улице - " + ad + " фамилия -  " + p.getName());

                file.write("Улице - " + ad + " фамилия -  " + p.getName() + "\n");
            }

        }
        Date dateFirst = new Date(), dateLast = new Date();
        System.out.println("Введите дату в формате yyyy.mm.dd: ");
        dateFirst = new Date(enter.nextLine());
        System.out.println("Enter your last date in format yyyy-mm-dd: ");
        dateLast = new Date(enter.nextLine());

        System.out.println("Humans was borned before " + dateFirst + " and " + dateLast);
        for (Person p:persons) {

            if(p.getBirthday()>= dateFirst && p.getBirthday()<=dateLast)
            {
                System.out.println(p.getName() + " " + " в этом диапазоне!");
                file.write(p.getName() + " " + " в этом диапазоне!" + "\n");
            }
        }
        file.flush();


    }

    }

