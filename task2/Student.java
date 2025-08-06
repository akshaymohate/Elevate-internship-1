
		
		import java.util.ArrayList;
		import java.util.Scanner;
		
		public class Student {
     
				
	

		    private ArrayList<Student> students = new ArrayList<>();
		    private Scanner scanner = new Scanner(System.in);
		    
		    public void start() {
		        int choice;
		        do {
		            showMenu();
		            choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline
		            
		            switch (choice) {
		                case 1:
		                    addStudent();
		                    break;
		                case 2:
		                    viewStudents();
		                    break;
		                case 3:
		                    updateStudent();
		                    break;
		                case 4:
		                    deleteStudent();
		                    break;
		                case 5:
		                    System.out.println("Exiting application. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 5);
		        scanner.close();
		    }
		    
		    private void showMenu() {
		        System.out.println("\n--- Student Record Management System ---");
		        System.out.println("1. Add Student");
		        System.out.println("2. View All Students");
		        System.out.println("3. Update Student");
		        System.out.println("4. Delete Student");
		        System.out.println("5. Exit");
		        System.out.print("Enter your choice: ");
		    }
		    
		    private void addStudent() {
		        System.out.println("\n--- Add New Student ---");
		        System.out.print("Enter Student ID: ");
		        int id = scanner.nextInt();
		        scanner.nextLine(); // Consume newline
		        System.out.print("Enter Student Name: ");
		        String name = scanner.nextLine();
		        System.out.print("Enter Student Marks: ");
		        String marks = scanner.nextLine();
		        
		        students.add(new Student());
		        System.out.println("Student added successfully!");
		    }
		    
		    private void viewStudents() {
		        System.out.println("\n--- All Students ---");
		        if (students.isEmpty()) {
		            System.out.println("No students in the record.");
		        } else {
		            for (Student student : students) {
		                System.out.println(student);
		            }
		        }
		    }
		    
		    private void updateStudent() {
		        System.out.println("\n--- Update Student ---");
		        System.out.print("Enter Student ID to update: ");
		        int idToUpdate = scanner.nextInt();
		        scanner.nextLine(); // Consume newline
		        
		        boolean found = false;
		        for (Student student : students) {
		            if (student.getId() == idToUpdate) {
		                System.out.print("Enter new Student Name (current: " + student.getName() + "): ");
		                student.setName(scanner.nextLine());
		                System.out.print("Enter new Student Marks (current: " + student.getMarks() + "): ");
		                student.setMarks(scanner.nextLine());
		                System.out.println("Student updated successfully!");
		                found = true;
		                break;
		            }
		        }
		        
		        if (!found) {
		            System.out.println("Student with ID " + idToUpdate + " not found.");
		        }
		    }
		    
		    private int getId() {
				// TODO Auto-generated method stub
				return 0;
			}

			private void setMarks(String nextLine) {
				// TODO Auto-generated method stub
				
			}

			private void setName(String nextLine) {
				// TODO Auto-generated method stub
				
			}

			private void deleteStudent() {
		        System.out.println("\n--- Delete Student ---");
		        System.out.print("Enter Student ID to delete: ");
		        int idToDelete = scanner.nextInt();
		        scanner.nextLine(); // Consume newline
		        
		        boolean removed = students.removeIf(student -> student.getId() == idToDelete);
		        
		        if (removed) {
		            System.out.println("Student with ID " + idToDelete + " deleted successfully!");
		        } else {
		            System.out.println("Student with ID " + idToDelete + " not found.");
		        }
		    }
		    
		    public static void main(String[] args) {
		         Student  app = new  Student ();
		        app.start();
		    }
		}
	
