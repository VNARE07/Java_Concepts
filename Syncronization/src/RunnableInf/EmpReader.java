package RunnableInf;

import SyncUtils.SyncUtils;

public class EmpReader implements Runnable{
    private SyncUtils u;
	private boolean exit;
	public EmpReader(SyncUtils u) {
		this.u=u;
	}

	@Override
	public void run() {
		System.out.println("started thrd  -- "
				+ Thread.currentThread().getName());
		try {
		
			while (!exit) {
			//	System.out.println("Read Data "+u.readData());
				u.read();
                // it waites but outside the monitor if we use sleep
				this.wait();
			}
		} catch (Exception e) {
			System.out.println("err in " + Thread.currentThread().getName()
					+ "  " + e);
		}
		System.out.println("thrd over -- " + Thread.currentThread().getName());
        // it unblocks the writer thread
        notify();
	}
	public void stop()
	{
        
		exit=true;
	}

}
