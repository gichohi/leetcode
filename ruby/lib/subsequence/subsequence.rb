# frozen_string_literal: true

class Subsequence
  # @param {String} s
  # @param {String} t
  # @return {Boolean}
  def is_subsequence(s, t)
    chars = s.split('')
    chs = t.split('')
    u, v = {}, {}
    chars.each do |ch|
      if u.has_key?(ch)
        u[ch] += 1
      else
        u[ch] = 1
      end
    end
    chs.each do |ch|
      if u.has_key?(ch)
        if v.has_key?(ch)
          v[ch] += 1
        else
          v[ch] = 1
        end
      end
    end
    false
  end

end
