class BinaryTree(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
        self.parent = None


class Solution(object):
    def isValidBST(self, node):
        return self.validate(node, None, None)

    def validate(self, node, low, high):
        if node is None:
            return True
        if (low and node.val <= low) or (high and node.val >= high):
            return False
        return self.validate(node.left, low, node.val) and self.validate(node.right, node.val, high)


if __name__ == '__main__':
    root = BinaryTree(3)
    root.left = BinaryTree(9)
    root.right = BinaryTree(20)
    root.right.left = BinaryTree(15)
    root.right.right = BinaryTree(7)
    print(Solution().isValidBST(root))
