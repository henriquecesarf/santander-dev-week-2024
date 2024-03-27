package me.dio.sdw24.aplication;

import me.dio.sdw24.domain.exception.ChampioNotFoundException;
import me.dio.sdw24.domain.model.Champions;
import me.dio.sdw24.domain.ports.ChampionsRepository;

public record AskChampionsUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId , String question){

        Champions champion = repository.findById(championId).orElseThrow(() -> new ChampioNotFoundException(championId));
        String championContext = champion.generateContextByQuestion(question);
        // TODO: Evoluir a lógica de negócio para integração com ia's generativas para retorno.

        return championContext;
    }
}
