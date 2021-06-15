function activeTrade() {
  const result = {};

  const mostActive = customers.reduce((acc, curr) => {
    acc[curr] = (acc[curr] ?? 0) + 1;
    if ((acc[curr] / customers.length) * 100 >= 5.0) {
      result[curr] = acc[curr];
    }
    return acc;
  }, {});

  console.log(mostActive);
  console.log(result);
}

let customers = [
  'Bigcorp',
  'Bigcorp',
  'Acme',
  'Bigcorp',
  'Zork',
  'Zork',
  'Abe',
  'Bigcorp',
  'Acme',
  'Bigcorp',
  'Bigcorp',
  'Zork',
  'Bigcorp',
  'Zork',
  'Zork',
  'Bigcorp',
  'Acme',
  'Bigcorp',
  'Acme',
  'Bigcorp',
  'Acme',
  'Littlecorp',
  'Nadircorp',
];

const sorting = customers.sort();

activeTrade(sorting);
