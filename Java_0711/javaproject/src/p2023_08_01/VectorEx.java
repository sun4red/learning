package p2023_08_01;

import java.util.List;
import java.util.Vector;


class Board {

	String subject;
	String content;
	String writer;

	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;

	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public class VectorEx {

		public static void main(String[] args) {

			List<Board> list = new Vector<Board>(); // 업캐스팅

			// Vector 자료구조에는 Board 클래스로 만든 객체만 저장할 수 있다.

			list.add(new Board("제목1", "내용1", "작성자1"));
			list.add(new Board("제목2", "내용2", "작성자2"));
			list.add(new Board("제목3", "내용3", "작성자3"));
			list.add(new Board("제목4", "내용4", "작성자4"));
			list.add(new Board("제목5", "내용5", "작성자5"));
			list.add(new Board("제목6", "내용6", "작성자6"));
			list.add(new Board("제목7", "내용7", "작성자7"));

			list.remove(2);
			list.remove(3);

			for (int i = 0; i < list.size(); i++) {
				Board board = list.get(i);
				System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
			}

			System.out.println();

		}

	}

}
