class basic_programming_constructs_46 {
    public static void main(String[] args) throws java.io.IOException {
        java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            System.out.print("Enter the total number of subjects: ");
            int totalSubjects = Integer.parseInt(input.readLine());

            if (totalSubjects <= 0) {
                System.out.println("Please enter a valid number of subjects.");
            } else {
                double totalCredits = 0;
                double totalGradePoints = 0;

                for (int i = 1; i <= totalSubjects; i++) {
                    System.out.print("Enter the credits for subject " + i + ": ");
                    double credits = Double.parseDouble(input.readLine());
                    System.out.print("Enter the grade points for subject " + i + ": ");
                    double gradePoints = Double.parseDouble(input.readLine());

                    totalCredits += credits;
                    totalGradePoints += (credits * gradePoints);
                }

                double cgpa = totalGradePoints / totalCredits;
                double percentage = cgpa * 9.5;

                System.out.println("CGPA: " + cgpa);
                System.out.println("Percentage: " + percentage + "%");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}