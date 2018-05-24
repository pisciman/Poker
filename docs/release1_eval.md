# RELEASE TEAM:

1-GAMMA @sfemat,@umbertopollarini,@cavelierimelissa,@Alessio9284 [Torricelli],
2-BETA  @MrcSossy,@pisciman,@NicolaBellei,@basculante11 [Rusyn]

Questo team almeno a parole, ha mantenuto la struttura in due gruppi separati. Tuttavia, i due gruppi sembrano essersi parlati molto poco. Osservando i commit, la parte del leone è sicuramente di @sfemat (Sferruzza). I contributi di altri del gruppo GAMMA sembrano essere di gran lunga inferiori.

## ANALISI
Dal punto di vista operativo, il programma non va (nella sua versione attuale). Dal punto di vista strutturale ci sono ancora diversi problemi nella struttura dei moduli. I test non ci sono (o meglio, sono generati in modo automatico e non modificati)

Il Gruppo Beta sembra abbia contribuito meno. Si dice che abbia lavorato a Mano, ma non sembra e comunque non ci sono contributi visibili su GitHub.  

## VALUTAZIONI
Sfemat ha compiuto un buon lavoro e quindi è a posto. Cavalieri e Torricelli hanno fatto meno, diciamo il minimo sindacale, ma hanno un voto già molto definito. 
PIscitiello, Rusyn, Bellei hanno contribuito poco al lavoro e quindi c'è poco da dire ed anche il loto voto è molto definito. 
Per gli altri possiamo fornire un compito da portare a termine entro il 7 giugno in modo da ottenere quindi un miglioramento del voto proposto. 

## COMPITI
1. @Mrc: Supervisione generale. Il programma deve andare. Dato che si deve basare sul Classificatore, dovrà generare solo mani che il Classificatore è in grado controllare (al momento, non può generare doppie coppie e tris; magari lo farà in una versione futura). Il programma deve avviarsi, avere una interfaccia testuale decente (magari avere una stampa delle istruzioni del gioco, no?). Meglio ancora, avere uno script di avvio per windows e/o Linux. I main non hanno solitamente test, ma il programma deve essere strutturato in modo da essere testabile. E devono avere i Javadoc. 
2. @umbertopollarini: Rifattorizzare il generatore di casi. Deve fare in modo di generare solo Mani plausibili (può usare il Mazzo, oppure no, ma non devono essere impossibili). Inoltre il generatore deve essere parametrizzato, per cui se gli si dice "genera una coppia", deve generare una coppia e ci deve essere un test che verifica che sia una coppia. La verifica si basa su Classificatore, quindi deve generare solo tipi di mano che Classificatore può controllare. 
3. @Marcogianf (DA ALTRO GRUPPO): Rifattorizzare il main(). Deve essere strutturato in metodi che rendano possibile verificare che se l'utente risponde giusto, riceve un punto. Il punto deve essere visulizzato. Se risponde sbaglaito, non fa punti. Se risponde giusto 3 volte di file, il gioco termina. Tutti i metodi nuovi devono avere il loro Test, funzionante, non generato automaticamente. 
4. @Pisciman vedi nella parte grafica.
 
Come già detto, se non si vede il contributo su Github, il contributo non c'e. Meglio se usate commenti signficativi nei commit.



