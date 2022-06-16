import time
from unittest import result
import codewars_test as test
from Efficacite67LEB import erase
from codecarbon import track_emissions

@track_emissions(offline=True, country_iso_code="FRA")
def main():
    tempsDebut = time.time()
    fichier = open("C:\\Users\\ruben\\Desktop\\sae2-02-RubenLongeque4B\\src\\texteE.txt", "r")
    
    texteEntree = ''
    for i in fichier.read():
        texteEntree+=i
    
    fichier.close()

    fichier2 = open("C:\\Users\\ruben\\Desktop\\sae2-02-RubenLongeque4B\\src\\texteS.txt", "r")
    texteSortie = ''
    for i in fichier2.read():
        texteSortie+=i
    
    fichier2.close()

    tempsFin = time.time()
    tempsLecture = tempsFin - tempsDebut
    print(f'Temps de lecture : {tempsLecture:.02}ms')

    resultat=[]
    for i in range(100):
        tempsDebut = time.time()
        texte = erase(texteEntree)
        tempsFin = time.time()
        tempsDuree = tempsFin - tempsDebut
        print(f'Temps que ça prend : {tempsDuree:.02}ms')
        resultat.append(tempsDuree)
        test.assert_equals(texteSortie,texte)
    
    somme = 0
    for i in range(len(resultat)):
        somme+=resultat[i]
    
    res = somme/len(resultat)
    print(f'Moyenne de temps : {res:.02}ms')

main()