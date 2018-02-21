import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /**
     *
     * @param accountNumber fds
     */
    public void setAccountNumber(final int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * fds
     * @return fdsfds
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * fds
     * @param accountType fds
     */
    public void setAccountType(final BankAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * fds
     * @return fds
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * f
     * @param accountBalance f
     */
    public void setAccountBalance(final double accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * f
     * @return f
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     *
     * @param ownerName
     */
    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     *
     * @return
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     *
     * @param interestRate
     */
    public void setInterestRate(final double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     *
     * @return
     */
    public double getInterestEarned() {
        return interestEarned;
    }

    /**
     *
     * @param interestEarned
     */
    public void setInterestEarned(final double interestEarned) {
        this.interestEarned = interestEarned;
    }

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *
         */
        CHECKINGS,
        /**
         *
         */
        SAVINGS,
        /**
         *
         */
        STUDENT,
        /**
         *
         */
        WORKPLACE
    }

    /**
     *
     */
    private int accountNumber;
    /**
     *
     */
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;
    public static int totalAccounts = 0;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        totalAccounts++;
    }
}
