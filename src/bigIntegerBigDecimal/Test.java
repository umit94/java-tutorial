package bigIntegerBigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger num = BigInteger.valueOf(2548351181854321835L); // string gibi immutable yani değişmezdir, çünkü nesnedir. Yeni bir nesne referansı verilerek değiştirilir.

        System.out.println("multiply= "+num.multiply(BigInteger.valueOf(2548351181854321835L))); // long'un sınırları dışında bir değer döndürür

        System.out.println("originalNum= "+num); //ilk değer değişmez

        num =num.multiply(BigInteger.valueOf(2548351181854321835L));

        System.out.println("multiplied intValue= "+num.intValue()); //int sınırları dışında olabileceği için doğru sonuçlar döndürmeyebilir

        BigDecimal num2 = BigDecimal.valueOf(23.3); //BigInteger'ın ondalık sayı versiyonu
    }
}
