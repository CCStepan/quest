package com.javarush.quest.service;

import com.javarush.quest.model.QuestStep;

import java.util.HashMap;
import java.util.Map;

public class QuestService {
    private final Map<String, QuestStep> steps = new HashMap<>();

    public QuestService() {
        initSteps();
    }

    private void initSteps() {
        // Стартовый шаг
        steps.put("start", new QuestStep(
                "start",
                "Ты очнулся в странном месте и обнаружил необычный артефакт. Исследовать артефакт?",
                "Исследовать",
                "Игнорировать",
                "artifact",
                "lose1"
        ));

        // Второй шаг
        steps.put("artifact", new QuestStep(
                "artifact",
                "Артефакт излучает свет и приглашает тебя пройти сквозь портал. Войти в портал?",
                "Войти",
                "Оставить портал",
                "portal",
                "lose2"
        ));

        // Третий шаг
        steps.put("portal", new QuestStep(
                "portal",
                "Портал перенёс тебя в древнюю цивилизацию. Там тебя встречает мудрец. Расскажешь ему о своём происхождении?",
                "Сказать правду",
                "Скрыть правду",
                "wisdom",
                "lose3"
        ));

        // Четвёртый шаг
        steps.put("wisdom", new QuestStep(
                "wisdom",
                "Мудрец доверил тебе тайну великой силы. Использовать силу для добра?",
                "Да, использовать для добра",
                "Нет, сохранить для себя",
                "win",
                "lose4"
        ));

        // Победа
        steps.put("win", new QuestStep(
                "win",
                "Поздравляем! Ты стал героем древней цивилизации.",
                null,
                null,
                null,
                null
        ));

        // Потеря 1
        steps.put("lose1", new QuestStep(
                "lose1",
                "Ты проигнорировал артефакт и остался стоять на месте. Всё потеряно.",
                null,
                null,
                null,
                null
        ));

        // Потеря 2
        steps.put("lose2", new QuestStep(
                "lose2",
                "Ты отказался войти в портал и застрял навсегда в чуждом мире.",
                null,
                null,
                null,
                null
        ));

        // Потеря 3
        steps.put("lose3", new QuestStep(
                "lose3",
                "Ты скрыл правду, мудрец раскусил обман и изгнал тебя.",
                null,
                null,
                null,
                null
        ));

        // Потеря 4
        steps.put("lose4", new QuestStep(
                "lose4",
                "Ты захотел оставить силу себе и навлек катастрофу на мир.",
                null,
                null,
                null,
                null
        ));
    }

    public QuestStep getStep(String id) {
        return steps.get(id);
    }

    public boolean isFinalStep(String stepId) {
        QuestStep step = steps.get(stepId);
        return step != null && step.getOption1() == null;
    }

}
