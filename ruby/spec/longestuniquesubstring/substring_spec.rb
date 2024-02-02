# frozen_string_literal: true

require 'rspec'
require_relative '../../lib/longestuniquesubstring/substring'

RSpec.describe Substring do
  it "returns 3 given 'abcabcbb'" do
    s = "abcabcbb"
    expect(Substring.new.length_of_longest_substring(s)).to eq(3)
  end

  it "returns 3 given 'bcbdefac'" do
    t = "bcbdefac"
    expect(Substring.new.length_of_longest_substring(t)).to eq(6)
  end

end

