class Sports {
    public String play() {
        return "sport";
    }
}

class Football extends Sports {
    @Override
    public String play() {
        return "football";
    }
}

class Basketball extends Sports {
    @Override
    public String play() {
        return "basketball";
    }
}

class Rugby extends Sports {
    @Override
    public String play() {
        return "rugby";
    }
}