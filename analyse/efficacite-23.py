# Algorithme de suppression des espaces isolés dans une chaîne de caractères
# La complexité est en O(n)

texte = "cou cou  J M  B"
print(texte + '.')

# Conversion de la chaîne de caractères en une liste afin de pouvoir supprimer un élément
l = list (texte)

# Indice de parcours de la liste
i = 0

# Traitement spécifique pour supprimer un éventuel espace en tête
if l[0] == ' ' and l[1] != ' ':
    del(l[0])

# Traitement spécifique pour supprimer un éventuel espace en fin
if l[len(l)-1] == ' ' and l[len(l)-2] != ' ':
    del(l[len(l)-1])

# Parcours de la liste en recherchant un groupe de 3 caractères :
# le 1er différent de l'espace
# le 2ème égal à un espace
# le 3ème différent de l'espace
while i < len(l)-2:
    if l[i] != ' ' and l[i+1] == ' ' and l[i+2] != ' ':
        # Si ce motif est trouvé, on supprime l'espace du milieu
        del(l[i+1])
    i+=1

# Reconversion de la liste en chaîne de caractères
print ("".join(l) + '.')