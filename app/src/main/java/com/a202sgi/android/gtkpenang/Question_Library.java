package com.a202sgi.android.gtkpenang;

public class Question_Library {
    private int[] mQuestions = {R.drawable.charkoaykak, R.drawable.charkoayteow,
            R.drawable.cheecheongfun, R.drawable.horfun,
            R.drawable.currymee
    };


    private String mChoices[][] = {
            {"Char Koay Kak", "Char Koay Teow", "Chee Cheong Fun","Nasi Lemak"},
            {"Roti Canai","Hor Fun","KangKung","Char Koay Teow"},
            {"Chee Cheong Fun","Laksa","Nasi Lemak","Cendol"},
            {"Roti Canai","Tom Yam","Hor Fun","Koay Teow Th'ng"},
            {"Red Soup Noodles","Dry Mee","Curry Mee","Hokkien Mee"}
    };

    private String mCorrectAnswers[]={"Char Koay Kak", "Char Koay Teow", "Chee Cheong Fun", "Hor Fun", "Curry Mee"};

    public int getQuestion(int a){
        int question = mQuestions[a];
        return question;
    }

    public String getChoicesA(int a){
        String choiceA = mChoices[a][0];
        return choiceA;
    }

    public String getChoicesB(int a){
        String choiceB = mChoices[a][1];
        return choiceB;
    }

    public String getChoicesC(int a){
        String choiceC = mChoices[a][2];
        return choiceC;
    }

    public String getChoicesD(int a){
        String choiceD = mChoices[a][3];
        return choiceD;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


