package arraypra;

public class Foundation {
	
	class cat{
		int x;
		double y;
		cat (int x, double y){
			this.x = x;
			this.y = y;
		}
	}
	
	

	public static void main(String[] args) {
		// �R�A���R�W�G�����w��������
		//�Ѧ��ܼ�
		int array1 [] = new int []{1,2,3} ;
		int array2 [] = {6,7,8};
		//�ʺA���G���w��������
//		int array3 [] = new int [3];
		//ng:�ʺA�[�R�A
//		int array4 []= new int [4]{1,2,3,5};
		array2 = array1;
		for(int i = 0 ; i<array2.length ; i++){
			System.out.print(array2[i]+" ");
		}
		//javascript���}�C�O�i�H���ܤj�p��
		//e.g.
/*		var array = [];
		for(i=0;i<array.length;i++){
			document.writeln(array[i]);
		}
		array[4] = 5;
		for(i=0;i<array.length;i++){
			document.writeln(array[i]);
		}
		document.writeln("<br>");=undefined undefined undefined undefined 5 
		document.writeln(array.length);=5
		�|�L�Xundefined undefined undefined undefined 5 	*/
//		cat ttt = new cat (1, 2.5d);
//		cat tim1 = new cat(2 , 2.2d);
//		cat [] tim = new cat[2];
//		cat[0] = new cat(2,22.2);


	}

}
