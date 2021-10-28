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

const print = (a, callback) => {
  console.log(a);
  add(a, callback);
};

add5(10, function (res) {
  console.log(res);
});
