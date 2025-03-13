package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Post> posts = new LinkedHashMap<>();
        int autoIncrement = 1;

        while(true){
            // 명령어 입력
            System.out.print("명령어 > ");
            String command = sc.nextLine();

            // 명령어 로직 수행
            if(command.equals("종료")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            if(command.equals("작성")) {
                System.out.print("제목 : ");
                String title = sc.nextLine();
                System.out.print("내용 : ");
                String content = sc.nextLine();
                System.out.println();

                posts.put(autoIncrement, new Post(autoIncrement, title, content));
                autoIncrement++;
                continue;
            }
            if(command.equals("조회")) {
                // 입력
                System.out.print("어떤 게시물을 조회할까요?");
                String input = sc.nextLine();
                System.out.println();
                int seq = Integer.parseInt(input.substring(0, input.length()-1));

                if(!posts.containsKey(seq)) {
                    System.out.println(seq + "번 게시글은 존재하지 않습니다.");
                    System.out.println();
                } else {
                    System.out.println(posts.get(seq));
                    System.out.println();
                }
                continue;
            }
            if(command.equals("삭제")) {
                // 입력
                System.out.print("어떤 게시물을 삭제할까요?");
                String input = sc.nextLine();
                System.out.println();
                int seq = Integer.parseInt(input.substring(0, input.length()-1));

                if(!posts.containsKey(seq)) {
                    System.out.println(seq + "번 게시글은 존재하지 않습니다.");
                    System.out.println();
                } else {
                    posts.remove(seq);
                    System.out.println(seq+ "번 게시물이 성공적으로 삭제되었습니다!");
                    System.out.println();
                }
                continue;
            }
            if (command.equals("수정")) {
                // 입력
                System.out.print("어떤 게시물을 수정할까요?");
                String input = sc.nextLine();
                System.out.println();
                int seq = Integer.parseInt(input.substring(0, input.length()-1));

                if(!posts.containsKey(seq)) {
                    System.out.println(seq + "번 게시글은 존재하지 않습니다.");
                    System.out.println();
                } else {
                    System.out.print("수정할 제목 : ");
                    String title = sc.nextLine();
                    System.out.print("수정할 내용 : ");
                    String content = sc.nextLine();
                    posts.get(seq).update(title, content);
                    System.out.println(seq + "번 게시물이 성공적으로 수정되었습니다!");
                    System.out.println();
                }
                continue;
            }
            if (command.equals("목록")) {
                System.out.println("총 게시글은 " + posts.size() + "개 작성되어있습니다.");
                for (int seq : posts.keySet()) {
                    System.out.println(posts.get(seq));
                    System.out.println();
                }
                continue;
            }
            System.out.println("존재하지 않는 명령어 입니다.");
        }
    }
}