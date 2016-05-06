package arraypra;

public class Pra1 {

	public static void main(String args[])
    {
        CC objC1 =  new CC();
        CC objC2 =  new CC(10); 
        CC objC3 =  new CC(3,5); 
        objC1.show();
        objC2.show();
        objC3.show();
    } 
}    

class CA
{
    protected int varA;
    public CA() { varA = 1;}
    public CA(int i) { varA = i;}
}

class CB extends CA   // ���OCB�~�Ӧ����OCA
{
    protected int varB;
    public CB() { varB = 1;}
    public CB(int i)
    {
        super(i);
        varB = i;
    }
}    

class CC extends CB   // ���OCC�~�Ӧ����OCB
{
    protected int varC;
    public CC() { varC = 1;}
    public CC(int i){ varC = i;}    
    public CC(int i,int j)
    {
        super(i*j);
        varC = i * j;
    }    
    public void show()
    {
        System.out.print("varA=" + varA + "\t");
        System.out.print("varB=" + varB + "\t");
        System.out.println("varC=" +varC);   	
    }
}
