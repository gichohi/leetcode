# frozen_string_literal: true
class RemoveDuplicates
  def remove_duplicates(nums)
    if nums.length < 2
      return nums.length
    end
    left, right = 2, 2
    while right < nums.length
      if nums[left - 2] != nums[right]
        nums[left] = nums[right]
        left += 1
      end
      right += 1
    end
    left
  end
end
