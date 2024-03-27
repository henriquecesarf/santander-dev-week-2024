package me.dio.sdw24.adapters.in;

import io.swagger.v3.oas.annotations.tags.Tag;
import me.dio.sdw24.aplication.AskChampionsUseCase;

import org.springframework.web.bind.annotation.*;

@Tag(name = "Campeões",  description = "Endpoints do domínio de campeões de LOL.")
@RestController
@RequestMapping("/champions")
public record askChampionsRestController(AskChampionsUseCase useCase) {
    @PostMapping("/{championId}/ask")
    public AskChampionRequestResponse askChampion(@PathVariable Long championId, @RequestBody AskChampionRequest request) {
        String answer = useCase.askChampion(championId, request.question());
        return new AskChampionRequestResponse(answer);
    }

    public record AskChampionRequest(String question){};
    public record AskChampionRequestResponse(String answer){};
}
