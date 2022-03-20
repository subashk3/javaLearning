package interviewpanel;

import java.io.FileNotFoundException;
import java.util.*;

public class InterviewPannel {
	Scanner sc = new Scanner(System.in);
	Member member = new Member();

	/*
	 * InterviewPannel() { while (true) {
	 * System.out.println("Press 1 for Enter candidate Name");
	 * System.out.println("Press 2 for Exit"); byte option = sc.nextByte(); boolean
	 * flag = false; switch (option) {
	 * 
	 * case 1: System.out.println("Enter your name");
	 * member.addCandidate(sc.next()); break; case 2: flag = true; break; } if
	 * (flag) { break; } }
	 * 
	 * }
	 */
	public InterviewPannel() throws FileNotFoundException {
		member.getCandidateList();
	}

	public void startInterview() {
		while (true) {
			System.out.println("Press 1 for A person has to go to the interview room");
			System.out.println("Press 2 for Count of Remaining People");
			System.out.println("Press 3 for Count of Reception People");
			try {
				byte choice = sc.nextByte();
				switch (choice) {

				case 1:
					member.dequeueOfCandidate();
					break;
				case 2:
					System.out.println(member.getRemainingMember());
					break;
				case 3:
					System.out.println(member.getRemainingReception());
					break;
				default:
					System.err.println("Invalid Data\n");
					System.out.println("Try Again\n");
					break;

				}
			} catch (InputMismatchException e) {
				System.err.println("Invalid input press numberic values");
				break;
			}
		}
	}

}
