package logicForHackNotts;
import java.util.*;

public class RichList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("1. Jeff Bearzos: $183bn");
		list.add("2. Elion Musk: $136bn");
		list.add("3. Krill Gates: $129bn");
		list.add("4. Mark Zucowberg: $106bn");
		list.add("5. Bernard Arnewt: $105bn");
		list.add("6. Warren Buffalo: $88.4bn");
		list.add("512. Meowly Cyrus: $10bn");
		list.add("10,213. Geese Witherspoon: $100m");
		list.add("940,213. Llama Del Rey: $20m");
		list.add("26,120,325. Justin Timbersnake: $2.5m");
		list.add("701,132,431. Nutty Squirrelson: $300,000");
		list.add("959,430,005. Barry Turtle: $100,000");
		list.add("1,402,123,230. Crocker Dyle: $25,000");
		list.add("1,501,231,412. Saddington: $15,000");
		list.add("5,103,410,210. Barry Birb: $0");

		String name = "Hedgey the Hedgehog: ";
		long money = 300_200l;
		String moneyS = "$"+Long.toString(money);
		if(money<183_000_000_000l) {
			System.out.println(list.get(0));
			if(money>136_000_000_000l) {
				System.out.println("2. "+name+moneyS);
				System.out.println("3. Elion Musk: $136bn");
			}else if(money>129_000_000_000l) {
				System.out.println(list.get(1));
				System.out.println("3. "+name+moneyS);
			}else if(money>106_000_000_000l) {
				System.out.println(list.get(2));
				System.out.println("4. "+name+moneyS);
			}else if(money>105_000_000_000l) {
				System.out.println(list.get(3));
				System.out.println("5. "+name+moneyS);
			}else if(money>88_400_000_000l) {
				System.out.println(list.get(4));
				System.out.println("6. "+name+moneyS);
			}else if(money>10_000_000_000l) {
				System.out.println(list.get(5));
				System.out.println("7. "+name+moneyS);
			}else if(money>100_000_000l) {
				System.out.println(list.get(6));
				System.out.println("8. "+name+moneyS);
			}else if(money>20_000_000l) {
				System.out.println(list.get(7));
				System.out.println("9. "+name+moneyS);
			}else if(money>2_500_000l) {
				System.out.println(list.get(8));
				System.out.println("10. "+name+moneyS);
			}else if(money>300_000l) {
				System.out.println(list.get(9));
				System.out.println(name+moneyS);
			}else if(money>100_000l) {
				System.out.println(list.get(10));
				System.out.println(name+moneyS);
			}else if(money>25_000l) {
				System.out.println(list.get(11));
				System.out.println(name+moneyS);
			}else if(money>15_000l) {
				System.out.println(list.get(12));
				System.out.println(name+moneyS);
			}else if(money>0l) {
				System.out.println(list.get(13));
				System.out.println(name+moneyS);
			}else {
				System.out.println(list.get(14));
				System.out.println(name+moneyS);
			}
		}
	}
}
