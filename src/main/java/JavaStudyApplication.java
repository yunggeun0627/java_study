import service.UserService;

import java.util.List;

public class JavaStudyApplication {
    public static void main(String[] args) {
        UserService userService = UserService.getInstance();

        userService.register(
                "testuser",
                "1234",
                "예영근",
                "bbiyagi465@gmail.com",
                "010-4910-7830",
                "부산 북구 구포동",
                21,
                List.of("ROLE_USER", "ROLE_ADMIN"));

        userService.register(
                "testuser",
                "1234",
                "예영근",
                "bbiyagi465@gmail.com",
                "010-4910-7830",
                "부산 북구 구포동",
                21,
                List.of("ROLE_USER", "ROLE_ADMIN"));

        userService.printAll();
        userService.printByUsername("testuser");
        userService.printByUsername("testuser2");

    }

}