class B01 {
    public static void main(String[] args) {

        int bottlesInitial = 99;
        int bottles = bottlesInitial;

        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (bottles - 1) + " bottles of beer on the wall.");
            bottles--;

            if (bottles == 2) {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
                System.out.println(
                        "Take one down and pass it around, " + (bottles - 1) + " bottle of beer on the wall.");
                bottles--;
                System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println(
                        "Go to the store and buy some more, " + bottlesInitial + " bottles of beer on the wall.");
                break;
            }
        }
    }
}