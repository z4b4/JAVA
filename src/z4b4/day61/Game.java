package z4b4.day61;

import java.util.Scanner;

public class Game {

	private Player player;

	public Game(Player player) {
		this.player = player;
	}

	public void start() {
		System.out.println("Start Game");
		System.out.println(player.getName() + "������Ϸ,��ʼ����Ϊ:" + player.getScore());
		String[] arr = new String[] { "����", "ʯͷ", "��" };
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("������ ���� ʯͷ �� ����֮һ\n" + "�˳�����\"q\"");
			String s1 = sc.next();// player input
			if (!filter(s1)) {
				System.out.println("���������������,����������");
				continue;
			}
			if (s1.equals("q")) {
				break;
			}
			int count = (int) (Math.random() * 3);
			String s2 = arr[count];
			int flag = rule(s1, s2);
			System.out.println("�������" + s1 + " " + "ϵͳ������" + s2);
			if (flag > 0) {
				System.out.println("��ϲ" + player.getName() + "Ӯ��,����10����");
				player.setScore(player.getScore() + 10);
			} else if (flag < 0) {
				System.out.println("�Բ���" + player.getName() + "����,�۳�100����");
				player.setScore(player.getScore() - 100);
			} else {
				System.out.println("��ƽ��");
			}
			System.out.println(player);
		}
		System.out.println(player.getName() + "�˳�����Ϸ" + "��ǰ����Ϊ:" + player.getScore());
	}

	public boolean filter(String s) {
		if ("����".equals(s) || "ʯͷ".equals(s) || "��".equals(s) || "q".equals(s)) {
			return true;
		} else {
			return false;
		}
	}

	public int rule(String s1, String s2) {
		if (s1.equals(s2)) {
			return 0;
		}
		if (s1.equals("����")) {
			if (s2.equals("ʯͷ")) {
				return -1;
			}
			if (s2.equals("��")) {
				return 1;
			}
		}

		if (s1.equals("ʯͷ")) {
			if (s2.equals("��")) {
				return -1;
			}
			if (s2.equals("����")) {
				return 1;
			}
		}

		if (s1.equals("��")) {
			if (s2.equals("����")) {
				return -1;
			}
			if (s2.equals("ʯͷ")) {
				return 1;
			}
		}
		return 0;

	}

}
