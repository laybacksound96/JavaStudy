package aa;




import java.io.*;

import java.net.*;

import java.text.SimpleDateFormat;

import java.util.*;



public class ClientRun {



	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);



		PrintWriter pw = null;

		BufferedReader br = null;

		

		String serverIp = "5555";

		int port = 3333;

		String trueLove = "♡Ο-łł 살고 ♡Ο-łł 죽는⊂ŀ_☆";

		Socket socket = null;

		

		try {

			socket = new Socket(serverIp, port);

			

			System.out.println(trueLove + "님의 채팅방에 접속하셨습니다.");

			

			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	

			pw = new PrintWriter(socket.getOutputStream());

			

			while (true) {

				System.out.print(trueLove + "님에게 보낼 메세지 : ");

				String send = sc.nextLine();

				   

				Date d = new Date();

				SimpleDateFormat sdf = new SimpleDateFormat("[HH:MM:ss]");

				String time = sdf.format(d);

				pw.println(time + send);

				pw.flush();

				String message = br.readLine();

				

				System.out.println(trueLove + "님에게 받은 메세지 : " + message);

			}

			System.out.println("채팅이 종료되었습니다.");

		} catch (UnknownHostException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			pw.close();

			br.close();

			socket.close();

		}

	}
}