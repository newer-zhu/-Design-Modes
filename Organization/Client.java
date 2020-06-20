package Organization;

public class Client {
    public static void main(String[] args) {
        EduComponent university = new University("XXXX大学", "不争气");

        EduComponent machineCollege = new College("机械院", "制造业");
        EduComponent computeCollege = new College("计算机院", "牛逼");

        machineCollege.add(new Department("自动化","一般般"));
        machineCollege.add(new Department("机械设计与制造","垃圾"));
        computeCollege.add(new Department("软件工程","不错"));
        computeCollege.add(new Department("计算机科学与技术","好"));

        university.add(computeCollege);
        university.add(machineCollege);

        university.print();

    }
}
