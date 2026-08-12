// Last updated: 12/08/2026, 11:26:46
function addBinary(a, b) {
    let result = "";
    let carry = 0;
    let i = a.length - 1;
    let j = b.length - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
        const bitA = i >= 0 ? Number(a[i]) : 0;
        const bitB = j >= 0 ? Number(b[j]) : 0;

        const sum = bitA + bitB + carry;
        result = (sum % 2) + result;
        carry = Math.floor(sum / 2);

        i--;
        j--;
    }

    return result;
}