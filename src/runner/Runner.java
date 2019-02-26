package runner;

import algo.SimpleSolver;
import algo.Solver;
import model.Problem;

public class Runner implements Runnable {

    private Problem problem;

    public Runner(Problem problem) {
	this.problem = problem;
    }

    @Override
    public void run() {
	/*
	 * potentially adjust to use other solver or more than one
	 */
	Solver solver = new SimpleSolver(problem);
	solver.compute();
    }

}
