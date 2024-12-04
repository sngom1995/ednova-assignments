def largestRectangle(rectangle_heights):
    stack = []
    max_area = 0
    rectangle_heights.append(0)
    for i, h in enumerate(rectangle_heights):
        start = i
        while stack and stack[-1][1] > h:
            index, height = stack.pop()
            max_area = max(max_area, height * (i - index))
            start = index
        stack.append((start, h))
    return max_area


print(largestRectangle([2,1,5,6,2,3]))
print(largestRectangle([1, 2, 5, 6]))