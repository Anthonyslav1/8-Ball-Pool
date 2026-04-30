package util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NetworkUtil
{
	private static final Logger LOGGER = Logger.getLogger(NetworkUtil.class.getName());
	private Socket socket;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;

	public NetworkUtil(String s, int port) {
		try {
			this.socket=new Socket(s,port);
			oos=new ObjectOutputStream(socket.getOutputStream());
			ois=new ObjectInputStream(socket.getInputStream());
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error in NetworkUtil constructor", e);
		}
	}

	public NetworkUtil(Socket s) {
		try {
			this.socket = s;
			oos=new ObjectOutputStream(socket.getOutputStream());
			ois=new ObjectInputStream(socket.getInputStream());
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error in NetworkUtil constructor", e);
		}
	}

	public Object read() {
		Object o = null;
		try {
			o=ois.readObject();
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Reading Error in network", e);
		}
		return o;
	}

	public void write(Object o) {
		try {
			oos.writeObject(o);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Writing Error in network", e);
		}
	}

	public void closeConnection() {
		try {
			ois.close();
			oos.close();
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Closing Error in network", e);
		}
	}
	public void refresh()  {
		try {
			oos.reset();
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Refresh Error in network", e);
		}
	}
}
