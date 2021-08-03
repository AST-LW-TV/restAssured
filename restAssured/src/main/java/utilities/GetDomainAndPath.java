package utilities;

public class GetDomainAndPath {
    private static String[] fileNames;

    public static String[] getDomainAndPath(String[] temp) {
        fileNames = new String[]{"hostDomainPath", "resourceDomainPath"};
        for (int i = 0; i < fileNames.length; i++) {
            temp[i] = Config.getValue(fileNames[i], temp[i]);
        }
        return temp;
    }
}
