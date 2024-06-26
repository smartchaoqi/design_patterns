package com.aqiu.pattern.memento.write_box;

public class GameRole {
    private int vit;
    private int atk;
    private int def;


    public GameRole() {
        initState();
    }

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit=0;
        this.atk=0;
        this.def=0;
    }

    public RoleStateMemento saveState(){
        return new RoleStateMemento(vit,atk,def);
    }

    public void recoverState(RoleStateMemento memeoto){
        this.atk=memeoto.getAtk();
        this.def=memeoto.getDef();
        this.vit=memeoto.getVit();
    }

    public void stateDisplay() {
        System.out.println("角色生命力：" + vit);
        System.out.println("角色攻击力：" + atk);
        System.out.println("角色防御力：" + def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
