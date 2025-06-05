package coe318.lab4.bankaccounts;

public class Bank {
    private String name;
    private Account [] accounts;
    private int numAccounts;//number of active accounts

    public Bank(String name, int maxNumberAccounts) {
        this.name = name;
        accounts = new Account[maxNumberAccounts];
        numAccounts = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getNumAccounts() {
        return this.numAccounts; //Fix this
    }

    //returns array of Account objects
    public Account[] getAccounts() {
        return this.accounts;
    }

    public boolean hasAccountNumber(int accountNumber) {
      for(int i = 0; i < numAccounts; i++){
        if(accounts[i].getNumber() == accountNumber){
          return true;
        }
      }
      return false;
    }

    /**
     * Adds the specified account to the Bank if possible. If the account number
     * already exists or the Bank has reached its maximum
     * number of accounts, return false and do not add it; otherwise,
     * add it and return true.
     * @param account
     * @return true if successful
     */
    public boolean add(Account account) {
      if(hasAccountNumber(account.getNumber())){
        return false;
      } else if (numAccounts >= accounts.length){
        return false; //if the number of accounts in accounts array is more than the number of account objects allowed return false
      } 

      accounts[numAccounts] = account;
      numAccounts++;
      return true;
    }

    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        String s = getName() + ": " + getNumAccounts() +
                " of " + getAccounts().length +
                " accounts open";
        for(Account account : getAccounts()) {
            if (account == null) break;
            s += "\n  " + account;
        }
        return s;
    }
}