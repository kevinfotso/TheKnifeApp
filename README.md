================================================================================
                                THE KNIFE
                    Piattaforma per la ricerca di ristoranti
================================================================================

AUTORI:
- TCHIDJO FOTSO KEVIN - 755906 - VA

================================================================================
REQUISITI SISTEMA:
================================================================================
- Java JDK 17 o superiore
- Sistema operativo: Windows, macOS, Linux

================================================================================
STRUTTURA PROGETTO:
================================================================================
/src/           - Codice sorgente Java
/bin/           - File eseguibili (.jar)
/data/          - File dati CSV (ristoranti.csv, utenti.csv, recensioni.csv)
/doc/           - Documentazione (JavaDoc, manuali)
/lib/           - Librerie esterne (se necessarie)
README.txt      - Questo file
autori.txt      - Informazioni autori progetto

================================================================================
INSTALLAZIONE:
================================================================================

1. Verificare l'installazione di Java:
   java -version
   
   (Deve essere Java 17 o superiore)

2. Creare la struttura delle directory:
   mkdir data
   mkdir bin
   mkdir doc

3. Copiare i file CSV nella directory data/:
   - ristoranti.csv
   - utenti.csv  
   - recensioni.csv
   - preferiti.CSV

================================================================================
COMPILAZIONE:
================================================================================

1. Dalla directory principale del progetto:
   
   Su Windows:
   javac -d bin -sourcepath src src/theknife/*.java

   Su macOS/Linux:
   javac -d bin -sourcepath src src/theknife/*.java

2. Creare il file JAR eseguibile:
   
   cd bin
   jar cfe TheKnife.jar theknife.TheKnife theknife/*.class

================================================================================
ESECUZIONE:
================================================================================

1. Dalla directory bin/:
   java -jar TheKnife.jar

   OPPURE dalla directory principale:
   java -cp bin theknife.TheKnife

2. L'applicazione creerà automaticamente i file dati se non esistenti
   e li popolerà con dati di esempio.

================================================================================
FUNZIONALITÀ PRINCIPALI:
================================================================================

UTENTI NON REGISTRATI:
- Visualizzare dettagli ristoranti
- Visualizzare recensioni
- Registrarsi come cliente o ristoratore
- Cercare ristoranti per località

CLIENTI REGISTRATI:
- Tutte le funzionalità degli utenti non registrati
- Gestire lista preferiti
- Scrivere, modificare ed eliminare recensioni
- Ricerca avanzata ristoranti

RISTORATORI REGISTRATI:
- Aggiungere nuovi ristoranti
- Visualizzare recensioni dei propri ristoranti
- Rispondere alle recensioni
- Visualizzare statistiche (media voti, numero recensioni)


================================================================================
FORMATO FILE DATI:
================================================================================

ristoranti.csv:
id,nome,nazione,citta,indirizzo,lat,lon,prezzo_medio,delivery,prenotazione,tipo_cucina,proprietario

utenti.csv:
nome;cognome;username;password;domicilio;ruolo;dataNascita

recensioni.csv:
id,ristorante_id,username,stelle,testo,risposta

preferiti.csv
username,password_hash,nome,cognome,data_nascita,domicilio,ruolo

================================================================================
RISOLUZIONE PROBLEMI:
================================================================================

1. Errore "Could not find or load main class":
   - Verificare che il file JAR sia nella directory bin/
   - Verificare che la struttura delle directory sia corretta

2. Errore di lettura file CSV:
   - Verificare che la directory data/ esista
   - Verificare che i file CSV siano codificati in UTF-8

3. Errore di compilazione:
   - Verificare la versione di Java (deve essere 17+)
   - Verificare che tutti i file .java siano nella directory src/theknife/

================================================================================
NOTE TECNICHE:
================================================================================

- L'applicazione utilizza file CSV per la persistenza dei dati
- Le password sono hash usando SHA-256
- L'interfaccia è testuale (console)
- Non supporta accesso concorrente ai dati
- I dati sono salvati automaticamente ad ogni modifica

Per supporto tecnico, consultare la documentazione JavaDoc nella directory doc/
