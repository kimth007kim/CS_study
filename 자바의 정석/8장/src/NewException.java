public class NewException {
    public static void main(String[] args) {
        try{
           startInstall();
           copyFiles();
        } catch (SpaceException e) {
            System.out.println("에러메세지 : "+e.getMessage());
            e.printStackTrace();
        }
    }

    static void startInstall()  throws  SpaceException{
        if(!enoughSpace()){
            throw new SpaceException("설치 공간 부족");
        }  if(!enoughMemory()){
            throw new SpaceException("메모리 부족");
        }
    }

    private static class MemoryException extends Exception {
        MemoryException(String msg) {
            super(msg);
        }
    }

    private static class SpaceException extends Exception {
        SpaceException(String msg) {
            super(msg);
        }
    }
    static void copyFiles(){}
    static void deleteTemplate(){}

    static boolean enoughSpace(){
        return false;
    }
    static boolean enoughMemory(){
        return true;
    }
}

