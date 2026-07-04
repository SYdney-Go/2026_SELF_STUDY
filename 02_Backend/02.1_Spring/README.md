Do it! 자바 완전 정복 교재를 기반으로 Spring까지 학습합니다.

## 학습 진행

| 챕터 | 주제 | 실습 코드 | 정리 노트 |
|------|------|-----------|-----------|
| Chapter01 | 자바 시작하기 | `sec01_basicsyntax` EX01~03 | `1장. 자바 시작하기.md` |
| Chapter02 | 자료형 | `sec01_datatype`, `sec02_primarydatatype` EX01~06 | `2장. 자료형.md` |
| Chapter03 | 연산자 | `sec01_operator_1` EX01~07 | `3장. 연산자.md` |
| Chapter04 | 제어문과 제어 키워드 | `sec01`~`sec04` EX01~03 | `4장. 제어문과 제어 키워드.md` |
| Chapter05 | 참조 자료형 | `sec01_array` EX01~10, `sec02_string` EX01~06 | `5장. 참조 자료형.md` |

## Chapter05 실습 목록

### 5.1 배열 (`sec01_array`)

| 예제 | 클래스 | 내용 |
|------|--------|------|
| EX01 | `ArrayDefinition` | 배열 선언 |
| EX02 | `ValueAssignment` | 값 대입 |
| EX03 | `InitialValue` | 초기값 |
| EX04 | `PrimaryAndReferenceType` | 기본형 vs 참조형 |
| EX05 | `ReadArrayData` | 1차원 배열 출력 |
| EX06 | `RectangleArrayDefinition` | 2차원 정방 행렬 선언 |
| EX07 | `RectangleValueAssignment` | 2차원 정방 행렬 값 대입 |
| EX08 | `NonRectangleArray` | 2차원 비정방 행렬 |
| EX09 | `ReadArrayData_2D` | 2차원 배열 출력 |
| EX10 | `ArgumentOfMainMethod` | `main` 매개변수 (`args`) |

### 5.2 String (`sec02_string`)

| 예제 | 클래스 | 내용 |
|------|--------|------|
| EX01 | `CreateStringObject` | String 객체 생성 |
| EX02 | `ModificationOfStringData` | 문자열 수정 vs 배열 수정 |
| EX03 | `SharingStringObject` | 문자열 리터럴 객체 공유 |
| EX04 | `PlusOperationOfString` | `+` 연산으로 문자열 연결 |
| EX05 | `MethodsOfString_1` | `length`, `charAt`, `indexOf` 등 |
| EX06 | `MethodsOfString_2` | `replace`, `split`, `equals` 등 |

## 실습 실행 방법

각 챕터의 `src` 폴더에서 컴파일·실행합니다. 패키지 구조를 유지해야 합니다.

```powershell
cd "Chapter05\src"
javac sec02_string/EX01_CreateStringObject/CreateStringObject.java
java sec02_string.EX01_CreateStringObject.CreateStringObject
```

`main` 매개변수 실습(EX10)은 실행 시 인자를 함께 넘깁니다.

```powershell
java sec01_array.EX10_ArgumentOfMainMethod.ArgumentOfMainMethod hello 30 world
```

## 실습 코드 출처

`Chapter01`~`Chapter19`의 Java 실습 코드(`src/` 하위 `.java`)는 아래 저자 GitHub 저장소의 예제를 참고하여 **개인 학습 목적**으로 연습한 것입니다.

- **저자:** [kimdh-hyw](https://github.com/kimdh-hyw)
- **참고 저장소 예:** [chap01_basicsyntax](https://github.com/kimdh-hyw/chap01_basicsyntax), [chap02_datatypeandprimarydatatype](https://github.com/kimdh-hyw/chap02_datatypeandprimarydatatype) 등

원본 예제의 저작권은 해당 저자 및 교재 출판사에 있습니다.  
이 저장소에는 학습 정리와 실습 기록만 포함합니다.
