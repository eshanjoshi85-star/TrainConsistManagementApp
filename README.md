UC17: Sort Bogie Names Using Arrays.sort()
Drawback of UC16 Approach
In UC16, sorting was performed manually using Bubble Sort.
While useful for learning, Bubble Sort has limitations:
• It is inefficient for large data sets.
• Time complexity is O(n²).
• Real systems should not rely on manual algorithms for production.
In railway reporting and dashboards:
• Bogie names must be sorted frequently.
• Output must be fast and reliable.
• Code should be simple and maintainable.
Instead of reinventing sorting logic, Java provides highly optimized built-in algorithms.
That is why UC17 introduces Arrays.sort().
Goal
Sort bogie type names alphabetically using Java’s built-in Arrays.sort() method.
