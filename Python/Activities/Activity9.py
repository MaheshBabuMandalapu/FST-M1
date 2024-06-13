firstlist=[1,2,3,4,5]
secondlist=[6,7,8,9,0]
print("First list :", firstlist)
print("Secoond list :",secondlist)

newlist=[]
for num in firstlist:
    if(num%2!=0):
        newlist.append(num)
for num in secondlist:
    if(num%2==0):
        newlist.append(num)

print("New list is :",newlist)        
