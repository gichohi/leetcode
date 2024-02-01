import { isValid } from "../../src/validParentheses/validparentheses";

describe('testing parentheses validity', () => {
    it('should return an array of numbers', () => {
        const valid = "{{()}}";
        const invalid = "[}";
        expect(isValid(valid)).toEqual(true);
        expect(isValid(invalid)).toEqual(false);
    });
});