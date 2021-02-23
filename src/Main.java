public static void main(String[] args) {
Student student1 = new Student("student1", "2222", "st1@gmail.com");
StudentSearch search = new StudentSearch();
ArrayList<Student> students = new ArrayList<Student>();
students.add(student1);
try {
System.out.println(search.findOne(students, "student1").getId());
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
