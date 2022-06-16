# return string without spaces
def erase(cc):
    """
    Removes only single spaces from given string.
    :param text : string to edit
    :return : edited string
    """
    #tour = 0
    listwords = list(cc)    
    for i, char in enumerate(listwords):
        #tour+=1
        wordslength = len(listwords)
        if (char == " " and wordslength == 1) or (char == " "
          and listwords[max(i-1, int(wordslength > 1))] != " " 
          and listwords[min(i+1, wordslength-int(wordslength > 1)*2)] != " "):
            #tour+=1
            del listwords[i]
    #print(tour)
    return "".join(char for char in listwords)

def main():
  fichier = open("C:\\Users\\ruben\\Desktop\\sae2-02-RubenLongeque4B\\src\\texteE.txt", "r")
  texte =""
  for i in fichier.read():
        texte+=i
    
  fichier.close()
  erase(texte)

main()