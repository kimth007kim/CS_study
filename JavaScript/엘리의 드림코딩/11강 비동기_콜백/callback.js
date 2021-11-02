"use strict";
// 자바스크립트는 동기적이다.
// 동기적이다 호이스팅이 된 이후부터 작성한 순서에 의해서 하나하나씩 실행된다.동기적이다
// 호이스팅: var, function 선언 들이 가장 위로 올라가는것

console.log("1");
setTimeout(() => console.log("2"), 3000);
// console.log("2");
console.log("3");

// 동기 콜백
function printImmediately(print) {
  print();
}

printImmediately(() => console.log("hello"));

// 비동기 콜백

function printWithDelay(print, timeout) {
  setTimeout(print, timeout);
}

printWithDelay(() => console.log("async callbacck"), 2000);

class UserStorage {
  loginUser(id, password, onSuccess, onError) {
    setTimeout(() => {
      if (
        (id === "ellie" && password === "dream") ||
        (id === "coder" && password === "academy")
      ) {
        onSuccess(id);
      } else {
        onError(new Error("not found"));
      }
    }, 2000);
  }
  getRoles(user, onSuccess, onError) {
    setTimeout(() => {
      if (user === "ellie") {
        onSuccess({ name: "ellie", role: "admin" });
      } else {
        onError(new Error("no access"));
      }
    }, 1000);
  }
}

const userStorage = new UserStorage();
const id = prompt("enter your id");
const password = prompt("enter your password");
userStorage.loginUser(
  id,
  password,
  (user) => {
    userStorage.getRoles(
      user,
      (userWithRole) => {
        alert(
          `Hello ${userWithRole.name}, you hava a ${userWithRole.role} role`
        );
      },
      (error) => {
        console.log(error);
      }
    );
  },
  (error) => {
    console.log(error);
  }
);
