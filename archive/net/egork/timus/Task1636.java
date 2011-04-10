package net.egork.timus;

import net.egork.arrays.ArrayUtils;
import net.egork.utils.io.inputreader.InputReader;
import net.egork.utils.solver.Solver;

import java.io.PrintWriter;

public class Task1636 implements Solver {
	public void solve(int testNumber, InputReader in, PrintWriter out) {
		int t1 = in.readInt();
		int t2 = in.readInt();
		t2 -= ArrayUtils.sumArray(in.readIntArray(10)) * 20;
		if (t1 > t2)
			out.println("Dirty debug :(");
		else
			out.println("No chance.");
	}
}
