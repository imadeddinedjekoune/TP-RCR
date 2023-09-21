import sys, os, re, random
if len(sys.argv) < 2: 
    print("veillez indiquer un fichier de base de connaissances")
    exit()
# on utilise un fichier temporaire pour representer BC∪{¬phi}
f_input = open(sys.argv[1], mode='r', encoding='utf-8')
f_tmp = open("tmp.cnf", mode='w', encoding='utf-8')
phi = 0
for line in f_input:
# lecture du fichier jusqu'a trouver la ligne d'entête 
    if len(line) > 0 and line[0] == 'p':
        # generer un litteral et mettre a jour l'entête
        x = re.split(r'\s+', line)[:4]
        print(x)
        phi = random.randint(1, int(x[2])) #generer random phi  
        if random.randint(0, 1) == 0: # generer random sing 
            phi = -phi
            print("phi =", phi)
            f_tmp.write("p cnf " + x[2] + " " + str(int(x[3]) + 1) + "\n") # incremanter le nbr des clauses
            break;
    else:
        f_tmp.write(line)
# continuer la lecture du fichier jusqu'a la fin
for line in f_input:
    f_tmp.write(line)
# ajouter la negation du litteral genere a la fin de fichier
f_tmp.write(str(-phi) + " 0\n")
f_input.close()
f_tmp.close()
# on execute ubcsat avec le nouveau fichier comme argument
os.system("ubcsat -alg saps -i tmp.cnf -solve -r out null -r stats null")
os.remove("tmp.cnf")