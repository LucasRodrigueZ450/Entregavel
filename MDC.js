function mdc(a, b) {
    if (b === 0) return a;
    return mdc(b, a % b);
}

console.log(mdc(24, 36));