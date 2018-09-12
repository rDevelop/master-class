package us.rlit.oop.polymorph;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "no plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "Jaws eats People";
    }
}

class Warriors extends Movie {
    public Warriors() {
        super("Warriors");
    }

    @Override
    public String plot() {
        return "Bad boys run from Cyrus gangs.";
    }
}


class Twilight extends Movie {
    public Twilight() {
        super("Twilight");
    }

    @Override
    public String plot() {
        return "Vampire love story.";
    }
}


class Starwars extends Movie {
    public Starwars() {
        super("Starwars");
    }

    @Override
    public String plot() {
        return "Luke vs Vadar.";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }

    // no plot for polymorphism
}

class Poly {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            // Polymorph movies into sub classes
            // Unique functionality from base classes
            System.out.println("Movie # " + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new Warriors();
            case 3:
                return new Twilight();
            case 4:
                return new Starwars();
            case 5:
                return new Forgettable();

        }
        return null;
    }
}


