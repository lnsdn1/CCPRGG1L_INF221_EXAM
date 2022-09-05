public class App {
    public static void main(String[] args) {

        // Character Class
        Character Student = new Character();

        Student.fullname = "Alen D. Osdaña";
        Student.surname = "Osdaña";
        Student.firstname = "Alen";
        Student.middleinitial = "D.";
        Student.dateofbirth = 2004;
        Student.studentnumber = 102804;
        Student.studentemailaddress = "osdanaad@students.national-u.edu.ph";
        Student.amiawesome = true;
        Student.sayMyStudentNumber();
        Student.sayMyEmailAddress();
        Student.sayamIawesome();
        Student.sayMysurname();
        Student.sayMyfirstname();
        Student.saymiddleinitial();
        Student.sayMyfullname();
        Student.sayMydateofbirth();
    }
}
