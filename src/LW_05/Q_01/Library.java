package LW_05.Q_01;

import java.util.ArrayList;

public class Library {

    private ArrayList<BorrowableItems> borrowableItemsList;

    public Library() {
        borrowableItemsList = new ArrayList<>();
    }

    public void addLibraryItem(BorrowableItems item) {
        borrowableItemsList.add(item);
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getTitle().equalsIgnoreCase(title) && book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book \"" + title + "\" checked out successfully.");
                    return;
                }
            }
        }
        System.out.println("Book not available or not found.");
    }

    public void listAvailableItems() {
        System.out.println("\nAvailable Library Items:");
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.isAvailable()) {
                    book.displayInfo();
                }
            }
        }
    }

    public void displayLibraryInfo() {
        int availableCount = 0;
        for (BorrowableItems item : borrowableItemsList) {
            if (item instanceof Book) {
                if (((Book) item).isAvailable()) {
                    availableCount++;
                }
            }
        }

        System.out.println("Total Library Items: " + borrowableItemsList.size());
        System.out.println("Available Items: " + availableCount);
    }
}
