class MinStack:
    def __init__(self):
        self.main_stack = []
        self.min_stack = []

    def push(self, val: int) -> None:
        self.main_stack.append(val)
        if not self.min_stack or val <= self.min_stack[-1]:
            self.min_stack.append(val)

    def pop(self) -> None:
        if not self.main_stack:
            raise IndexError("Stack is empty")
        if self.main_stack[-1] == self.min_stack[-1]:
            self.min_stack.pop()

        self.main_stack.pop()

    def top(self) -> int:
        if not self.main_stack:
            raise IndexError("Stack is empty")

        return self.main_stack[-1]

    def getMin(self) -> int:
        if not self.min_stack:
            raise IndexError("Stack is empty")

        return self.min_stack[-1]


min_stack = MinStack()
min_stack.push(-2)
min_stack.push(-43)
min_stack.push(-50)
min_stack.push(7)
min_stack.push(3)
min_stack.push(0)
min_stack.push(-3)


print(min_stack.getMin())
min_stack.pop()
print(min_stack.top())
print(min_stack.getMin())
