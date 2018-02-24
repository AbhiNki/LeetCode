package level_easy;

public class ExcelColumnToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String column="AA";
		int number=getExcelColToNum(column);
		System.out.println(number);
	}
	public static int getExcelColToNum(String col)
	{
		int result=0;
		for(int i=0;i<col.length();i++)
		{
			result=result*26+(col.charAt(i)-'A'+1);
		}
		return result;
	}

}
