public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Анна";
        post.passport = "4444 №44444444";
        post.patronymic = "Андреевна";
        post.phone = "+7 (950)-006-04-45";
        post.surname = "Кочергина";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 27;
        post.birthday.month = 8;
        post.birthday.year = 1992;
    }
}
