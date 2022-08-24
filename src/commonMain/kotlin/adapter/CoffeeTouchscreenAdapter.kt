package adapter

class CoffeeTouchscreenAdapter ( val oldVendingMachine: OldCoffeeMachine) : CoffeeMachineInterface{

    override fun chooseFirstSelection() {
        oldVendingMachine.selectA();
    }

    override fun chooseSecondSelection() {
        oldVendingMachine.selectB()
    }

}