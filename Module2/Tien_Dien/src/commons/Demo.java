package commons;

public class Demo {

    public enum JapanLevel {

        //SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY

        WINDOWS("N1", "N1", "N1", true),
        MAC_OS("N2", "N2", "N2", true),
        LINUX("N3", "N3", "N3", true),
        UBUNTU("N4", "N4", "N4", true),
        CHROME_OS("N5", "N5", "N5", true);

        private String id;
        private String name;
        private String shortName;
        private boolean status;

        JapanLevel(String id, String name, String shortName, boolean status) {
            this.id = id;
            this.name = name;
            this.shortName = shortName;
            this.status = status;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getShortName() {
            return shortName;
        }

        public boolean getStatus() {
            return status;
        }
    }

    public static void main(String[] args) {
        System.out.println(JapanLevel.LINUX.getName());
    }
}
