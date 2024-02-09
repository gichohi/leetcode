def longest_palindromic_substring(s: str) -> str:
    # Preprocess the string to insert special characters '#'
    processed_string = '#' + '#'.join(s) + '#'
    n = len(processed_string)

    # Initialize an array to store the length of the palindrome centered at each index
    palindrome_lengths = [0] * n

    # Initialize variables for the center and right boundary of the current palindrome
    center = right = max_length = max_center = 0

    for i in range(n):
        # Calculate the mirror index of the current index with respect to the center
        mirror = 2 * center - i

        # Check if the current index is within the right boundary
        if i < right:
            palindrome_lengths[i] = min(right - i, palindrome_lengths[mirror])

        # Attempt to expand the palindrome centered at the current index
        while i - palindrome_lengths[i] - 1 >= 0 and i + palindrome_lengths[i] + 1 < n \
                and processed_string[i - palindrome_lengths[i] - 1] == processed_string[i + palindrome_lengths[i] + 1]:
            palindrome_lengths[i] += 1

        # Update the center and right boundary if the palindrome centered at the current index expands beyond the
        # current boundary
        if i + palindrome_lengths[i] > right:
            center = i
            right = i + palindrome_lengths[i]

        # Update the maximum palindrome length and its center
        if palindrome_lengths[i] > max_length:
            max_length = palindrome_lengths[i]
            max_center = i

    # Extract the longest palindrome substring
    start = (max_center - max_length) // 2
    return s[start:start + max_length]


# Example usage:
s = "gracecars";
print(longest_palindromic_substring(s))  # Output: "bab" or "aba"
