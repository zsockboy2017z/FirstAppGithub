/**
 * @(#)CNTTK37a.java
 *
 *
 * @author 
 * @version 1.00 2017/11/15
 */


public class CNTTK37a {

	private String hoTen;
	private int namSinh;
	
	public CNTTK37a(String ht, int ns)
	{
		hoTen= ht;
		namSinh= ns;
	}
    
	private void setHoTen(String hoTen){
		this.hoTen = hoTen;
	}

	private String getHoTen()){
		return this.hoTen;
	}

	public static void main(String[] args) {
		CNTTK37a a = new CNTTK37a();
		this.setHoTen("man");
		System.out.println(a.getHoTen);
	}
    
    
}