아주 좋은 질문이에요 👏
`try (Scanner sc = new Scanner(System.in)) { ... }` 구문은
자바의 **“try-with-resources” (리소스 자동 해제 구문)** 기능을 이용하기 때문에
`scanner.close()`를 **직접 호출할 필요가 없어요.**

---

## 🧩 1️⃣ try-with-resources란?

자바 7부터 도입된 문법으로,
**AutoCloseable** 인터페이스를 구현한 객체를
try() 괄호 안에 넣으면
블록이 끝날 때 **자동으로 close()가 호출**됩니다.

---

### 💡 예를 들어

```java
try (Scanner sc = new Scanner(System.in)) {
    String s = sc.next();
    System.out.println(s);
} 
// ← 이 블록이 끝나면 자동으로 sc.close()가 호출됨
```

---

## ⚙️ 2️⃣ 내부 동작 원리

자바가 이 코드를 실행할 때,
컴파일러가 아래처럼 변환해서 실행합니다 👇

```java
Scanner sc = new Scanner(System.in);
try {
    // 코드 블록
} finally {
    if (sc != null) {
        sc.close(); // 자동 호출됨 ✅
    }
}
```

즉, `finally` 블록에 `close()` 호출이 **자동으로 삽입**되는 거예요.
그래서 명시적으로 `sc.close()`를 쓸 필요가 없습니다.

---

## 🧠 3️⃣ 왜 안전할까?

* 예외(Exception)가 발생하더라도
  → `finally` 블록에서 **항상 close()** 호출됨
* 리소스 누수(메모리, 파일 핸들 등) 방지
* `try-with-resources`는 여러 리소스도 동시에 안전하게 닫을 수 있음

```java
try (
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new FileReader("file.txt"))
) {
    // 둘 다 블록 끝나면 자동 close()
}
```

---

## 📘 4️⃣ Scanner가 자동으로 닫히는 이유

`Scanner` 클래스는 **`AutoCloseable`** 인터페이스를 구현하고 있기 때문이에요 👇

```java
public final class Scanner implements Iterator<String>, Closeable { ... }
```

`Closeable`은 `AutoCloseable`을 상속하므로,
`try-with-resources`에 쓸 수 있습니다.

---

## ✅ 결론 요약

| 항목                 | 설명                                                  |
| ------------------ | --------------------------------------------------- |
| 사용 문법              | `try (Scanner sc = new Scanner(System.in)) { ... }` |
| 자동 동작              | 블록 종료 시 `sc.close()` 자동 호출                          |
| 구현 이유              | `Scanner`가 `AutoCloseable` 인터페이스를 구현                |
| 장점                 | 예외 발생 시에도 안전, 코드 간결                                 |
| 직접 `close()` 필요 여부 | ❌ 필요 없음                                             |

---

📘 **한 줄 요약:**

> `try-with-resources` 구문은 블록이 끝날 때
> `AutoCloseable` 객체의 `close()`를 자동으로 호출하므로
> `scanner.close()`를 직접 쓸 필요가 없습니다 ✅
