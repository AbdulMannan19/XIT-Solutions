num = 10

q = int(num/3)

r = num%3

if(r==0):
  max = pow(3, q)

elif(r==1):
  max = pow(3, q-1)*4

else: 
  max = pow(3, q)*2

print(max)