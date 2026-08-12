// Last updated: 12/08/2026, 11:26:43
function mySqrt(x) {
    if (x < 2) return x;

    let left = 1, right = x, ans = 0;

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        
        if (mid * mid <= x) {
            ans = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return ans;
}

// Test cases
console.log(mySqrt(4));   // Output: 2
console.log(mySqrt(8));   // Output: 2
console.log(mySqrt(16));  // Output: 4
console.log(mySqrt(0));   // Output: 0