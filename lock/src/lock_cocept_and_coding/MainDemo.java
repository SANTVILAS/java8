package lock_cocept_and_coding;

public class MainDemo {

public static void main(String[] args) {
	SharedResouces resouce1 = new SharedResouces();
	
	Thread th1 = new Thread(()->{
		
		resouce1.producer();
		
	});
	
	
SharedResouces resouce2 = new SharedResouces();
	
	Thread th2 = new Thread(()->{
		
		resouce2.producer();
		
	});
	
	
	th1.start();
	th2.start();
}
}


