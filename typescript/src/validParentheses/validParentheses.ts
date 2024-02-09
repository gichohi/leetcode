export const isValid = (s: string): boolean => {

    const stack: string[] = [];
    const chars: string[] = s.split('');

    const dict = {
        "{": "}",
        "[": "]",
        "(": ")"
    }

    for (const ch of chars) {
        if (dict.hasOwnProperty(ch)) {
            stack.push(ch);
        } else {
            if (stack.length === 0) {
                return false;
            } else {
                const lastOpenedBracket = stack.pop();
                if (dict[lastOpenedBracket] !== ch) {
                    return false;
                }
            }
        }
    }


    return stack.length === 0;
}

const s = "[)";
console.log(isValid(s));
