# return string without spaces
import re

from regex import T
def erase(cc):
    #tour = 0
    return re.sub("(?<!\s)\s(?!\s)",'',cc) #and print(tour+1)

def main():
      fichier = open("C:\\Users\\ruben\\Desktop\\sae2-02-RubenLongeque4B\\src\\texteE.txt", "r")
      texte =""
      for i in fichier.read():
        texte+=i
      fichier.close()
      erase(texte)

main()