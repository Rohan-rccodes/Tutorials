// Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method. (Program 9)
// Created by Aryan , Rollno 7070
// Note : In order to compile and run this program , rename it from "7070Interface9.java" to "Interface9.java"

// Interface Searchable
interface Searchable {
    void search(String keyword);
}

// Class Document implementing Searchable
class Document implements Searchable {
    private String content;

    // Constructor for Document
    public Document(String content) {
        this.content = content;
    }

    // Implementation of the search method for Document
    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document.");
        }
    }
}

// Class WebPage implementing Searchable
class WebPage implements Searchable {
    private String url;
    private String htmlContent;

    // Constructor for WebPage
    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    // Implementation of the search method for WebPage
    @Override
    public void search(String keyword) {
        if (htmlContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found on the web page at " + url + ".");
        } else {
            System.out.println("Keyword '" + keyword + "' not found on the web page at " + url + ".");
        }
    }
}

// Main class for testing
public class Interface9 {
    public static void main(String[] args) {
        // Create instances of Document and WebPage
        Document document = new Document("This is a sample document. Java is a programming language.");
        WebPage webPage = new WebPage("http://example.com", "<html><body>Java programming on the web page</body></html>");

        // Test the search method for Document
        System.out.println("Searching in the document:");
        document.search("Java");
        document.search("Python");
        System.out.println();

        // Test the search method for WebPage
        System.out.println("Searching on the web page:");
        webPage.search("Java");
        webPage.search("JavaScript");
    }
}
