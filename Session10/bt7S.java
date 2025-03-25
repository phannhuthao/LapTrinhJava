package Session10;

public class bt7S {
    class Student {
        private String name;
        private String id;
        private double GPA;

        public Student(String name, String id, double GPA) {
            this.name = name;
            this.id = id;
            this.GPA = GPA;
        }

        public String getDetails() {
            return "Tên: " + name + ", Mã SV: " + id + ", GPA: " + GPA;
        }
    }

    class GraduateStudent extends Student {
        private String researchTopic;
        private String supervisorName;

        public GraduateStudent(String name, String id, double GPA, String researchTopic, String supervisorName) {
            super(name, id, GPA);
            this.researchTopic = researchTopic;
            this.supervisorName = supervisorName;
        }

        public String getDetails() {
            return super.getDetails() + ", Đề tài: " + researchTopic + ", GVHD: " + supervisorName;
        }
    }
}
