"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.isValid = void 0;
var isValid = function (s) {
    var stack = [];
    var chars = s.split('');
    var dict = {
        "{": "}",
        "[": "]",
        "(": ")"
    };
    for (var _i = 0, chars_1 = chars; _i < chars_1.length; _i++) {
        var ch = chars_1[_i];
        if (dict.hasOwnProperty(ch)) {
            stack.push(ch);
        }
        else {
            if (stack.length === 0) {
                return false;
            }
            else {
                if (dict[ch] == undefined || dict[ch] !== stack.pop()) {
                    return false;
                }
            }
        }
    }
    return stack.length === 0;
};
exports.isValid = isValid;
var s = "[)";
console.log((0, exports.isValid)(s));
