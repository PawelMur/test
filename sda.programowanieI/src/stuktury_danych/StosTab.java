package stuktury_danych;

public class StosTab {

    private int[] tab;

    private int top = -1;

    public StosTab(int size) {
        tab = new int[size];
    }

    public void push(int value) throws ArrayIndexOutOfBoundsException {
        if(isFull()) {
            throw new ArrayIndexOutOfBoundsException("isFull Moja wiadomość");
        }

        tab[++top] = value;
    }

    public int pop() {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("isEmpty");
        }
        return tab[top--];
    }

    public boolean isEmpty() {
        //metoda I
//        if(top == -1) {
//            return true;
//        } else {
//            return false;
//        }

        //methoda II
        return top == -1;
    }

    public boolean isFull() {
        return top >= tab.length - 1;
    }

    public int peek() throws ArrayIndexOutOfBoundsException {
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("isEmpty");
        }
        return tab[top];
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

}
