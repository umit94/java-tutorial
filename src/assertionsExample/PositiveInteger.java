package assertionsExample;

public class PositiveInteger {
    int positiveInt;

    public PositiveInteger(int positiveInt){
        // assert açıp kapatılabilen bir yapıdır. VM argument olarak -ea veya -enableassertions geçildiğinde açılır, default halinde kapalıdır
        // assert, dev ve qa gibi test ortamlarında açık iken prod ortamında kapalıdır (bizim tercihimize bağlı).
        // Çünkü assert hem programa yük oluşturur hem de Error fırlattığı için jvm çöker.
        // Bu sebepten hatalar prod ortamına çıkılmadan önlenmeli ve prod ortamında assert kapalı olmalıdır


        // İki nokta öncesi true dönmesi gereken ifadeyi içerir. false döndüğünde jvm çöker. İki nokta sonrası Error için mesaj geçilir ama mesaj zorunlu değildir.
        assert positiveInt>=0:"The int you passed must be 0 or positive"; // assert positiveInt>=0; // Şeklinde mesaj geçilmeden assert kullanılabilir.
        this.positiveInt=positiveInt;
    }

}
