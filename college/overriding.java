class overr {
    void feature()     {
        System.out.println("mobile:cl sms");
    }
}

class smartphn extends overr{
    void feature() {
        System.out.println("smartphone:vdo cl");
    }
}

class testovrrid {
    public static void main(String[] args) {
        overr m = new overr();

        m.feature();

         overr s = new smartphn();
        s.feature();
    }
}
