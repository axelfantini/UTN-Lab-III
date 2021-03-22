package lab3.tpobjects1.exercises.exercise3.models;

public class SaleItem {
    private int Id;
    private String Description;
    private int Count;
    private double UnitaryPrice;

    public SaleItem(int id, String description, int count, double unitaryPrice) {
        Id = id;
        Description = description;
        Count = count;
        UnitaryPrice = unitaryPrice;
    }

    public int GetId() {
        return Id;
    }

    public void SetId(int id) {
        Id = id;
    }

    public String GetDescription() {
        return Description;
    }

    public void SetDescription(String description) {
        Description = description;
    }

    public int GetCount() {
        return Count;
    }

    public void SetCount(int count) {
        Count = count;
    }

    public double GetUnitaryPrice() {
        return UnitaryPrice;
    }

    public void SetUnitaryPrice(float unitaryPrice) {
        UnitaryPrice = unitaryPrice;
    }

    public double GetTotalPrice()
    {
        return UnitaryPrice * Count;
    }

    public void PrintSaleItem()
    {
        System.out.println("SaleItem[Id= " + this.Id + ", Description= " + this.Description + ", Count= " + this.Count + ", Unitary Price= " + this.UnitaryPrice + ", Total Price= " + this.GetTotalPrice() + "]");
    }
}
