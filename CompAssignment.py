import random
import os

source = open("source.txt")
x=[]
lines = source.readlines()

for i in range(0,len(lines),2):
    x.extend(lines[i].split())
    ip=""

    while(ip.lower()!="quit"):
        os.system("clear")
        l=random.choice(list(set(x)))
        count,u,w=7,[],list("_"*len(l))

        while(count>0 and "".join(w)!=l):
            print("\n",count,"attempts left\tincorrect attempts ",u,"\n")
            print("\t"," ".join(w),"\n")
            ip = input(" Enter A Character : ")

            if(ip.lower() in l.lower()):
                print("Character ",ip," found")
                i=0

                while(i<len(l)):
                    if(ip.lower()==l[i].lower()):
                        w[i]=l[i]
                        i += 1

                    elif(ip.lower() not in u):
                        print("Character ",ip," not found")
                        u.append(ip)
                        count -= 1
                        if(count==0):
                            print("\n\nNumber Of Attempts exhausted\n\t\tThe correct word was :\t",l,"\nThe word means :\n",lines[(x.index(l))*2 + 1] )
                            ip=input("\nEnter 'quit' to quit else press any key to continue: ")

                        else:
                            print("\n\nYou gussed the word '", l, "' with ",count,"attempt(s) remaining" "\nThe word means :\n\t",lines[(x.index(l))*2 + 1] )
                            ip=input("\nEnter 'quit' to quit else press any key to continue: ")
                            source.close()
