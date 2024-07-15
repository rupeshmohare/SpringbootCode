package com.Springboot;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class Question {
    private int questionId;
    private String question;
    private List<String> listAnswers;
    private Set<String> setAnswers;
    private Map<Integer, String> mapAnswers;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getListAnswers() {
        return listAnswers;
    }

    public void setListAnswers(List<String> listAnswers) {
        this.listAnswers = listAnswers;
    }

    public Set<String> getSetAnswers() {
        return setAnswers;
    }

    public void setSetAnswers(Set<String> setAnswers) {
        this.setAnswers = setAnswers;
    }

    public Map<Integer, String> getMapAnswers() {
        return mapAnswers;
    }

    public void setMapAnswers(Map<Integer, String> mapAnswers) {
        this.mapAnswers = mapAnswers;
    }

    @Override
    public String toString() {
        return "Question ID: " + questionId + "\nQuestion: " + question +
               "\nList Answers: " + listAnswers +
               "\nSet Answers: " + setAnswers +
               "\nMap Answers: " + mapAnswers;
    }
}

