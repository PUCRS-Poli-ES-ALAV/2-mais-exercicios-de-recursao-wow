import java.util.ArrayList;

public class Recursao {

    // Modelagem:
    // fatorial(n) = n * fatorial(n-1), se n > 1
    // fatorial(0) = 1
    public int fatorial(int n) {
        if (n == 0) return 1;
        return n * fatorial(n - 1);
    }

    // Modelagem:
    // somatorio(n) = n + somatorio(n-1), se n > 0
    // somatorio(0) = 0
    public int somatorio(int n) {
        if (n == 0) return 0;
        return n + somatorio(n - 1);
    }

    // Modelagem:
    // fib(n) = fib(n-1) + fib(n-2), se n > 1
    // fib(0) = 0, fib(1) = 1
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Modelagem:
    // somaEntre(k, j) = k + somaEntre(k+1, j), se k < j
    // somaEntre(k, j) = k, se k == j
    public int somaEntre(int k, int j) {
        if (k == j) return k;
        return k + somaEntre(k + 1, j);
    }

    // Modelagem:
    // isPal(s): se s.length() <= 1, retorna true
    // se s.charAt(0) != s.charAt(s.length()-1), retorna false
    // senão, isPal(s.substring(1, s.length()-1))
    public boolean isPal(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPal(s.substring(1, s.length() - 1));
    }

    // Modelagem:
    // convBase2(n): se n < 2, retorna n+""
    // senão, convBase2(n/2) + (n%2)
    public String convBase2(int n) {
        if (n < 2) return Integer.toString(n);
        return convBase2(n / 2) + (n % 2);
    }

    // Modelagem:
    // somaArray(arr, i): se i == arr.size(), retorna 0
    // senão, arr.get(i) + somaArray(arr, i+1)
    public int somaArray(ArrayList<Integer> arr) {
        return somaArrayHelper(arr, 0);
    }
    private int somaArrayHelper(ArrayList<Integer> arr, int i) {
        if (i == arr.size()) return 0;
        return arr.get(i) + somaArrayHelper(arr, i + 1);
    }

    // Modelagem:
    // findBiggest(arr, i): se i == arr.size()-1, retorna arr.get(i)
    // senão, max(arr.get(i), findBiggest(arr, i+1))
    public int findBiggest(ArrayList<Integer> arr) {
        return findBiggestHelper(arr, 0);
    }
    private int findBiggestHelper(ArrayList<Integer> arr, int i) {
        if (i == arr.size() - 1) return arr.get(i);
        int nextBiggest = findBiggestHelper(arr, i + 1);
        return Math.max(arr.get(i), nextBiggest);
    }

    // Modelagem:
    // findSubStr(str, match): se str.length() < match.length(), retorna false
    // se str começa com match, retorna true
    // senão, findSubStr(str.substring(1), match)
    public boolean findSubStr(String str, String match) {
        if (str.length() < match.length()) return false;
        if (str.startsWith(match)) return true;
        return findSubStr(str.substring(1), match);
    }

    // Modelagem:
    // nroDigit(n): se n < 10, retorna 1
    // senão, 1 + nroDigit(n/10)
    public int nroDigit(int n) {
        if (n < 10) return 1;
        return 1 + nroDigit(n / 10);
    }

    // Modelagem:
    // permutations(s): se s.length() == 0, retorna lista com ""
    // para cada char c em s, para cada permutação do resto, adiciona c + permutação
    public ArrayList<String> permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            for (String perm : permutations(rest)) {
                result.add(c + perm);
            }
        }
        return result;
    }
}
