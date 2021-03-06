package core;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by chihebdaoues on 12/9/17.
 */
public interface TacheList {
    void ajouterTache(Tache tache);
    boolean supprimerTache(long id);
    boolean supprimerTache(Tache tache);
    void modifierTache(long id,String toModify,String newValue);
    Tache rechercherTache(long id);
    TacheList tacheSaye();
    TacheList tacheMazel();
    TacheList tacheTimeOut();
    List<Tache> getTacheList();
}
