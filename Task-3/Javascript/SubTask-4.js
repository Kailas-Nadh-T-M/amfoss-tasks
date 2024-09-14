const fs = require('fs');

fs.readFile('input.txt', 'utf8', (err, data) => {
    if (err) throw err;

    const n = parseInt(data.trim(), 10);
    let diamond = '';

    if (Number.isInteger(n) && n > 0) {
        for (let i = 0; i < n; i++) {
            diamond += ' '.repeat(n - i - 1) + '*'.repeat(2 * i + 1) + '\n';
        }
        for (let i = n - 2; i >= 0; i--) {
            diamond += ' '.repeat(n - i - 1) + '*'.repeat(2 * i + 1) + '\n';
        }
    } else {
        diamond = 'Please enter a positive integer.';
    }

    fs.writeFile('output.txt', diamond, (err) => {
        if (err) throw err;
        console.log('Diamond pattern written to output.txt');
    });
});
