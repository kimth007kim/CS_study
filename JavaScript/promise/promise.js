function getData() {
  return new Promise(function (resolve, reject) {
    var data = 100;
    resolve(data);
  });
}

getData().then(function (resolvedDate) {
  console.log(resolvedData);
});
