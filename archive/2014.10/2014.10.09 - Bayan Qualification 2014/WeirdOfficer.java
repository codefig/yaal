package net.egork;

import net.egork.misc.MiscUtils;
import net.egork.utils.io.InputReader;
import net.egork.utils.io.OutputWriter;

public class WeirdOfficer {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
		String name = in.readString();
		int numVowels = 0;
		for (char c : name.toCharArray()) {
			if (MiscUtils.isStrictVowel(c)) {
				numVowels++;
			}
		}
		if (numVowels % 2 == 0) {
			out.printLine("DOKHTAR");
		} else {
			out.printLine("PESAR");
		}
    }
}
