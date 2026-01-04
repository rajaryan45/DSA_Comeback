package com.string;

public class LengthOfLastWord {
	public int lengthOfLastWord(String s) {
		String str = s.stripTrailing();
		String[] parts = s.split(" ");
		return parts[parts.length - 1].length();
	}
}
