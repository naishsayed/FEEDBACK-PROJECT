import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a feedback entry
class Feedback {
    private String name;
    private String email;
    private String feedback;

    public Feedback(String name, String email, String feedback) {
        this.name = name;
        this.email = email;
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        // Change output format as required
        return "Feedback from " + name + " " + email + " | Feedback: " + feedback;
    }
}

// Main class for the Feedback Management System
public class FeedbackManagementSystem {
    private List<Feedback> feedbackList;

    public FeedbackManagementSystem() {
        feedbackList = new ArrayList<>();
    }

    public void collectFeedback() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter your feedback: ");
        String feedback = scanner.nextLine();
        
        Feedback feedbackEntry = new Feedback(name, email, feedback);
        feedbackList.add(feedbackEntry);
        
        System.out.println("Thank you for your feedback!");
    }

    public void displayFeedbacks() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available.");
            return;
        }
        
        System.out.println("\nFeedback List:");
        for (Feedback feedback : feedbackList) {
            System.out.println(feedback);
        }
    }

    public static void main(String[] args) {
        FeedbackManagementSystem system = new FeedbackManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nFeedback Management System");
            System.out.println("1. Give Feedback");
            System.out.println("2. View Feedbacks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    system.collectFeedback();
                    break;
                case 2:
                    system.displayFeedbacks();
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
}
