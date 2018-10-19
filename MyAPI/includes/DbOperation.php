<?php

class DbOperation
{
    //Database connection link
    private $con;

    //Class constructor
    function __construct()
    {
        //Getting the DbConnect.php file
        require_once dirname(__FILE__) . '/DbConnect.php';

        //Creating a DbConnect object to connect to the database
        $db = new DbConnect();

        //Initializing our connection link of this class
        //by calling the method connect of DbConnect class
        $this->con = $db->connect();
    }

    /*
    * The create operation
    * When this method is called a new record is created in the database
    */
    function createLivre($id_livre, $titre_livre, $editeur_livre, $nb_mentions_livre,$description_livre, $id_auteur_livre){

        $stmt = $this->con->prepare("INSERT INTO livre (titre_livre, editeur_livre, nb_mentions_livre,description_livre,id_auteur_livre) VALUES (?, ?, ?, ?, ?)");
        $stmt->bind_param("ssis", $titre_livre, $editeur_livre, $nb_mentions_livre,$description_livre, $id_auteur_livre);
        if($stmt->execute())
            return true;
        return false;
    }

    /*
    * The read operation
    * When this method is called it is returning all the existing record of the database
    */
    function getLivres(){
        $stmt = $this->con->prepare("INSERT INTO livre (id_livre, titre_livre, editeur_livre, nb_mentions_livre,description_livre,id_auteur_livre) VALUES (?, ?, ?, ?, ?, ?)");
        $stmt->execute();
        $stmt->bind_result($id_livre, $titre_livre, $editeur_livre, $nb_mentions_livre,$description_livre, $id_auteur_livre);

        $Listlivre = array();

        while($stmt->fetch()){
            $livre  = array();
            $livre['id_livre'] = $id_livre;
            $livre['titre_livre'] = $titre_livre;
            $livre['editeur_livre'] = $editeur_livre;
            $livre['nb_mentions_livre'] = $nb_mentions_livre;
            $livre['description_livre'] = $description_livre;
            $livre['id_auteur_livre'] = $id_auteur_livre;

            array_push($Listlivre, $livre);
        }

        return $Listlivre;
    }

    /*
    * The update operation
    * When this method is called the record with the given id is updated with the new given values
    */
    function updateLivre($id_livre, $titre_livre, $editeur_livre, $nb_mentions_livre,$description_livre, $id_auteur_livre){
        $stmt = $this->con->prepare("UPDATE livre SET titre_livre = ?, editeur_livre = ?, nb_mentions_livre = ? , description_livre = ?, id_auteur_livre = ? WHERE id_livre = ?");
        $stmt->bind_param("ssisi",$id_livre, $titre_livre, $editeur_livre, $nb_mentions_livre,$description_livre, $id_auteur_livre);
        if($stmt->execute())
            return true;
        return false;
    }


    /*
    * The delete operation
    * When this method is called record is deleted for the given id
    */
    function deleteLivre($id_livre){
        $stmt = $this->con->prepare("DELETE FROM livre WHERE id_livre = ? ");
        $stmt->bind_param("i", $id_livre);
        if($stmt->execute())
            return true;

        return false;
    }
}
?>