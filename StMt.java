package Claa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringMatch {
	String str;

	StringMatch(String str) {
		this.str = str;
	}

	public int numberOfOccurence(char x) {
		int n = 0;

		char[] L = this.str.toCharArray();
		for (int i = 0; i < this.str.length(); i++) {
			if (x == L[i])
				n++;
		}
		return n;
	}

	public String getMaxSubStr(int len) {
		ArrayList<String> c = new ArrayList<String>();
		ArrayList<String> ch = new ArrayList<String>();
		int cnt = 0, max = 0;
		String s = new String();

		// 找到每个元素相同的所有子字符串
		Pattern p = Pattern.compile("(.)\\1+");
		Matcher m = p.matcher(str);
		while (m.find()) {
			c.add(m.group());
		}

		// 找到长度为len的子字符串并排序
		if (c.size() != 0) {
			for (int index = 0; index < c.size(); index++) {
				if (c.get(index).length() == len) {
					ch.add(c.get(index));
				}
			}
			Collections.sort(ch);
		}
		if (ch.isEmpty())
			s = null;
		else if (ch.size() == 1)
			s = ch.get(0);
		else {
			for (int j = 0; j < ch.size(); j++) {
				for (int k = j + 1; k < ch.size(); k++) {
					if (ch.get(j) == ch.get(k))
						cnt++;
				}
				if (cnt > max)
					max = cnt;
			}
			s = ch.get(max);
		}
		return s;
	}

}

public class StMt {
	public static void main(String[] args) {
		StringMatch m = new StringMatch("ccbbbaadef");
		System.out.println(m.numberOfOccurence('a'));// 2
		m.getMaxSubStr(2);// aa
		m.getMaxSubStr(3); // bbb
		m.getMaxSubStr(4);// 空
	}
}
