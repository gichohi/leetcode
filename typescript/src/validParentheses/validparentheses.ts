export const isValid = (s: string): boolean => {

    const stack: string[] = [];
    const chars: string[] = s.split('');

    let map = new Map<string, string>();
    map.set('{', '}');
    map.set('[', ']');
    map.set('(', ')');

    chars.forEach((ch) => {
        if(map.get(ch)){
            stack.push(ch);
        } else {
            if(stack.length == 0) {
                return false;
            }
            else {
                let char = stack.pop();
                let str = map.get(char!);
                if(str != ch){
                    return false;
                }
            }   
        }
    });

    return stack.length == 0;

    return stack.length == 0;
}