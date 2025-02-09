public class Main {
    public static void main(String[] args) {
        
        Character knight1 = new Character(new AttackStrategies.SwingSword(), new DefenseStrategies.Shield());
        Character knight2 = new Character(new AttackStrategies.SwingSword(), new DefenseStrategies.Dodge());
        Character knight3 = new Character(new AttackStrategies.SwingSword(), new DefenseStrategies.CreateMagicBarrier());
        
        Character wizard = new Character(new AttackStrategies.CastSpell(), new DefenseStrategies.CreateMagicBarrier());
        Character archer = new Character(new AttackStrategies.ShootArrow(), new DefenseStrategies.Dodge());
        
        System.out.println("Knight:");
        knight1.attack();
        knight1.defend();
        knight2.defend();
        knight3.defend();
        
        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();
        
        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();
    }
}
