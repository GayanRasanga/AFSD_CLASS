public class Demo7 {
    public static void main(String[] args) {
      Student student1 = new Student();
      student1.setAge(12);
      student1.setIsdrink(false);
      student1.setName("Gayan");
      //Not trust this object
      Student student2 = new Student();
      student2.setName("Rasanga");
      student2.setAge(97);
      student2.setJob("Manager");
      student2.setJavaMark(12.5);

      System.out.println(student2.getJavaMark() +" "+student2.getAge());


    }
}
