package PatternMatches;
public class PatternMatches {

	public static void main(String[] args) {
		boolean flag = false ;
		
		//email:[^@]+@[a-zA-Z0-9\\._\\-]+\\.[a-zA-Z]+
		
		//������X�G0912345678 / 0912-345-678�@�븹�X�G(02)23939889 / 02-2393-9889
		//[\\(]?[0-9]{1,2}[\\)\\-]?[0-9]{1,4}[\\-][0-9]{1,4}
//		String t1 = "[\\(\\)0-9\\- ]{6,}";
//		String t2 = "02-2393-9889";
		//����a�}�G\u4E00-\u9FFF,\u4E00-\u9FA5

		//���U�ͤ����� �B�J

		String t1 = "[0-9]{1,4}[\\-/]?[0-9]{1,2}[\\-/]?[0-9]{1,4}";
		String t2 = "1987-05-01";
		//�@�B����
		if(t2.matches(t1)){
			System.out.println("������T�A�U�@�B�O�H");
			flag = true ;
		}
		//���禨�ߡA�X�{����{�H�]�ڬO�����祿�T�Ӫ�{�^
		if(flag){
			System.out.println("���祿�T�A�i�H�i�J����");
		}else{
			System.out.println("not true");
		}

	}

}
