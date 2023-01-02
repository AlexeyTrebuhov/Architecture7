package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Sample07 {

    /**
     ДОМАШНЯЯ РАБОТА

     Необходимо спроектировать сервис отчётов для компании оптовой торговли.

     а. Доменная модель (компания, товарные категории, табличный отчёт,
     рафики и диаграммы, финансовые показатели, ..), в виде текста Домен – атрибуты.
     b. Сформировать компоненты бизнес-логики (функциональные) необходимые для построения этих отчётов.
     */
    public static void main(String[] args) {

    }
}

/* Продажный менеджер обладает полями: идентификатор (id), имя (LastName), отчество (FirstName), телефон (Phone), заработная плата (Salary)
Геттер+ сеттер для телефона. зарплаты. Геттер для идентификатора, имени, отчества.
 */
class Manager {
    private int id;
    private String LastName;
    private String FirstName;
    private double Salary;

    public int getId() {
        return id;
    }

    public String getLastName() {
        return LastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    private String Phone;

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }


 }


 /* Продукт обладает полями: код товара (id), наименование (ProductName), цена (ProductPrice), дата производства (DateOfManufactureate)
 Геттер+сеттер для наименования, цены, даты производства. Геттер для кода товара.
 */
class Product {
    private int id;
    private String ProductName;
     private double ProductPrice;



     private Date DateOfManufactureate;

     public String getProductName() {
         return ProductName;
     }

     public void setProductName(String productName) {
         ProductName = productName;
     }

     public double getProductPrice() {
         return ProductPrice;
     }

     public void setProductPrice(double productPrice) {
         ProductPrice = productPrice;
     }

     public Date getDateOfManufactureate() {
         return DateOfManufactureate;
     }

     public void setDateOfManufactureate(Date dateOfManufactureate) {
         DateOfManufactureate = dateOfManufactureate;
     }

     public int getId() {
         return id;
     }
    }


/* Компания обладает коллекциями: Менеджеров, Товаров ( которые менеджеры продают).
 */
class Company {
    private final Collection<Manager> managers = new ArrayList<Manager>();
    private final Collection<Product> productsCollections = new ArrayList<Product>();
}

/* ReportTable на основе GenerationReport с помощью фреймворка создает таблицу Exel
 */
class ReportTable{
    public ReportTable( GenerationReport generationReport){
    }
    /* Тут фреймворк, который на основе GenerationReport создает таблицу Exel и выводит на экран
     */
}

/* ReportFile на основе GenerationReport с помощью фреймворка создает какой-то текстовый файл отчета
 */
class ReportFile{
    public ReportFile( GenerationReport generationReport){
    }
    /* Тут фреймворк, который на основе GenerationReport создает текстовый файл и выводит на экран
     */
}

/* ReportGraph на основе GenerationReport с помощью фреймворка создает график отчета
 */
class ReportGraph{
    public ReportGraph( GenerationReport generationReport){
    }
    /* Тут фреймворк, который на основе GenerationReport создает графическое изображение и выводит на экран
     */
}

/* Генератор отчетов имеет доступ к базе продаж (SalesBase)  и имеет метод передавать список товарных групп компании.
 */
class GenerationReport {
    public GenerationReport(SalesBase salesBase) {
    }

    public Collection<SalesBase> searchSalesBase(int id, Date DateOfSale) {

        Collection<SalesBase> salesBases = new ArrayList<>();

            if (id == SalesBase.getProductId() && SalesBase.getDateOfSale().equals(DateOfSale))
                SalesBase.add(SalesBase.getProductId());
            return salesBases;


    }
}

/* База продаж обладает полями: номер по порядку (Id), счетчик (counter), количество проданных единиц (ItemsSold),
Id продажного менеджера (ManagerId), Id продукта (ProductId), дата продажи (DateOfSale).
Геттер+ сеттер для менеджера, продукта, количества проданных единиц. Геттер для даты и номера по порядку.
 */
 class SalesBase{
    private static int counter;

    public static void add(int productId) {

    }

    public int getId() {
        return id;
    }
    private int ItemsSold;
    private int ManagerId;
    private static int ProductId;
    private static Date DateOfSale;

    public static Date getDateOfSale() {
        return DateOfSale;
    }

    private final int id;
    {
        id = ++counter;
    }

    public int getItemsSold() {
        return ItemsSold;
    }

    public void setItemsSold(int itemsSold) {
        ItemsSold = itemsSold;
    }

    public int getManagerId() {
        return ManagerId;
    }

    public void setManagerId(int managerId) {
        ManagerId = managerId;
    }

    public static int getProductId() {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }
}