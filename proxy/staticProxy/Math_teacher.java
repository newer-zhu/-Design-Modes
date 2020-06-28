package proxy.staticProxy;

public class Math_teacher implements Teacher {
    private PE_teacher teacher;

    public Math_teacher(PE_teacher teacher){
        this.teacher = teacher;

    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        teacher.teach();
        System.out.println("额外补课");
        System.out.println("代理结束");
    }
}
