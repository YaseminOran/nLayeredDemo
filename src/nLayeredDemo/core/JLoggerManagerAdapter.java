package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String messsage) {
		JLoggerManager manager= new JLoggerManager();
		manager.log(messsage);
		
	}

}
