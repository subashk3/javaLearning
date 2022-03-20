package interviewpanel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Member {
	Scanner in = new Scanner(System.in);
	private Queue<String> reception = new LinkedList<String>();
	private Queue<String> room = new LinkedList<String>();
	private String interview;
// Get remamining people
	public int getRemainingMember() {
		return reception.size() + room.size();
	}	
	//read data from file	
	public void getCandidateList() throws FileNotFoundException {		
		File file = new File("E:\\Programs\\Program\\javaLearning\\src\\interviewpanel\\interviewList.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			addCandidate(scan.nextLine());
		}
		scan.close();		
	}
	public void addCandidate(String name) {
		if (room.size() > 3)
			reception.add(name);
		else
			waitingRoom(name);
	}
	public void printList() {
		System.out.println(reception);
	}
	public void waitingRoom(String name) {
		room.add(name);
	}
	public void dequeueOfCandidate() {
		if (!room.isEmpty()) {
			interview = room.remove();
			System.out.println();
			System.out.println(interview + " is in the interview room");
			System.out.println("Next " + room.peek() + " Get ready\n");
		} else {
			System.err.println("\nInterview Over");
			System.exit(0);
		}
		if (!reception.isEmpty()) {
			String next = reception.remove();
			System.out.println(next + " Go to waiting room\n");
			waitingRoom(next);
		}		
		System.out.println(room);
		System.out.println(reception);
	}
	public int getRemainingReception() {
		// TODO Auto-generated method stub
		return reception.size();
	}
}
