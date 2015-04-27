package pl.foxrafi.scjp;

import java.io.IOException;

class One implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new IOException("Closing");
	}

}
