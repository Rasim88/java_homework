package hw;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
// Создание объектов класса Laptop
        Laptop HP_pailion_g6 = new Laptop("HP_pailion_g6", 16, "4k", true, 500, "16", "Windows", "black"); 
        Brand brandHp = new Brand("HP", "U.S.A.", "AmericaLanguage"); 
        HP_pailion_g6.addBrand(brandHp); 
        Laptop HP_galaxy_x64 = new Laptop("HP_galaxy_x64", 14, "FullHD", 
        true, 500, "8", "Windows", "White");
        HP_galaxy_x64.addBrand(brandHp);
        Laptop Samsung_a52 = new Laptop("Samsung_a52", 18, "FullHD", 
        true, 300, "8", "Windows", "Black");
        Brand brandSamsung = new Brand("Samsung", "Korea", "Korean");
        Samsung_a52.addBrand(brandSamsung);
        Laptop Samsung_m31s = new Laptop("Samsung_m31s", 16, "4k", 
        false, 1000, "16", "Linux", "Black");
        Samsung_m31s.addBrand(brandSamsung);
        Laptop Lenovo_gtx76 = new Laptop("Lenovo_gtx76", 16, "FullHD", 
        true, 700, "8", "Windows", "White");
        Brand brandLenovo = new Brand("Lenovo", "China", "Chinese");
        Lenovo_gtx76.addBrand(brandLenovo);
        Laptop Macbook_14pro = new Laptop("Macbook_14pro", 17, "4k", 
        false, 1000, "8", "MacOS", "White");
        Brand brandMacbook = new Brand("Apple", "U.S.A.", "American");
        Macbook_14pro.addBrand(brandMacbook);
        Laptop Asus_x515 = new Laptop("Asus_x515", 17, "FullHD", 
        true, 300, "4", "Windows", "Black");
        Brand brandAsus = new Brand("Asus", "Taiwan", "Chinese");
        Asus_x515.addBrand(brandAsus);
        Laptop Acer_air5 = new Laptop("Acer_air5", 19, "FullHD", 
        true, 600, "8", "Windows", "Black");
        Brand brandAcer = new Brand("Acer", "Taiwan", "Chinese");
        Acer_air5.addBrand(brandAcer);
        Laptop Acer_air6 = new Laptop("Acer_air6" ,18, "4k", 
        false, 500, "16", "Windows", "Black");
        Acer_air6.addBrand(brandAcer);
        Laptop Acer_a313 = new Laptop("Acer_a313", 16, "FullHD", 
        true, 500, "8", "Windows", "Black");
        Acer_a313.addBrand(brandAcer);
// Создание множества
        Set <Laptop> laptop = new HashSet<>();
        laptop.add(HP_pailion_g6);      
        laptop.add(HP_galaxy_x64);
        laptop.add(Samsung_a52);
        laptop.add(Samsung_m31s);
        laptop.add(Lenovo_gtx76);
        laptop.add(Macbook_14pro);
        laptop.add(Asus_x515);
        laptop.add(Acer_air5);
        laptop.add(Acer_air6);
        laptop.add(Acer_a313);
// создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();
// вызов метода фильтрации по определеннеым параметрам
        // System.out.println("по вашему запросу найдено: " + FilterLaptop.filter(laptop));

// вызод метода фильтрации по заданным пользователем критериям
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}