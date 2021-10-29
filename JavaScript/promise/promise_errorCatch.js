function getData() {
  return new Promise(function (resolve, reject) {
    reject("failed");
  });
}

// 1. then()의 두번째 인자로 에러를 처리하는 코드

// getData().then(
//   function () {},
//   function (err) {
//     console.log(err);
//   }
// );

getData()
  .then()
  .catch((err) => console.log(err));
