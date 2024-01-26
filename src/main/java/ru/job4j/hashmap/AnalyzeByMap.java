package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0.0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                count++;
            }
        }
        return totalScore / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
            }
            score.add(new Label(pupil.name(), (double) scoreSum / pupil.subjects().size()));
        }
        return score;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        HashMap<String, Integer> scoreBySubject = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject: pupil.subjects()) {
                scoreBySubject.put(subject.name(), scoreBySubject.getOrDefault(subject.name(), 0)
                        + subject.score());
            }
        }

        List<Label> labels = new ArrayList<>();
        for (String key : scoreBySubject.keySet()) {
            labels.add(new Label((key), (double) scoreBySubject.get(key) / pupils.size()));
        }
        return labels;
    }

    public static Label sortToMax(List<Label> labels) {
        for (int i = 0; i < labels.size(); i++) {
            double min = labels.get(i).score();
            int minId = i;
            for (int j = i + 1; j < labels.size(); j++) {
                if (labels.get(j).score() < min) {
                    min = labels.get(j).score();
                    minId = j;
                }
            }
            Collections.swap(labels, i, minId);
        }
        return labels.get(labels.size() - 1);
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> score = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int scoreSum = 0;
            for (Subject subject : pupil.subjects()) {
                scoreSum += subject.score();
            }
            score.add(new Label(pupil.name(), scoreSum));
        }
        return sortToMax(score);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        HashMap<String, Integer> scoreBySubject = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject: pupil.subjects()) {
                scoreBySubject.put(subject.name(), scoreBySubject.getOrDefault(subject.name(), 0)
                        + subject.score());
            }
        }
        List<Label> labels = new ArrayList<>();
        for (String key : scoreBySubject.keySet()) {
            labels.add(new Label((key), scoreBySubject.get(key)));
        }
        return sortToMax(labels);
    }
}
