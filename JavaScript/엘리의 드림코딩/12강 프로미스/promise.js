"use strict";
// 자바스크립트안에 내장된 객체인데 비동기적인것을 수행할때 콜백대신에 사용할수있다.
// 알아둬야할점 두가지
// 1.state
// 2.producer 와 consumer

// state:pending ->fulfilled or rejected
// Producer vs Consumer

// 1. Producer
// promise를 만드는 순간 executor가 바로 실행된다.
const promise = new Promise((resolve, reject) => {
  // doing some heavy Worker(network,read files)

  console.log("doing something....");
  setTimeout(() => {
    resolve("ellie");
    reject(new Error("no network"));
  }, 2000);
});

// 2. Consumers:then,catch,finally

promise
  .then((value) => {
    console.log(value);
  })
  // then 을 리턴하면 똑같은 promise가 리턴되기때문에 catch를 사용가능
  .catch((error) => {
    console.log(error);
  })
  // 성공하든 실패하든 실행되는것 finally
  .finally(() => {
    console.log("finally");
  });

// 3. Promise Chaining
const fetchNumber = new Promise((resolve, reject) => {
  setTimeout(() => resolve(1), 1000);
});

fetchNumber
  // then에는 값을 바로 전달할수도있고, 프로미스를 전달해도된다.
  .then((num) => num * 2)
  .then((num) => num * 3)
  .then((num) => {
    return new Promise((resolve, reject) => {
      setTimeout(() => resolve(num - 1), 1000);
    });
  })
  .then((num) => console.log(num));

// 4. Error Handling
const getHen = () =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve("닭"), 1000);
  });
const getEgg = (hen) =>
  new Promise((resolve, reject) => {
    setTimeout(() => reject(new Error(`${hen}=> 알`)), 1000);
  });
const cook = (egg) =>
  new Promise((resolve, reject) => {
    setTimeout(() => resolve(`${egg}=>프라이`), 1000);
  });

getHen() //.then((hen) => getEgg(hen)) 매개변수 바로 전달하면 생략이 가능하다.
  .then(getEgg)
  .catch((error) => {
    return "빵";
  }) //전달되어진 에러가생겨도 대체 해고싶을때
  .then(cook)
  .then(console.log)
  .catch(console.log); // 에러를 캐치할때 제일 밑에다가 적으면 에러가 잡혀진다.
