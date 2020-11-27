

class Core2Web {

        Core2Web() {

                System.out.println("In default...");
        }

        Core2Web(int a) {

		this();
                System.out.println("In parametrised...");
        }

        public static void main(String[] args) {

                new Core2Web(10);
        }
}

/*
 * Output
 *
 * In default...
 * In parametrised...
 *
 */
