package EnumDemo;

public enum DaysOfWeek {
    MONDAY("Poniedzialek") {
        public DaysOfWeek next() {
            return TUESDAY;
        }
    },
    TUESDAY("Wtorek") {
        public DaysOfWeek next() {
            return WEDNSDEY;
        }
    },
    WEDNSDEY("Sroda") {
        public DaysOfWeek next() {
            return THURSDAY;
        }
    },
    THURSDAY("Czwartek") {
        public DaysOfWeek next() {
            return FRIDAY;
        }
    },
    FRIDAY("Piatek") {
        public DaysOfWeek next() {
            return SATURDAY;
        }
    },
    SATURDAY("Sobota") {
        public DaysOfWeek next() {
            return SUNDAY;
        }
    },
    SUNDAY("Niedziela") {
        public DaysOfWeek next() {
            return MONDAY;
        }
    };
    private final String name;
    DaysOfWeek(String name) {
        this.name = name();
    }

    public abstract DaysOfWeek next();
}

