package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Match;

import java.util.List;

public interface IMatchService {

    public void insertar(Match match);

    List<Match> listar();

    public void delete(int id);

    public Match ListId(int id);
}
