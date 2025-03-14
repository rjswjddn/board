package org.example.view;

import java.util.Scanner;

public class Input {

    private static final Scanner sc = new Scanner(System.in);

    public static String command() {
        System.out.print("명령어 > ");
        return sc.nextLine();
    }

    public static String createPostTitle() {
        System.out.print("제목 : ");
        return sc.nextLine();
    }

    public static String createPostContent() {
        System.out.print("내용 : ");
        return sc.nextLine();
    }

    public static int readPost() {
        System.out.print("어떤 게시물을 조회할까요?");
        String input = sc.nextLine();
        System.out.println();
        return parseIntSeq(input);
    }

    public static int deletePost() {
        System.out.print("어떤 게시물을 삭제할까요?");
        String input = sc.nextLine();
        System.out.println();
        return parseIntSeq(input);
    }

    public static int updatePost() {
        System.out.print("어떤 게시물을 수정할까요?");
        String input = sc.nextLine();
        System.out.println();
        return parseIntSeq(input);
    }

    public static String updatePostTitle() {
        System.out.print("수정할 제목 : ");
        return sc.nextLine();
    }

    public static String updatePostContent() {
        System.out.print("수정할 내용 : ");
        return sc.nextLine();
    }

    private static int parseIntSeq(String input) {
        return Integer.parseInt(input.substring(0, input.length() - 1));
    }
}
