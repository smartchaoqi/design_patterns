package com.aqiu.pattern.builder.demo2;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone(Builder builder){
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }

        public Builder screen(String screen){
            this.screen=screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory=memory;
            return this;
        }

        public Builder mainboard(String mainboard){
            this.mainboard=mainboard;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
