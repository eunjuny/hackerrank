좋아요 👏
이건 HackerRank의 **“Java Static Initializer Block”** 문제예요.
핵심은 “**클래스가 로드될 때(static block)** 변수 초기화 및 조건 검증을 수행하는 것”이에요.

하나씩 깔끔하게 정리해볼게요 👇

---

## 🧩 1️⃣ 문제 요구사항 요약

* 입력: 두 줄
  1️⃣ `B` (Breadth)
  2️⃣ `H` (Height)

* 조건:

  * `B > 0` 그리고 `H > 0` → 평행사변형의 넓이(`B * H`) 출력
  * 그 외 → `"java.lang.Exception: Breadth and height must be positive"` 출력

* 특징:

  * **static block** 안에서 입력값 유효성 검사 수행

---

## ✅ 2️⃣ 정답 코드 (Java 15 호환)

```java
import java.util.*;

public class Solution {
    static int B;       // Breadth
    static int H;       // Height
    static boolean flag; // 유효성 플래그

    // static 초기화 블록: 클래스 로드 시 한 번만 실행됨
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
```

---

## 🧠 3️⃣ 코드 동작 과정

| 단계            | 설명                                           |
| ------------- | -------------------------------------------- |
| 1️⃣ 클래스 로드    | `Solution` 클래스가 실행될 때 **static block** 자동 실행 |
| 2️⃣ 입력 처리     | `Scanner` 로 `B`(breadth), `H`(height) 입력     |
| 3️⃣ 조건 검사     | 두 값이 모두 양수이면 `flag = true`, 아니면 예외 메시지 출력    |
| 4️⃣ main() 실행 | `flag`가 true일 때만 넓이(`B * H`) 계산 후 출력         |

---

## 🧩 4️⃣ 실행 예시

### ✅ 예제 1

**입력**

```
1
3
```

**출력**

```
3
```

---

### ❌ 예제 2

**입력**

```
-1
2
```

**출력**

```
java.lang.Exception: Breadth and height must be positive
```

---

## ⚙️ 5️⃣ Static block 개념 요약

| 항목              | 설명                       |
| --------------- | ------------------------ |
| 실행 시점           | 클래스 로드 시 **한 번만 실행됨**    |
| 목적              | static 변수 초기화 또는 예외 검증   |
| 형식              | `static { /* 실행 코드 */ }` |
| main()보다 먼저 실행? | ✅ 예 — main() 호출 전 실행됨    |

---

## 💡 6️⃣ static block 없이 풀 수도 있지만…

```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int B = sc.nextInt();
    int H = sc.nextInt();

    if (B <= 0 || H <= 0)
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    else
        System.out.println(B * H);
}
```

하지만 이 문제는 **“static initialization block”을 연습하기 위한 과제**이므로,
위 버전은 통과하지 않습니다 ❌

---

## ✅ 결론 요약

| 항목          | 내용                               |
| ----------- | -------------------------------- |
| **핵심 포인트**  | `static { ... }` 블록에서 입력값을 읽고 검증 |
| **출력 조건**   | 음수 또는 0이면 예외 메시지 출력              |
| **main 동작** | flag가 true일 때만 넓이 계산             |
| **문법 포인트**  | `static` 블록은 클래스 로딩 시 한 번 실행됨    |

---

📘 **한 줄 요약**

> `static` 초기화 블록에서 입력값을 읽고,
> `Breadth`와 `Height`가 양수일 때만 넓이를 출력하며,
> 그렇지 않으면 `"java.lang.Exception: Breadth and height must be positive"` 를 출력한다.
