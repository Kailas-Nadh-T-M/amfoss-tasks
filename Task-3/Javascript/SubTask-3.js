const n = parseInt(prompt('Enter the number of lines for the diamond:'), 10);
let diamond = '';

if (Number.isInteger(n) && n > 0) {
    for (let i = 0; i < n; i++) {
        diamond += ' '.repeat(n - i - 1) + '*'.repeat(2 * i + 1) + '\n';
    }
    for (let i = n - 2; i >= 0; i--) {
        diamond += ' '.repeat(n - i - 1) + '*'.repeat(2 * i + 1) + '\n';
    }
    console.log(diamond);
} else {
    console.log('Please enter a positive integer.');
}
