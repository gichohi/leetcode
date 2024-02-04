from typing import List


class Solution:
    def groupAnagrams(self, words: List[str]) -> List[List[str]]:
        words_dict = {}
        for word in words:
            freq_list = [0] * 26

            # for each letter in word increment the freq_ist array
            for ch in word:
                freq_list[ord(ch) - ord('a')] += 1
            # convert array to tuple in order to use it as a key to the dict
            freq_list_tuple = tuple(freq_list)
            # anagram words will produce the same tuple
            if freq_list_tuple not in words_dict:
                words_dict[freq_list_tuple] = [word]
            else:
                words_dict[freq_list_tuple].append(word)

        return list(words_dict.values())