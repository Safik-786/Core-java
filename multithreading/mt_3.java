package multithreading;

class theatre extends Thread {
    int Avail_seat = 10;

    void book(int seat) {
        if (seat <= Avail_seat) {
            System.out.println(seat + "seat booked");
            Avail_seat = Avail_seat - seat;
            System.out.println("rest seat are" + Avail_seat);
        } else {
            System.out.println("seat cant booked");
            System.out.println("seat left:" + Avail_seat);
        }
    }
}

class movieBookApk extends theatre {
    static theatre th;
    int seats;

    @Override
    public void run() {
        th.book(seats);
    }

    public static void main(String[] args) {
        th = new theatre();
        movieBookApk safik = new movieBookApk();
        safik.seats = 8;
        safik.start();
        movieBookApk amit = new movieBookApk();
        amit.seats = 6;
        amit.start();
    }
}
