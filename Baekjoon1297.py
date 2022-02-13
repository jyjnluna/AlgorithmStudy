D,H,W = map(int,input().split())
Height = int((H*D) / (((H**2) + (W**2)) ** (1/2)))
Width = int((W*D) / (((H**2) + (W**2)) ** (1/2)))
print(Height, Width)
