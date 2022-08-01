package Wzorce.WzorceProjektowe.Day2.Builder.After;

public class Computer {
    private String processor;
    private String ram;
    private String graphic;


    private Computer(ComputerBuilder computerBuilder) {
        this.processor = computerBuilder.processor;
        this.ram = computerBuilder.ram;
        this.graphic = computerBuilder.graphic;
    }

    public static class ComputerBuilder {
        private String processor;
        private String ram;
        private String graphic;

        public Computer build() {
            return new Computer(this);
        }

        public ComputerBuilder buildProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder buildRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder buildGraphic(String graphic) {
            this.graphic = graphic;
            return this;

        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphic='" + graphic + '\'' +
                '}';
    }
}