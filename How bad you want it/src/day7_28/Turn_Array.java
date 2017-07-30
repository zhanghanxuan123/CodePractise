package day7_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turn_Array {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(4);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.add(1);
		int start = 0, end = 0;// 2 1 3 4
		while (start < arrayList.size()-1) {
			end = start + 1;
			if (arrayList.get(start) > arrayList.get(end)) {
				while (end < arrayList.size()) {
					if (arrayList.get(start) > arrayList.get(end)) {
						
					}else {
						System.out.println("start:" + start + "/" + "end:" + (end-1));
						end = arrayList.size();
						break;
					}
					end++;
				}
			}
			start++;
		}
		
	}
}
