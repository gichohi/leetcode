# frozen_string_literal: true
require 'rspec'
require_relative '../../lib/validparentheses/parentheses'

RSpec.describe Parentheses do
  it "should return true given valid parentheses" do
    parentheses = Parentheses.new
    valid = "{{()[]}}"
    expect(parentheses.is_valid(valid)).to eq(true)
  end

  it "should return false given invalid parentheses" do
    parentheses = Parentheses.new
    valid = "{{(){[]}}"
    expect(parentheses.is_valid(valid)).to eq(false)
  end
end


