# frozen_string_literal: true

require 'rspec'
require_relative '../../lib/subsequence/subsequence'

RSpec.describe Subsequence do
  it "should return true is s is a subsequence of t" do
    s = "abc"
    t = "ahbgdc"
    expect(Subsequence.new.is_subsequence(s, t)).to be(true)
  end
end

