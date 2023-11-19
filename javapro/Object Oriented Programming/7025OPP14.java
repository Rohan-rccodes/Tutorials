/*
1. Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.
*/ 

class Library 
{
    String[] book = new String[5];

    int size = 5;

    int index;
    
    void add(String bookname)
    {
        if (index == 5)
        {
            book[index] = bookname;
            index++;
        }
        else
        {
            System.out.println("index out of bond");
        }
    }
    void remove()
    {
        if (index == 0)
        {
            index--;
        }
        else
        {
            System.out.println("not element to remove");
        }
    }

    void displaybook()
    {
        for (int i = 0; i < index; i++) {
            System.out.println(book[i]);
        }
    }
}
class Test
{
    public static void main(String[] args) {
        
        Library l = new Library();

        l.add("time of error");
        l.add("hello bro");
        l.add("hero time");

        l.remove();



        l.displaybook();

    }
}
