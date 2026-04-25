package questions;

import java.util.Scanner;

public class gemoetrycalculator {

    // ---------- Area Methods ----------
    static double areaCircle(double r) {
        return Math.PI * r * r;
    }

    static double areaTriangle(double b, double h) {
        return 0.5 * b * h;
    }

    static double areaRectangle(double l, double w) {
        return l * w;
    }

    static double areaIsoscelesTriangle(double b, double h) {
        return 0.5 * b * h;
    }

    static double areaParallelogram(double b, double h) {
        return b * h;
    }

    static double areaRhombus(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    static double areaEquilateralTriangle(double side) {
        return (Math.sqrt(3) / 4) * side * side;
    }

    // ---------- Perimeter Methods ----------
    static double perimeterCircle(double r) {
        return 2 * Math.PI * r;
    }

    static double perimeterEquilateralTriangle(double side) {
        return 3 * side;
    }

    static double perimeterParallelogram(double l, double w) {
        return 2 * (l + w);
    }

    static double perimeterRectangle(double l, double w) {
        return 2 * (l + w);
    }

    static double perimeterSquare(double side) {
        return 4 * side;
    }

    static double perimeterRhombus(double side) {
        return 4 * side;
    }

    // ---------- Volume Methods ----------
    static double volumeCone(double r, double h) {
        return (Math.PI * r * r * h) / 3;
    }

    static double volumePrism(double baseArea, double h) {
        return baseArea * h;
    }

    static double volumeCylinder(double r, double h) {
        return Math.PI * r * r * h;
    }

    static double volumeSphere(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    static double volumePyramid(double baseArea, double h) {
        return (baseArea * h) / 3;
    }

    // ---------- Surface Area Methods ----------
    static double curvedSurfaceAreaCylinder(double r, double h) {
        return 2 * Math.PI * r * h;
    }

    static double totalSurfaceAreaCube(double side) {
        return 6 * side * side;
    }

    // ---------- Main Menu ----------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Geometry Calculator =====");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Isosceles Triangle");
            System.out.println("5. Area of Parallelogram");
            System.out.println("6. Area of Rhombus");
            System.out.println("7. Area of Equilateral Triangle");
            System.out.println("8. Perimeter of Circle");
            System.out.println("9. Perimeter of Equilateral Triangle");
            System.out.println("10. Perimeter of Parallelogram");
            System.out.println("11. Perimeter of Rectangle");
            System.out.println("12. Perimeter of Square");
            System.out.println("13. Perimeter of Rhombus");
            System.out.println("14. Volume of Cone");
            System.out.println("15. Volume of Prism");
            System.out.println("16. Volume of Cylinder");
            System.out.println("17. Volume of Sphere");
            System.out.println("18. Volume of Pyramid");
            System.out.println("19. Curved Surface Area of Cylinder");
            System.out.println("20. Total Surface Area of Cube");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area of Circle = " + areaCircle(r));
                }
                case 2 -> {
                    System.out.print("Enter base and height: ");
                    double b = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Area of Triangle = " + areaTriangle(b, h));
                }
                case 3 -> {
                    System.out.print("Enter length and width: ");
                    double l = sc.nextDouble(), w = sc.nextDouble();
                    System.out.println("Area of Rectangle = " + areaRectangle(l, w));
                }
                case 4 -> {
                    System.out.print("Enter base and height: ");
                    double b = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Area of Isosceles Triangle = " + areaIsoscelesTriangle(b, h));
                }
                case 5 -> {
                    System.out.print("Enter base and height: ");
                    double b = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Area of Parallelogram = " + areaParallelogram(b, h));
                }
                case 6 -> {
                    System.out.print("Enter diagonals d1 and d2: ");
                    double d1 = sc.nextDouble(), d2 = sc.nextDouble();
                    System.out.println("Area of Rhombus = " + areaRhombus(d1, d2));
                }
                case 7 -> {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Area of Equilateral Triangle = " + areaEquilateralTriangle(side));
                }
                case 8 -> {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Perimeter of Circle = " + perimeterCircle(r));
                }
                case 9 -> {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Perimeter of Equilateral Triangle = " + perimeterEquilateralTriangle(side));
                }
                case 10 -> {
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble(), w = sc.nextDouble();
                    System.out.println("Perimeter of Parallelogram = " + perimeterParallelogram(l, w));
                }
                case 11 -> {
                    System.out.print("Enter length and breadth: ");
                    double l = sc.nextDouble(), w = sc.nextDouble();
                    System.out.println("Perimeter of Rectangle = " + perimeterRectangle(l, w));
                }
                case 12 -> {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Perimeter of Square = " + perimeterSquare(side));
                }
                case 13 -> {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Perimeter of Rhombus = " + perimeterRhombus(side));
                }
                case 14 -> {
                    System.out.print("Enter radius and height: ");
                    double r = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Volume of Cone = " + volumeCone(r, h));
                }
                case 15 -> {
                    System.out.print("Enter base area and height: ");
                    double baseArea = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Volume of Prism = " + volumePrism(baseArea, h));
                }
                case 16 -> {
                    System.out.print("Enter radius and height: ");
                    double r = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Volume of Cylinder = " + volumeCylinder(r, h));
                }
                case 17 -> {
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Volume of Sphere = " + volumeSphere(r));
                }
                case 18 -> {
                    System.out.print("Enter base area and height: ");
                    double baseArea = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Volume of Pyramid = " + volumePyramid(baseArea, h));
                }
                case 19 -> {
                    System.out.print("Enter radius and height: ");
                    double r = sc.nextDouble(), h = sc.nextDouble();
                    System.out.println("Curved Surface Area of Cylinder = " + curvedSurfaceAreaCylinder(r, h));
                }
                case 20 -> {
                    System.out.print("Enter side: ");
                    double side = sc.nextDouble();
                    System.out.println("Total Surface Area of Cube = " + totalSurfaceAreaCube(side));
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
        sc.close();
    }
}

