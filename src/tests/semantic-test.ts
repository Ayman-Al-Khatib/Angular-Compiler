// types doesn't match
const test:boolean = 1;

// types doesn't match 2
const test2 = true;
test2 = 'string';

// duplicate variable declaration
const test2 = 'true';

// undefined variable
unde = true;

// undefined variable 2
const test3 = notDef;

if (true) {
    const test3 = notDef;
    const inScope = 1;
}
const inScope = 2;

for (let i = 0; i < inScope; i++) {
    const d = 1;
}

function test (one: number, two: number) {
 return one + two;
}

test(1);

testtwo(2);

const functionTest = (paramOne, paramTwo) => { return paramOne + paramTwo; }

functionTest(1,2,3);


