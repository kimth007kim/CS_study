const add5 = (a, callback) => {
  setTimeout(() => callback(a + 5), 100);
};
add5(10, (res) => {
  add5(res, (res) => {
    add5(res, (res) => {
      add5(res, (res) => {
        console.log(res);
      });
    });
  });
});
