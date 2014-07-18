

package nsaug25;

import java.io.File;


public class Filename
{
private String fullPath;
//    private File fileFullPath;
  private char pathSeparator, extensionSeparator;

  public Filename(String str, char sep, char ext) {
    fullPath = str;
    pathSeparator = sep;
    extensionSeparator = ext;
  }

//    Filename(File sf, char c, char c0)
//    {
////        throw new UnsupportedOperationException("Not yet implemented");
//         fileFullPath = sf;
//    pathSeparator = c;
//    extensionSeparator = c0;
//
//    }

  public String extension() {
    int dot = fullPath.lastIndexOf(extensionSeparator);
    return fullPath.substring(dot + 1);
  }

  public String filename() { // gets filename without extension
    int dot = fullPath.lastIndexOf(extensionSeparator);
    int sep = fullPath.lastIndexOf(pathSeparator);
    return fullPath.substring(sep + 1, dot);
  }

  public String path() {
    int sep = fullPath.lastIndexOf(pathSeparator);
    return fullPath.substring(0, sep);
  }

}
