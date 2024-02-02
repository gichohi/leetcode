# frozen_string_literal: true
# Given a string s, find the length of the longest
# substring without repeating characters.
class Substring
  # @param {String} s
  # @return {Integer}
  # Use sliding window
  def length_of_longest_substring(s)
    map = {}
    longest = 0
    left = 0
    right = 0
    chars = s.split('')
    while right < chars.length
      # if chars[i] is not in map, increase the windows size
      if !map.has_key?(chars[right])
        longest = longest > right - left + 1 ? longest : right - left + 1
      else
        # if s[i] is not in current window,
        # increase the window size
        if map[chars[right]] < left
          longest = longest > right - left + 1 ? longest : right - left + 1
          # if s[i] is in current window,
          # move the left pointer
        else
          left = map[chars[right]] + 1
        end
      end
      map[chars[right]] = right
      right += 1
    end
    longest
  end
end
