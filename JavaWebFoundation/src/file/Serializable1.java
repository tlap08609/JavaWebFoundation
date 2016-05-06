package file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializable1 {

	public static void main(String args[]) throws IOException
    {
        FileOutputStream fo = new FileOutputStream("c:\\_Java\\serial1.tmp");
        ObjectOutputStream oos = new ObjectOutputStream(fo); 
       
        oos.writeObject(new CMyStudent("S0403501","���j��",89,84,75));
        oos.writeObject(new CMyStudent("S0403502","���p��",77,69,87));
        oos.writeObject(new CMyStudent("S0403503","�J�p�s",65,68,77));
        
        oos.close();        
        fo.close();       //����
    } 
}

class CMyStudent1 implements Serializable   //CMyStudent��@Serializable����
{
    private String id;
    private String name;
    private int scoreComputer;
    private int scoreMath;
    private int scoreEnglish;
    private int scoreSum;
    
    public CMyStudent1(String str1,String str2,int i,int j,int k)
    {
        id = str1;
        name = str2;
        scoreComputer = i;
        scoreMath = j;
        scoreEnglish = k;
        computeSum();
    }
    public void computeSum() 
    {
        scoreSum = scoreComputer + scoreMath + scoreEnglish;
    }
    public void printSum()
    {
        //�űԭz
    }    
}