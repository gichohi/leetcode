# frozen_string_literal: true
require 'rspec'
require_relative '../../lib/removeduplicates/remove_duplicates'

describe RemoveDuplicates do
  it 'returns 5' do
    nums = [1,1,1,2,2,3,3,4]
    r = RemoveDuplicates.new
    result = r.remove_duplicates(nums)
    expect(result).to eq 7
  end

  it 'returns 5' do
    nums = [1,1,1,2,2,3]
    r = RemoveDuplicates.new
    result = r.remove_duplicates(nums)
    expect(result).to eq 5
  end
end
