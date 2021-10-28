// 콜백함수 : 자바스크립트에서는 인자에 함수를 넣을 수있다. 그 함수를 다시 호출하는것을 callback이라고 부른다.

console.log("hello");

function add5(a, callback) {
  // console.log("들어온 숫자", a, callback);
  console.log("숫자는", a);
  total = a + 5;
  if (total < 100) {
    setTimeout(() => print(total, callback), 3000);
    // add5(total, callback);
  }
}

function print(a, callback) {
  console.log(a);
  add5(a, callback);
}

add5(10, function (res) {
  console.log(res);
});
