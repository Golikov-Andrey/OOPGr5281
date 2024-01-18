public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       iPublisher jobAgency = new JobAgency();

       Company google = new Company(jobAgency, "Google", 50);
       Company geekBrains = new Company(jobAgency, "GeekBrains", 100);

       Master ivanov = new Master("Ivanov");
       Junior sidorov = new Junior("sidorov");

       jobAgency.registerObserver(sidorov);
       jobAgency.registerObserver(ivanov);

       for(int i = 0; i<5;i++)
       {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
       }

       Student petrov = new Student("Petrov");
       jobAgency.registerObserver(petrov);

       for(int i = 0; i<5;i++)
       {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
       }
    }
}
