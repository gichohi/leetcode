import unittest

from group_anagrams.group_anagrams import Solution


class TestSolution(unittest.TestCase):
    def testGroupAnagrams(self):
        solution = Solution()
        words = ["eat", "tea", "tan", "ate", "nat", "bat"]
        expected = [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]
        actual = solution.groupAnagrams(words)

        self.assertListEqual(expected, actual)

    def testGroupAnagrams2(self):
        solution = Solution()
        words = ["cat", "dog", "tac", "edoc", "god", "tacact", "act", "code", "deno", "node", "ocde", "done", "catcat"]
        expected = [['cat', 'tac', 'act'], ['dog', 'god'], ['edoc', 'code', 'ocde'], ['tacact', 'catcat'],
                    ['deno', 'node', 'done']]
        actual = solution.groupAnagrams(words)

        self.assertListEqual(expected, actual)
