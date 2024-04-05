public class Main {
        public static void main(String[] args) {
                System.out.println("task1");

                int age = 16;

                if (age >= 18) {

                        System.out.printf("Если возраст человека равен %d, он совершеннолетний", age);
                } else {

                        System.out.printf("Если возраст человека равен %d, он несовершеннолетний\n", age);
                }

                System.out.println("\ntask2");

                int degrees = 8;

                if (degrees < 5) {
                        System.out.printf("На улице %s градусов, на улице холодно, нужно надеть шапку", degrees);
                } else {

                        System.out.printf("На улице %s градусов, сегодня тепло, можно идти без шапки\n", degrees);
                }

                System.out.println("\ntask3");

                int speed = 70;

                if (speed > 60) {
                        System.out.printf("Если скорость %s, то придется заплатить штраф\n", speed);
                } else {

                        System.out.printf("Если скорость %s, то можно ездить спокойно", speed);
                }

                System.out.println("\ntask4");

                int age1 = 3;

                if (age1 >= 2 && age1 <= 6) {
                        System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детский сад\n", age1);

                        int age3 = 14;

                        if (age3 >= 7 && age3 <= 17) {
                                System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу\n", age3);
                        }

                        int age2 = 25;

                        if (age2 >= 18 && age2 <= 24) {
                                System.out.printf("Если возраст человека равен %s,то его место в универе", age2);
                        } else {
                                if (age2 > 24) {
                                        System.out.printf("Если возраст человека равен %s, то ему пора ходить на работу\n", age2);
                                }

                                System.out.println("\ntask5");

                                int childrenAge = 12;

                                if (childrenAge < 5) {
                                        System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе", childrenAge);
                                } else if (childrenAge > 4 && childrenAge < 14) {
                                        System.out.printf("Если возраст ребенка равен %s, то он может кататься только в сопровождении взрослого," +
                                                "если взрослого нет, то кататься нельзя\n", childrenAge);
                                } else if (childrenAge > 14) {
                                        System.out.printf("Если возраст ребенка равен &s,то он может кататься без сопровождения взрослого", childrenAge);
                                }
                                System.out.println("\ntask6");
                                int human = 49;

                                if (human < 60) {
                                        System.out.printf("Если количество человек равно %s,то в вагоне есть сидячие места\n", human);
                                } else if (human > 60 && human < 102) {
                                        System.out.printf("Если количество человек равно %s,то в вагоне есть стоячие места", human);
                                } else if (human >= 102) {
                                        System.out.printf("Если количество человек равно %s,то вагон полностью забит", human);
                                }
                                System.out.println("\ntask7");

                                int one = 9;
                                int two = 2;
                                int three = 3;

                                boolean oneIsBiggest = one > two && one > three;
                                boolean twoIsBiggest = two > one && two > three;

                                if (oneIsBiggest) {
                                        System.out.println("Число один - наибольшее из всех.");
                                } else if (twoIsBiggest) {
                                        System.out.println("Число два - наибольшее из всех.");
                                } else
                                        System.out.println("Число три - наибольшее из всех.");
                        }
                }
        }
}
