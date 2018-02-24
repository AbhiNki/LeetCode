package level_easy;
/*Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */
public class NumebrToExcelColumn {

	public static void main(String[] args) {
		int number=5678;
		String res=getExcelColumn(number);
		System.out.println(res);

	}
	public static String getExcelColumn(int n)
	{
	StringBuilder result = new StringBuilder();

    while(n>0){
        n--;
        result.insert(0, (char)('A' + n % 26));
        n /= 26;
    }

    return result.toString();
	}
}
