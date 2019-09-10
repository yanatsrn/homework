package Z3;

public class Object {
    static class HashSet{
        public static void main(String[] args) {

            HashSet d = new HashSet();
            int x;

            x = (int) (Math.random() * (500 - (-500) + 1) + (-500));
            int border= (int)(Math.random() * (500 - (-500) + 1) + (-500));
            System.out.println(" border =  "+border);
            for (int i = 0; i < 10; i++) {
                d.add(x);
                x = (int) (Math.random() * (500 - (-500) + 1) + (-500));

                if(x>border){
                    System.out.print(x + " ");
                }



            }

        }

        private void add(int x) {
        }

    }
}
