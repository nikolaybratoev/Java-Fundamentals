package objects;

import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        String title = input[0];
        String content = input[1];
        String author = input[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split(": ");
            String currentCommand = command[0];
            String changeValue = command[1];

            switch (currentCommand) {

                case "Edit":
                    article.setContent(changeValue);
                    break;

                case "ChangeAuthor":
                    article.setAuthor(changeValue);
                    break;

                case "Rename":
                    article.setTitle(changeValue);
                    break;
            }
        }

        System.out.println(article);

    }

    private static class Article{
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",
                    this.title,
                    this.content,
                    this.author);
        }
    }
}
