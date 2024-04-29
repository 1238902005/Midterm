package midterm.mariam_mushkudiani_5.task1;


public class Fantasy extends AbstractFantasy implements Dream {

    private String MariamMushkudiani;

    public Fantasy(String studentName) {
        this.studentName = studentName;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Fantasy Details:\n");
        result.append("Student Name: ").append(studentName).append("\n");

        return result.toString();
    }

   
}

