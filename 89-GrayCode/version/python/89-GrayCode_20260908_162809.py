# Last updated: 08/09/2026, 16:28:09
1class Solution:
2    def grayCode(self, n):
3        return [i ^ (i >> 1) for i in range(2 ** n)]
4        