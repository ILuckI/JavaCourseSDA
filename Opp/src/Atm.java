public class Atm {
    private int id;
    private String bankName;
    private String street;
    private String buildingNumber;
    private int _cash = 10000;
    private int cashLimit = 15000;
    private boolean isWorking = true;

    public Atm(int id, String bankName, String street, String buildingNumber) {
        this.id = id;
        this.bankName = bankName;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public Atm(int id, String bankName, String street, String buildingNumber, int cash) {
        this.id = id;
        this.bankName = bankName;
        this.street = street;
        this.buildingNumber = buildingNumber;
        _cash = cash;
    }

    public Atm(int id, String bankName, String street, String buildingNumber, int cach, int cashLimit) {
        this.id = id;
        this.bankName = bankName;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this._cash = cach;
        this.cashLimit = cashLimit;
    }

    public int getId() {
        return id;
    }

    public String getBankName() {
        return bankName;
    }

    public String getATMDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("ATM[id=").append(id).append(", bankName=").append(bankName).append(", street=").append(street).append(", buildingNumber=").append(buildingNumber).append("]");
        return sb.toString();
    }

    public void depositCash(int amount) {
        _cash += amount;
    }

    public void withdrawMoney(int amount) {
        _cash -= amount;

    }

    public int getCach() {
        return _cash;
    }

    private int getCashLimit() {
        return cashLimit;
    }

    private boolean checkifCanDoOperation(int cach) {
        if (cach > cashLimit && cach < 0)
            isWorking = false;
        else
            isWorking = true;
        return isWorking;
    }

    public String checkStatus() {
        StringBuilder sb = new StringBuilder();
        if (_cash > cashLimit)
            sb.append("ATM is overfilled!");
        else if (_cash < (cashLimit - _cash))
            sb.append("ATM is empty!");
        else
            sb.append("All working correctly");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ATM[id=").append(id).append(", bankName=").append(bankName).append(", street=").append(street).append(", buildingName=").append(buildingNumber).append(", cash=").append(_cash).append(", cashLimit=").append(checkStatus());
        return sb.toString();
    }
}
