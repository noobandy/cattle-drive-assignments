class Hundred {

	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("Argument missing");
		} else {
			String name = args[0];

			int times = 80 / (name.length() + 1);
			int i = 0;
			while(i < 100) {
				for(int j = 0; j < times && i < 100; j++) {
					i++;
					System.out.print(name);
					System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}