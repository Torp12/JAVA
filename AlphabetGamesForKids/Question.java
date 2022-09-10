package Alpha3;
public abstract class Question {
    private static String[] que = {"_PPLE", "C_OCOLATE","BA_ANA","CAND_","BIC_CLE","ZE_RA",
            "FL_WER","M_NGO", "COOK_E","HAP_Y"};
    private static String[] ans = {"A","H","N","Y","Y","B","O","A","I","P"};

    public static String getQue(int i) {
        return que[i];
    }

    public static String getAns(int i) {
        return ans[i];
    }
}