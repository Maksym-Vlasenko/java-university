package com.company.march20.tasks;

public class Main {
    public static void main(String[] args) {
        Furniture[] furniture = createFurniture();
        for (Furniture f : furniture) {
            f.getInfo();
        }
    }

    private static Furniture[] createFurniture() {
        Furniture[] furniture = new Furniture[6];
        Armchair[] armchairs = createArmchairs();
        Sofa[] sofas = createSofas();
        Table[] tables = createTables();
        System.arraycopy(armchairs, 0, furniture, 0, 2);
        System.arraycopy(sofas, 0, furniture, 2, 2);
        System.arraycopy(tables, 0, furniture, 4, 2);
        return furniture;
    }

    private static Table[] createTables() {
        Table[] tables = new Table[2];
        tables[0] = new ModernTable();
        tables[1] = new VictorianTable();
        return tables;
    }

    private static Sofa[] createSofas() {
        Sofa[] sofas = new Sofa[2];
        sofas[0] = new ModernSofa();
        sofas[1] = new VictorianSofa();
        return sofas;
    }

    private static Armchair[] createArmchairs() {
        Armchair[] armchairs = new Armchair[2];
        armchairs[0] = new ModernArmchair();
        armchairs[1] = new VictorianArmchair();
        return armchairs;
    }
}
