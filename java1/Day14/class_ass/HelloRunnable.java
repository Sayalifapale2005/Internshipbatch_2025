package Day14;


class HelloRunnable implements Runnable{
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello ");
			}
		}


	public static void main(String[] args) {
		HelloRunnable h= new HelloRunnable();
		Thread t= new Thread(h);
		t.start();

	}

}
