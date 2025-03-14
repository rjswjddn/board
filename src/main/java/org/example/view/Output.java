package org.example.view;

import org.example.Post;

public class Output {
    public static void exit() {
        System.out.println("프로그램이 종료됩니다.");
    }

    public static void notExistsPost(int seq) {
        System.out.println(seq + "번 게시글은 존재하지 않습니다.");
        System.out.println();
    }

    public static void readPost(Post post) {
        System.out.println(post);
        System.out.println();
    }

    public static void deletePost(int seq) {
        System.out.println(seq+ "번 게시물이 성공적으로 삭제되었습니다!");
        System.out.println();
    }

    public static void updatePost(int seq) {
        System.out.println(seq + "번 게시물이 성공적으로 수정되었습니다!");
        System.out.println();
    }

    public static void indexPost(int size) {
        System.out.println("총 게시글은 " + size + "개 작성되어있습니다.");
    }

    public static void notExistsCommand() {
        System.out.println("존재하지 않는 명령어 입니다.");
        System.out.println();
    }
}
