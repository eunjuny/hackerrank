전체 해설 정리 ✅

# 문제 요지

* 입력: `MM DD YYYY` 형식의 월/일/년
* 목표: 해당 날짜의 **요일을 영어 대문자**로 출력 (`WEDNESDAY` 등)
* 요구 메서드: `findDay(int month, int day, int year)` → `String`

# 핵심 포인트

1. **Calendar 사용 & 월 보정**

* `Calendar`의 `MONTH` 필드는 **0부터 시작**합니다.

  * 1월=0, 2월=1, …, 12월=11
  * **반드시 `cal.set(Calendar.MONTH, month - 1)`** 로 설정해야 함 (오프바이원 방지)

2. **날짜 설정**

```java
Calendar cal = Calendar.getInstance();
cal.set(Calendar.YEAR, year);
cal.set(Calendar.MONTH, month - 1);   // 중요!
cal.set(Calendar.DAY_OF_MONTH, day);
```

3. **요일 문자열 얻기**

* `getDisplayName(field, style, locale)`

  * `field`: `Calendar.DAY_OF_WEEK` (요일 필드)
  * `style`: `Calendar.LONG` → “Wednesday” 같은 **풀네임**
  * `locale`: `Locale.US` → 영어 요일명
* 결과를 `.toUpperCase()`로 대문자화 → “WEDNESDAY”

4. **입출력 형식**

* 입력 예: `08 05 2015`
* 출력 예: `WEDNESDAY`

5. **엣지/주의사항**

* `month-1` 누락 시 잘못된 날짜/요일 계산됨.
* `Locale`을 US가 아닌 다른 로케일로 두면 한글/프랑스어 등으로 나올 수 있음.
* `Calendar`는 시간대 영향을 받지만, 우리는 **연/월/일만 설정**하므로 요일 계산에 일반적으로 문제 없음.
* 윤년/말일 검증은 `Calendar`가 내부적으로 처리.

# 정답 코드 (HackerRank 기본 템플릿 호환, Java 15)

```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1); // 0-based (1월=0)
        cal.set(Calendar.DAY_OF_MONTH, day);

        String dayName = cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US)
                            .toUpperCase();
        return dayName;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();
        sc.close();

        System.out.println(Result.findDay(month, day, year));
    }
}
```

# 검증 예시

* 입력: `08 05 2015` → 출력: `WEDNESDAY`

요약: **`month - 1` 보정으로 정확한 날짜 설정 → `getDisplayName(DAY_OF_WEEK, LONG, Locale.US)` → `.toUpperCase()`** 순으로 구현하면 정답입니다. think about it step-by-step
