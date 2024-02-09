import { isValid } from "../../src/validParentheses/validParentheses";

describe('testing parentheses validity', () => {
    it('should return true for valid parentheses and else false', () => {
        const valid = "{{()}}";
        const invalid = "[}";
        expect(isValid(valid)).toEqual(true);
        expect(isValid(invalid)).toEqual(false);
    });
});