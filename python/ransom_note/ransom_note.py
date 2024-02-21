class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        r = {}
        m = {}
        for ch in magazine:
            m[ch] = m.get(ch, 0) + 1

        for ch in ransomNote:
            r[ch] = r.get(ch, 0) + 1

        for k, v in r.items():
            if m.get(k, 0) < v:
                return False

        return True


ransomeNote = "a"

magazine = "b"

print(Solution().canConstruct(ransomeNote, magazine))
