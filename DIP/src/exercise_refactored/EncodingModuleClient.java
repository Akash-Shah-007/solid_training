package exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
    	EncodingModule encodingModule = new EncodingModule();
        encodingModule.encode();
        encodingDatabase encodingDatabase = new encodingDatabase ();
        encodingDatabase.encode();
    }
}
