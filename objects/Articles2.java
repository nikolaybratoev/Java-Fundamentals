package objects;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(",\\s+");

            String title = input[0];
            String content = input[1];
            String author = input[2];

            Article article = new Article(title, content, author);
            articleList.add(article);

        }

        String command = scanner.nextLine();

        List<Article> list = new ArrayList<>();

        switch (command) {

            case "title":
                list = articleList.stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .collect(Collectors.toList());
                break;

            case "content":
                list = articleList.stream()
                        .sorted(Comparator.comparing(Article::getContent))
                        .collect(Collectors.toList());
                break;

            case "author":
                list = articleList.stream()
                        .sorted(Comparator.comparing(Article::getAuthor))
                        .collect(Collectors.toList());
                break;
        }

        printArticles(list);

    }

    private static void printArticles(List<Article> list) {
        for (Article article : list) {
            System.out.printf("%s - %s: %s%n", article.getTitle(),
                    article.getContent(),
                    article.getAuthor());
        }
    }

    private static class Article {
        String title;
        String content;
        String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }
        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }
    }
}
