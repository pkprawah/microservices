package corejava;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer<String> {

	@Override
	public void accept(String map) {
		System.out.println("map ::" + map);
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
