package com.company;

import command.*;
import observer.Observer;
import observer.Trainer;
import observer.TrainerSubscriber;

public class Main {

    public static void main(String[] args) {

        Trainer trainer = new Trainer();
        Observer obs1 = new TrainerSubscriber("Spectator 01");
        Observer obs2 = new TrainerSubscriber("Spectator 02");
        Observer obs3 = new TrainerSubscriber("Spectator 03");

        trainer.subscribe(obs1);
        trainer.subscribe(obs2);
        trainer.subscribe(obs3);

        Exercise exercise = new Exercise();

        Command LieDownCommand = new LieDownCommand(exercise);
        Command StandUpCommand = new StandUpCommand(exercise);

        trainer.setTrainerExercise( LieDownCommand );
        trainer.setTrainerExercise( StandUpCommand );


    }
}
