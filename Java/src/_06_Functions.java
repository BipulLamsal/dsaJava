public class _06_Functions {
     class Check{
         //static method
        public static int sum(int a,int b)
        {
            return a + b;
        }
    }

    static class Check2{

         //nonstatic method
         public int sum(int a,int b)
         {
             return a + b;
         }
    }
    public static void main(String[] args) {
         Check2 sum2 = new Check2();
         int newSum = sum2.sum(40,50);
        int sum = Check.sum(10,20);
        System.out.println(sum);
        System.out.println(newSum);

        Student[] students = new Student[] {
                new Student("Morgan", "Freeman"),
                new Student("Brad", "Pitt"),
                new Student("Kevin", "Spacey"),
        };
        for (Student s : students) {
            s.printFullName();
        }

    }
}
class Student {
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printFullName() {
        System.out.println (this.firstName+" "+this.lastName);
    }
}

