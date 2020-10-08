class Clock {
	public static void main(String[] args) throws InterruptedException {
		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				for (int second = 0; second < 60; second++) {
					for (int milliSecond = 0; milliSecond < 1000; milliSecond++) {
						System.out.println(hour + ":" + minute + ":" + second + ":" + milliSecond );
						Thread.sleep(1);
					}
				}
			}
		}
	}
}