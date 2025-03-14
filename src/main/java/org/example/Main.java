package org.example;

import org.example.view.Input;
import org.example.view.Output;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Post> posts = new LinkedHashMap<>();
        int autoIncrement = 1;

        while(true){
            // 명령어 입력
            String command = Input.command();

            // 명령어 로직 수행
            if(command.equals("종료")) {
                Output.exit();
                break;
            }
            if(command.equals("작성")) {
                String title = Input.createPostTitle();
                String content = Input.createPostContent();

                posts.put(autoIncrement, new Post(autoIncrement, title, content));
                autoIncrement++;
                continue;
            }
            if(command.equals("조회")) {
                // 입력
                int seq = Input.readPost();

                if(!posts.containsKey(seq)) {
                    Output.notExistsPost(seq);
                } else {
                    Output.readPost(posts.get(seq));
                }
                continue;
            }
            if(command.equals("삭제")) {
                // 입력
                int seq = Input.deletePost();

                if(!posts.containsKey(seq)) {
                    Output.notExistsPost(seq);
                } else {
                    posts.remove(seq);
                    Output.deletePost(seq);
                }
                continue;
            }
            if (command.equals("수정")) {
                // 입력
                int seq = Input.updatePost();

                if(!posts.containsKey(seq)) {
                    Output.notExistsPost(seq);
                } else {
                    String title = Input.updatePostTitle();
                    String content = Input.updatePostContent();
                    posts.get(seq).update(title, content);
                    Output.updatePost(seq);
                }
                continue;
            }
            if (command.equals("목록")) {
                Output.indexPost(posts.size());
                for (int seq : posts.keySet()) {
                    Output.readPost(posts.get(seq));
                }
                continue;
            }
            Output.notExistsCommand();
        }
    }
}