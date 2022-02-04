package Runnable;

import static java.lang.Thread.currentThread;
import static CollectionUtils.CollectionUtils.*;
import static IoUtils.IoUtils.*;
import java.util.HashMap;

import Com.Student;

public class DoBSorterTask implements Runnable {
	// state : non static , non transient data members => instance vars
	private HashMap<String, Student> map;
	private String fileName;

	public DoBSorterTask(HashMap<String, Student> map, String fileName) {
		super();
		this.map = map;
		this.fileName = fileName;
		System.out.println("in ctor invoked by : " + currentThread().getName());// main
	}

	@Override
	public void run() {
		System.out.println(currentThread().getName() + " strted ");
		try {
			// sort the students n store data
			storeData(sortbydate(map), fileName);
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " got err " + e);
		}
		System.out.println(currentThread().getName() + " over ");
	}

}
