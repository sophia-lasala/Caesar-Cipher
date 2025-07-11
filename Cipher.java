public class Cipher {
    private String[] lowerAlphabet = new String[]{"a","b","c","d","e","f","g","h","i","j"
            ,"k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private String[] upperAlphabet = new String[]{"A","B","C","D","E","F","G","H","I","J"
            ,"K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private int index = -1;
    private boolean lowerCase;
    private int newIndex = -1;
    private int key = -1;

    public void indexFinder (String a){
        setIndex(-1);
        for (int i = 0; i < 26; i++){
            if (getLowerAlphabet(i).equals(a)){
                setIndex(i);
                setLowerCase(true);
            }
            else if (getUpperAlphabet(i).equals(a)){
                setIndex(i);
                setLowerCase(false);
            }
        }
    }

    public void keyCalculator (int index, int key){
        int total;
        if ((index + key < 26)){
            setNewIndex(index + key);
        }
        else{
            total = index + key;
            setNewIndex(total - 26);
        }
    }

    public String recursionKey (String string){

        if (string.isEmpty()){
            return "";
        }

        String firstChar = String.valueOf(string.charAt(0));
        indexFinder(firstChar);

        if (getIndex() == -1) {
            // Non-alphabet character; leave it unchanged
            return firstChar + recursionKey(string.substring(1));
        }

        keyCalculator(getIndex(), getKey());

        if (isLowerCase()) {
            firstChar = getLowerAlphabet(getNewIndex());
        } else {
            firstChar = getUpperAlphabet(getNewIndex());
        }

        return firstChar + recursionKey(string.substring(1));
    }

    public String getLowerAlphabet(int index) {
        return lowerAlphabet[index];
    }

    public void setLowerAlphabet(String[] lowerAlphabet) {
        this.lowerAlphabet = lowerAlphabet;
    }

    public String getUpperAlphabet(int index) {
        return upperAlphabet[index];
    }

    public void setUpperAlphabet(String[] upperAlphabet) {
        this.upperAlphabet = upperAlphabet;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isLowerCase() {
        return lowerCase;
    }

    public void setLowerCase(boolean lowerCase) {
        this.lowerCase = lowerCase;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
}
