import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author VIVEK
 * <p>
 * use actual methods without invoking in place of lambda expression
 * :: -> access by double colon/scope resolution operator (C++ lovers 😂)
 */
public class MethodReferenceDemo {
    static void main(String[] args) {

        // Method Reference
        List<String> programmingLanguages = Arrays.asList("Java", "C++", "Python", "JavaScript");
        programmingLanguages.forEach(System.out::println);
        System.out.println();


        List<String> speakingLanguages = Arrays.asList("English", "Spanish", "French", "German");
        //Constructor Reference
        List<Languages> languagesSpoken = speakingLanguages.stream().map(Languages::new).collect(Collectors.toList());
        languagesSpoken.forEach(language -> System.out.println(language.toString()));
    }
}

class Languages {
    String language;

    Languages(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return language;
    }
}