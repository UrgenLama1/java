class Calculator implements Calculate {
    // Implement the add method
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    // Implement the diff method
    @Override
    public int diff(int x, int y) {
        return x - y;
    }
}
