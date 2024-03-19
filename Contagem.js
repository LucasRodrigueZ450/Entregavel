function countInRange(numbers, N) {
    let count = 0;
    for (let num of numbers) {
        if (num >= numbers[0] && num <= N) {
            count++;
        }
    }
    return count;
}

console.log(countInRange([2, 4, 6, 8, 10], 7));