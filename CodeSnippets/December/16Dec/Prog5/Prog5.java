

class Parent {

        int num = 5;
        int m1(int i) {

                return num + i;
        }
}

class Child extends Parent {

        int m2() {

                return 5;
        }

        public static void main(String[] args) {

                Child c = new Parent();

                System.out.println(c.m1(c.m2()));
        }
}

/*
 * error: incompatible types: Parent cannot be converted to Child
 */
