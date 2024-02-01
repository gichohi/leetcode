# frozen_string_literal: true

class Parentheses
  # @param {String} s
  # @return {Boolean}
  def is_valid(s)
    stack = []
    map = { "{" => "}", "[" => "]", "(" => ")" }
    if s.length == 0
      return false
    end
    chars = s.split('')
    chars.each do |char|
      if map.has_key?(char)
        stack.push(char)
      else
        ch = stack.pop
        if map[ch] != char
          return false
        end
      end
    end
    stack.empty?
  end
end
