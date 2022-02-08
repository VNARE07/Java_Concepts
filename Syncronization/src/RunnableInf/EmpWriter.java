package RunnableInf;

import SyncUtils.SyncUtils;
import SyncronizedTreading.Emp;

public class EmpWriter implements Runnable {
    private SyncUtils u;
	private boolean exit;
	public EmpWriter(SyncUtils u) {
		this.u = u;
	}
	@Override
	public void run() {
		System.out.println("started thrd  -- "
				+ Thread.currentThread().getName());
		try {
			int i = 1;
			while (!exit) {
				u.write(new Emp(i, "aa" + i));
				i++;
				this.wait();
			}
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName()
					+ "  " + e);
		}
		System.out.println("thrd over -- " + Thread.currentThread().getName());
        notify();
	}

	public void stop() {
		exit = true;
	}

}
