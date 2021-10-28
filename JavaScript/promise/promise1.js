// Promise 객체는 비동기 작업이 맞이할 미래의 완료 또는 실패와 그 결과값
// 상태
// 대기:초기 상태
// 이행:연산이 성공적으로 완료
// 거부: 연산 실패

// function add10(a) {
//   return new Promise((resolve) => setTimeout(() => resolve(a + 10), 100));
// }

function add10(a) {
  return new Promise();
}
a = 1;
console.log(add10(a));
