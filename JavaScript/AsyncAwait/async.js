function add10(a) {
  return new Promise((resolve) => setTimeout(() => resolve(a + 10), 1000));
}

async function f1() {
  const a = await add10(10);
  const b = await add10(a);
}

// const add10 = (a) => {};

f1();
