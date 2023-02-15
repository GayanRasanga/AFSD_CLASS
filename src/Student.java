public class Student {
    private String name;
    private int age;
    private String job;
    private double javaMark;
    private boolean isdrink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 100) {
            this.age = age;
        }else {
            System.out.println("Pls Enter Valid Age");
        }
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getJavaMark() {
        return javaMark;
    }

    public void setJavaMark(double javaMark) {
        this.javaMark = javaMark;
    }

    public boolean isIsdrink() {
        return isdrink;
    }

    public void setIsdrink(boolean isdrink) {
        this.isdrink = isdrink;
    }
}
