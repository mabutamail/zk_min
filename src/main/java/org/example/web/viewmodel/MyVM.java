package org.example.web.viewmodel;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class MyVM {

	private int count;

	@Init
	public void init() {
		count = 100;
	}

	@Command
	@NotifyChange("count")
	public void cmd() {
		++count;
	}

	@Command
	@NotifyChange("method")
	public void method(){
		System.out.println("Запуск метода VM");
	}


	public int getCount() {
		return count;
	}
}
