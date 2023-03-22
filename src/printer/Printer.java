package printer;

public class Printer {

    @SafeVarargs
    public final void print(Object... given) {
        for (var process : given) {
            System.out.println(process.toString());
        }
    }

}
