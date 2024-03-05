package ToysShop;
public class Toy{
    public String name;
    public int ID;
    public int stock;
    public int probability;
    public char[] toString;

    @Override
    public String toString(){
        return "ID: " + ID + ", Игрушка: " + name;
    }
}