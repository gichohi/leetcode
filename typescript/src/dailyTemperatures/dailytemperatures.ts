export const dailyTemperatures = (temperatures: number[]): number[] => {
    const tempStack: number[] = [];
    const indexStack: number[] = [];
    const out: number[] = new Array(temperatures.length).fill(0);
    for(let i=0;i<temperatures.length;i++){
        while(tempStack.length > 0 && temperatures[i] > tempStack[tempStack.length - 1]) {
           tempStack.pop();
           const idx = indexStack.pop();
           out[idx!] = i - idx!;
        }
        tempStack.push(temperatures[i]);
        indexStack.push(i);
    }
    return out;
    
};