public class Test{
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
        .setCPU("Intel 17")
        .setRAM("16GB")
        .setStorage("512GB SSD").build();
        computer.display();
    }
}