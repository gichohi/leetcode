export const isValid = (s: string): boolean => {

    const stack: string[] = [];
    const chars: string[] = s.split('');

    const dict = new Map<string, string>([
        ["{", "}"],
        ["[", "]"],
        ["(", ")"]
    ]);
  
    for (let i=0;i<s.length;i++) {
        if (dict.has(s[i])) {
            stack.push(s[i]);
        } else {
            const p = stack.pop();
            if(dict.get(p!) !== s[i]){
                return false;
            }
        }
    }

    return stack.length == 0;
}
