package homeWork_7;
//Дополнительно - сделать так, чтобы каждый из методов выполнялся по 2 раза(путем параметризации и репитов).
//Задать отображаемое имя тестов на русском языке.
//Переопределить порядок выполнения тестов в отличном от дефолтном порядке.*/

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.Random.class)
class UserTest {
    private User user;
    private User user1;
    private User user2;

    //private static Map<Integer, User> allUsers = new HashMap<>();
    @BeforeEach
    public void setUp() {
        user = new User("Ivan", 25, Sex.MALE);
        user1 = new User("Petr", 40, Sex.MALE);
        user2 = new User("Inna", 10, Sex.FEMALE);

    }
    //написать прекондицию с созданием тестовых данных пользователей

    @Test
    @DisplayName("Получениие списка всех пользователей")
    @RepeatedTest(1)
    void getAllUsers() {
        List<User> exp = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        assertEquals(exp, actual);
        //  сравнить через assertEquals список пользователей созданный в тесте, с тем, что был создан в прекондициях
    }

    @Test
    @DisplayName("Проверка списка на пустоту")
    @RepeatedTest(1)
    void getAllUsers_NO_NULL() {
        //проверить, что список не пустой после beforeEach
        List<User> exp = User.getAllUsers();
        assertNotNull(exp);
        // assertFalse(User.getAllUsers().isEmpty());  а можно ли еще так?
    }

    @ParameterizedTest
    @ValueSource(strings = {"FEMALE", "MALE"})
    @DisplayName("Получениие записей с фильтром по полу")
    public void getAllUsers_sex(String sex) {
        List<User> exp = User.getAllUsers(Sex.valueOf(sex));
        assertNotNull(exp);
        //проверить, что из списка можно запросить записи с фильром по полу(параметризованным способом)
    }

    @Test
    @DisplayName("Проверка правильности подсчета количества записей")
    @RepeatedTest(1)
    void getHowManyUsers() {
        List<User> exp = User.getAllUsers();
        int expected = User.getHowManyUsers();
        int actual = exp.size();
        assertEquals(expected, actual);
        //проверить корректность работы метода getHowManyUsers
        // assertEquals(User.getHowManyUsers() , 3); или  вот так в лоб
    }

    @ParameterizedTest(name = "Проверка работы метода подсчета количества людей с фильтром по полу {index}")
    @ValueSource(strings = {"FEMALE", "MALE"})
    void getHowManyUsers_sex(String sex) {
        List<User> exp = User.getAllUsers(Sex.valueOf(sex));
        int expected = User.getHowManyUsers(Sex.valueOf(sex));
        int actual = exp.size();
        assertEquals(expected, actual);
        //проверить корректность работы метода getHowManyUsers с фильтром по полу(параметризованным способом)
    }

    @Test
    @DisplayName("Проверка правильности подсчета совокупного возраста всех пользователей")
    @RepeatedTest(1)
    void getAllAgeUsers() {
        assertEquals(User.getAllAgeUsers(), 25 + 40 + 10);
        //проверить корректность работы метода getAllAgeUsers
    }

    @ParameterizedTest(name = "Проверка работы метода подсчета суммарного возраста людей каждого пола № {index}")
    @EnumSource(Sex.class)
    void getAllAgeUsers_sex(Sex sex) {
        int ageCount = User.getAllAgeUsers(sex);
        if (sex == Sex.MALE) {
            assertEquals(25 + 40, ageCount);
        } else {
            assertEquals(10, ageCount);
            //проверить корректность работы метода getAllAgeUsers с фильром по полу(параметризованным способом)
        }


    }
    @Test
    @DisplayName("Проверка правильности подсчета среднего возраста всех пользователей")
    @RepeatedTest(1)
    void getAverageAgeOfAllUsers () {
        assertEquals((25+40+10)/3, User.getAverageAgeOfAllUsers());
    }
}
