package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Sample07 {

    /**
     �������� ������

     ���������� �������������� ������ ������� ��� �������� ������� ��������.

     �. �������� ������ (��������, �������� ���������, ��������� �����,
     ������ � ���������, ���������� ����������, ..), � ���� ������ ����� � ��������.
     b. ������������ ���������� ������-������ (��������������) ����������� ��� ���������� ���� �������.
     */
    public static void main(String[] args) {

    }
}

/* ��������� �������� �������� ������: ������������� (id), ��� (LastName), �������� (FirstName), ������� (Phone), ���������� ����� (Salary)
������+ ������ ��� ��������. ��������. ������ ��� ��������������, �����, ��������.
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


 /* ������� �������� ������: ��� ������ (id), ������������ (ProductName), ���� (ProductPrice), ���� ������������ (DateOfManufactureate)
 ������+������ ��� ������������, ����, ���� ������������. ������ ��� ���� ������.
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


/* �������� �������� �����������: ����������, ������� ( ������� ��������� �������).
 */
class Company {
    private final Collection<Manager> managers = new ArrayList<Manager>();
    private final Collection<Product> productsCollections = new ArrayList<Product>();
}

/* ReportTable �� ������ GenerationReport � ������� ���������� ������� ������� Exel
 */
class ReportTable{
    public ReportTable( GenerationReport generationReport){
    }
    /* ��� ���������, ������� �� ������ GenerationReport ������� ������� Exel � ������� �� �����
     */
}

/* ReportFile �� ������ GenerationReport � ������� ���������� ������� �����-�� ��������� ���� ������
 */
class ReportFile{
    public ReportFile( GenerationReport generationReport){
    }
    /* ��� ���������, ������� �� ������ GenerationReport ������� ��������� ���� � ������� �� �����
     */
}

/* ReportGraph �� ������ GenerationReport � ������� ���������� ������� ������ ������
 */
class ReportGraph{
    public ReportGraph( GenerationReport generationReport){
    }
    /* ��� ���������, ������� �� ������ GenerationReport ������� ����������� ����������� � ������� �� �����
     */
}

/* ��������� ������� ����� ������ � ���� ������ (SalesBase)  � ����� ����� ���������� ������ �������� ����� ��������.
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

/* ���� ������ �������� ������: ����� �� ������� (Id), ������� (counter), ���������� ��������� ������ (ItemsSold),
Id ���������� ��������� (ManagerId), Id �������� (ProductId), ���� ������� (DateOfSale).
������+ ������ ��� ���������, ��������, ���������� ��������� ������. ������ ��� ���� � ������ �� �������.
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