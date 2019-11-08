
//    TechnoStudy Inc, [15.10.19 20:17]
////    public class Test {
////        public
////        static void main(String[] args)
////        {
////            int x = 10, y = 20;
////            if (x < y) {
////                if (x > y) {
////                    System.out.println("HELLO TECHNO");
////                } else {
////                    System.out.println("WELCOME");
////                }
////            }
////        }
////    }
//////Output:
//////1. HELLO TECHNO
//////2. Compile time error
//////3. WELCOME
//////4. No Output
//
//    TechnoStudy Inc, [15.10.19 20:32]
//    public static void main(String[] args)
//    {
//        String day = "Sunday";
//        switch (day) {
//            case "Monday":
//                System.out.println("Let's Work");
//                break;
//            case "Saturday":
//                System.out.println("waiting for Sunday");
//                break;
//            case "Sunday":
//                System.out.println("Today is fun day");
//        }
//    }
//
//    TechnoStudy Inc, [15.10.19 21:03]
////    class MainClass {
////        public static void main(String[] args)
////        {
////            int x = 10;
////            int y = 20;
////            switch (x) {
////                case 10:
////                    System.out.println("HELLO");
////                    break;
////                case y:
////                    System.out.println("TECHNO");
////                    break;
////            }
////        }
////    }
//////Options:
//////1. HELLO
//////2. No Output
//////3. TECHNO
//////4. Compile time error
//
//    TechnoStudy Inc, [15.10.19 21:08]
////    class MainClass {
////        public static void main(String[] args)
////        {
////            int x = 10;
////            final int y = 20;
////            switch (x) {
////                case 10:
////                    System.out.println("HELLO");
////                    break;
////                case y:
////                    System.out.println("TECHNO");
////                    break;
////            }
////        }
////    }
//////Options:
//////1. TECHNO
//////2. Compile time error
//////3. HELLO
//////4. NO Output
//
//    TechnoStudy Inc, [15.10.19 21:14]
//    static void main(String[] args)
//    {
//        int x = 10;
//        switch (x + 1 + 1) {
//            case 10:
//                System.out.println("HELLO");
//                break;
//            case 10 + 1 + 1:
//                System.out.println("TECHNO");
//                break;
//        }
//    }
//
//    TechnoStudy Inc, [15.10.19 21:19]

package mainpac;

public class jay8 {
    public static void main(String arg[])
    {
        char stream = 'C';
        int x = 2;

        switch (x) {
            case 1:
                System.out.println("SCIENCE, MATHS, PHYSICS");
                break;
            case 2:
                switch (stream) {
                    case 'A':
                        System.out.println("Welcome");
                        break;
                    case 'C':
                        System.out.println("TechnoStudy");
                        break;
                    case 'B':
                        System.out.println("Have a nice day");
                        break;
                }
                break;
            case 3:
                switch (stream) {
                    case 'C':
                        System.out.println("Welcome");
                        break;
                    case 'D':
                        System.out.println("In");
                        break;
                    case 'E':
                        System.out.println("GFG");
                        break;
                }
                break;
        }
    }
}
