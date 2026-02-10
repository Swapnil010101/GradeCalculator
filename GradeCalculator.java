public class GradeCalculator {

    // Calculates percentage: (score / total) * 100
    public double calculatePercentage(double score, double total) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total possible marks must be greater than zero");
        }
        return (score / total) * 100.0;
    }

    // Determines letter grade based on percentage
    public String getLetterGrade(double percentage) {
        if (percentage < 0 || percentage > 100) {
            throw new IllegalArgumentException("Percentage must be between 0 and 100");
        }
        
        if (percentage >= 90) return "A";
        if (percentage >= 80) return "B";
        if (percentage >= 70) return "C";
        if (percentage >= 60) return "D";
        return "F";
    }
}
