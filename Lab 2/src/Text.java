public class Text {
    private String text;
    private String shortString;
    private int k;

    public Text(String text, String shortString, int k) {
        this.text = text;
        this.shortString = shortString;
        this.k = k;
    }

    public void processText() {
        // Вставити короткий рядок після k-го символу в тексті
        String newText = text.substring(0, k) + shortString + text.substring(k);

        // Вивести отриманий рядок
        System.out.println("Отриманий рядок: " + newText);

        // Вивести кількість слів у отриманому рядку
        String[] words = newText.split("[^\\p{L}\\p{Digit}]+");
        int wordCount = words.length;
        System.out.println("Кількість слів у отриманому рядку: " + wordCount);
    }
}
